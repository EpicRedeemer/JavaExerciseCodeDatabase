package 蓝桥杯指数运算igInteger;

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