package 蓝桥杯分类计算;
//本题总分：15 分
//【问题描述】
//输入一个字符串，请输出这个字符串包含多少个大写字母，多少个小写字母，多少个数字。
//【输入格式】
//输入一行包含一个字符串。
//【输出格式】
//输出三行，每行一个整数，分别表示大写字母、小写字母和数字的个数。
//【样例输入】
//1+a=Aab
//【样例输出】
//1
//3
//1
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] a1 = a.toCharArray();//字符串转数组，用于遍历
        int x = 0, y = 0, z = 0;
        for (int num=0; num < a1.length; num++) {//遍历数组
            if (a1[num] >= '0' && a1[num] <= '9') {//比对数组中是否含有0~9,<注意用的是单引号‘  ’>
                x += 1;
            } else if (a1[num] >= 'a' && a1[num] <= 'z') {//比对数组中是否含有a~z
                y += 1;
            } else if (a1[num] >= 'A' && a1[num] <= 'Z') {//比对数组中是否含有A~Z
                z += 1;
            }

        }
        System.out.println(z);
        System.out.println(y);
        System.out.println(x);
    }
    }

