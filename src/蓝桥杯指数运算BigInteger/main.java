package 蓝桥杯指数运算BigInteger;
//【问题描述】
//7 月 1 日是建党日，从 1921 年到 2020 年， 已经带领中国人民
//走过了 99 年。
//请计算：7 ^ 2020 mod 1921，其中 A mod B 表示 A 除以 B 的余数。
//【答案提交】
//这是一道结果填空题，你只需要算出结果后提交即可。本题的结果为一个
//整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。
//答案：480
import java.math.BigInteger;//导包

public class main {
    public static void main(String[] args) {
        BigInteger x = new BigInteger("7");
        BigInteger y = new BigInteger("1921");
        BigInteger z = x.pow(2020).remainder(y);
        System.out.println(z);
    }
}
//知识点总结
//pow(int exponent) 返回值为 (this^exponent)的BigInteger。指数形式
//remainder(BigInteger val) 返回一个值为 (this % val)的BigInteger。取余形式
//add(BigInteger val) 返回一个值为 (this + val)的BigInteger。加法
//subtract(BigInteger val) 返回值为 (this - val)的BigInteger。减法
//multiply(BigInteger val) 返回值为 (this * val)的BigInteger。乘法
//divide(BigInteger val) 返回值为 (this / val)的BigInteger。除法
//negate() 返回值为 (-this)的BigInteger。                   相反数
//max()方法，min()方法，分别是比较两个数的大小，例如a.max(b); 取a,b中的最大值
//equals()方法，判断两个大整数是否相等，例如c.equals(d) 相等就返回 true;
// BigInteger d=new BigInteger("48");                    构造方法