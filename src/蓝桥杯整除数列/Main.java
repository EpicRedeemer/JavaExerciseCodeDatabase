package 蓝桥杯整除数列;
//【问题描述】
//本题总分：15 分
//有一个序列，序列的第一个数是 n，后面的每个数是前一个数整除 2，请输
//出这个序列中值为正数的项。
//【输入格式】
//输入一行包含一个整数 n。
//【输出格式】
//输出一行，包含多个整数，相邻的整数之间用一个空格分隔，表示答案。
//【样例输入】
//20
//【样例输出】
//20 10 5 2 1
//【评测用例规模与约定】
//对于 80% 的评测用例，1 ≤ n ≤ 109。
//对于所有评测用例，1 ≤ n ≤ 1018。
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        while (true) {
            if (num1 > 0) {
                System.out.println(num1);
                num1 /= 2;
            } else {
                break;
            }
        }
    }
}


