package 蓝桥杯整数分解;
//问题描述
//将 3 分解成两个正整数的和，有两种分解方法，分别是 3 = 1 + 2 和 3 = 2 + 1 。注意顺序不同算不同的方法。
//将 5 分解成三个正整数的和，有 6 种分解方法，它们是 1 + 1 + 3 = 1 + 2 + 2 = 1 + 3 + 1 = 2 + 1 + 2 = 2 + 2 + 1 = 3 + 1 + 1。
//请问，将 2021 分解成五个正整数的和，有多少种分解方法？
//答案提交
//这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。
import java.util.Arrays.*;
public class main {
    public static void main(String[] args) {
                long[][] dp = new long[6][2022];
                java.util.Arrays.fill(dp[1], 1);
                for (int k = 2; k <= 5; k++)
                    for (int i = k; i <= 2021; i++)
                        dp[k][i] = dp[k][i - 1] + dp[k - 1][i - 1];
                System.out.println(dp[5][2021]);
            }
        }
//原作答
   // public static void main(String[] args) {
    //    int num =0;
      //  for (int x=1;x<=2021;x++){

         //   for (int x1=x;x<=2021;x++){

           //     for (int x2=x1;x<=2021;x++){

           //         for (int x3=x2;x<=2021;x++){

            //            for (int x4=x3;x<=2021;x++){
             //               if(x+x1+x2+x3+x4==2021){
            //                    num++;
            //                }
            //            }
            //        }
           //     }
         //   }
     //   }
    //    System.out.println(num);
 //   }
//}
