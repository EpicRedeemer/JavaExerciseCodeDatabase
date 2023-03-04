package 蓝桥杯走方格;
//本题总分：20 分
//【问题描述】
//在平面上有一些二维的点阵。
//这些点的编号就像二维数组的编号一样，从上到下依次为第 1 至第 n 行，
//从左到右依次为第 1 至第 m 列，每一个点可以用行号和列号来表示。
//现在有个人站在第 1 行第 1 列，要走到第 n 行第 m 列。只能向右或者向下走。
//注意，如果行号和列数都是偶数，不能走入这一格中。
//问有多少种方案。
//【输入格式】
//输入一行包含两个整数 n, m。
//【输出格式】
//输出一个整数，表示答案。
//【样例输入】
//3 4
//【样例输出】
//2
//【样例输入】
//6 6
//【样例输出】
//0
//【评测用例规模与约定】
//对于所有评测用例，1 ≤ n ≤ 30, 1 ≤ m ≤ 30。
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int x =scan.nextInt();
        int y= scan.nextInt();
        int a[][]=new int[x+1][y+1];
        //为x,y每一个单元格赋值为1.
        for (int num1=1;num1<=x;num1++){
            a[num1][1]=1;
        }
        for (int num2=1;num2<=y;num2++){
            a[1][num2]=1;
        }
        //遍历每一种方法
        for(int j=2;j<=x;j++){
            for (int t=2;t<=y;t++){
                //遇到要求跳出本次循环
                if (j%2==0&&t%2==0) {
                    continue;
                }else{ a[j][t] = a[j - 1][t] + a[j][t - 1];
                }

            }
        }
        System.out.println(a[x][y]);
    }
}
