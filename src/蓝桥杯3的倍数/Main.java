package 蓝桥杯3的倍数;
//问题描述+
//小蓝对 3 33 的倍数很感兴趣。现在他手头有三个不同的数 a , b , c ，他想知道，这三个数中是不是有两个数的和是 3 的倍数。
//例如，当 a = 3 , b = 4 , c = 6 时，可以找到 a 和 c 的和是 3 的倍数。
//例如，当 a = 3 , b = 4 , c = 7 时，没办法找到两个数的和是 3 的倍数。
//输入格式
//输入三行，每行一个整数，分别表示 a , b , c
//输出格式
//如果可以找到两个数的和是 3 的倍数，输出yes，否则输出no。
//测试样例1
//Input：
//3
//4
//6
//Output：
//yes
//测试样例2
//Input：
//3
//4
//7
//Output：
//no
//评测用例规模与约定
//对于所有评测用例，1 ≤ a ≤ b ≤ c ≤ 100 。
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        Scanner scan2 = new Scanner(System.in);
        int b = scan.nextInt();
        Scanner scan3 = new Scanner(System.in);
        int c = scan.nextInt();
        if (a +b % 3 == 0 || a + c % 3 == 0 || b + c %3==0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
