package 蓝桥杯字符串编码;
//本题总分：25 分
//【问题描述】
//小明发明了一种给由全大写字母组成的字符串编码的方法。
//对于每一个大写字母，小明将它转换成它在 26 个英文字母中序号，
//即 A → 1, B → 2, … Z →26。
//这样一个字符串就能被转化成一个数字序列：
//比如 ABCXYZ → 123242526。
//现在给定一个转换后的数字序列，小明想还原出原本的字符串。
//当然这样的还原有可能存在多个符合条件的字符串。小明希望找出其中字典序最大的字符串。
//【输入格式】
//一个数字序列。
//【输出格式】
//一个只包含大写字母的字符串，代表答案
//【样例输入】
//123242526
//【样例输出】
//LCXYZ
//【评测用例规模与约定】
//对于 20% 的评测用例，输入的长度不超过 20。
//对于所有评测用例，输入的长度不超过 200000。
import java.awt.datatransfer.DataFlavor;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n=97;

        char c= (char) n;
        System.out.println(c);
        Scanner in = new Scanner(System.in);
        String a = in.next();
        char[] a1 = a.toCharArray();
        for (int x = 0; x < a1.length; x++) {
            if (a1[x]>='1'&&a1[x]<='2') {
                if(a1[x]=='2'&&a1[x+1]<='6'){
                    int b = (a1[x] + a1[x + 1]);
                    char b1 = (char) (a1[x] + a1[x + 1]+96);
                    System.out.println(b);
                }
            char b1 = (char) (a1[x] + a1[x + 1]+96);
                int b = (a1[x] + a1[x + 1]);
            System.out.println(b);
             } else if (a1[x]=='0'){
                char b2 = (char) (a1[x] + a1[x + 1]+96);
                int b = (a1[x] + a1[x + 1]);
                System.out.println(b);
            }
        }
    }
}
//package action;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class demo {
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		char[] c = input.next().toCharArray();
//		input.close();
//		int n = c.length;
//		List<String> list = new ArrayList<>();
//		int i = 0;
//		while (i < n) {
//			if (c[i] == '0') {
//				i++;
//				continue;
//			}
//			if (i + 1 < n) {
//				int a = Integer.parseInt("" + c[i] + c[i + 1]);
//				if (a < 27) {
//					list.add("" + (char) (a + 'A' - 1));
//					i += 2;
//				} else {
//					list.add("" + (char) (Integer.parseInt(c[i] + "") + 'A' - 1));
//					i++;
//				}
//			} else {
//				list.add("" + (char) (Integer.parseInt(c[i] + "") + 'A' - 1));
//				i++;
//			}
//		}
//		for (int k = 0; k < list.size(); k++) {
//			System.out.print(list.get(k));
//		}
//	}
//}
