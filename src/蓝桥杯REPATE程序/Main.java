package 蓝桥杯REPATE程序;
//附件 prog.txt 中是一个用某种语言写的程序。
//其中 REPEAT k 表示一个次数为 k 的循环。循环控制的范围由缩进表达，
//从次行开始连续的缩进比该行多的（前面的空白更长的）为循环包含的内容。
//例如如下片段：
//REPEAT2:
// A=A+4
//  REPEAT5:
//     REPEAT6:
//        A=A+5
//     A=A+7
//   A=A+8
//A=A+9
//该片段中从A = A + 4 所在的行到 A = A + 8 所在的行都在第一行的循环两次中。
//REPEAT 6: 所在的行到 A = A + 7 所在的行都在 REPEAT 5: 循环中。
//A = A + 5 实际总共的循环次数是 2 × 5 × 6 = 60 次。
//请问该程序执行完毕之后，A 的值是多少？
//【答案提交】
//这是一道结果填空题，你只需要算出结果后提交即可。本题的结果为一个
//整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。
//答案：408
public class Main {
    public static void main(String[] args) {
        int a=0;
        for (int num = 0; num < 2; num++) {
            a=a+4;
            for (int num1 = 0; num1 < 5; num1++) {
                for (int num2 = 0; num2 < 6; num2++) {
                    a = a + 5;
                }
                a = a + 7;
            }
            a=a+8;
                }
        a=a+9;
        System.out.println(a);
            }
        }


