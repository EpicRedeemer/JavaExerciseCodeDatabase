package 蓝桥杯双阶乘;
//问题描述
//一个正整数的双阶乘，表示不超过这个正整数且与它有相同奇偶性的所有正整数乘积。n 的双阶乘用 n!!表示。
//例如：
//3 ! ! = 3 × 1 = 3。
//8 ! ! = 8 × 6 × 4 × 2 = 384。
//11 ! ! = 11 × 9 × 7 × 5 × 3 × 1 = 10395。
//请问，2021!! 的最后 5 位（这里指十进制位）是多少？
//注意：2021!!=2021×2019×⋅⋅⋅×5×3×1。
//提示：建议使用计算机编程解决问题。
//答案提交
//这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。
//答案：59375
public class Main {
    public static void main(String[] args) {
        int num=1;
        for (int x=0;x<=2021;x++){
            if (x%2==0){
            } else if (x%2!=0) {
                num*=x;
                num = num % 100000;//写在这而不能写在循环外的原因是防止num超出int的长度
            }
        }
      //  num = num % 100000;
        System.out.println(num);
    }
}
