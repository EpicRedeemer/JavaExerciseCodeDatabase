package ChatGPT接入;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;

public class chatGPT {

    public static void main(String[] args) {
        try {
            // 设置API密钥
            String apiKey = "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";

            // 设置代理
            String proxyHost = "117.251.103.168";
            int proxyPort = 8080;
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort));

            // 设置请求文本
            String text = "What is the capital of France?";

            // 创建请求URL
            URL url = new URL("https://api.openai.com/v1/engines/text-davinci-003/jobs");

            // 创建连接
            HttpURLConnection conn = (HttpURLConnection) url.openConnection(proxy);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Authorization", "Bearer " + apiKey);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            // 发送请求
            String requestData = "{\"prompt\": \"" + text + "\", \"max_tokens\": 100, \"temperature\": 0.5}";
            OutputStream os = conn.getOutputStream();
            os.write(requestData.getBytes());
            os.flush();

            // 读取响应
            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String response = "";
                String line;
                while ((line = br.readLine()) != null) {
                    response += line;
                }
                System.out.println(response);
            } else {
                System.out.println("Failed to call OpenAI API, response code: " + responseCode);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}