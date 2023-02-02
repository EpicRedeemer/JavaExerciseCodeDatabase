package 蓝桥杯格点;
//问题描述
//如果一个点 ( x , y ) 的两维坐标都是整数，即 x ∈ Z 且 y ∈ Z ，则称这个点为一个格点。
//如果一个点 ( x , y ) 的两维坐标都是正数，即 x > 0  且 y > 0  ，则称这个点在第一象限。
//请问在第一象限的格点中，有多少个点 ( x , y ) 的两维坐标乘积不超过 2021 ，即 x ⋅ y ≤ 2021。
//提示：建议使用计算机编程解决问题。
//答案提交
//这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。
//答案：15698
public class Main {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        int num3=0;
        for(int num=1;num<=2021;num++){//题目给出要求是第一象限，x>0,y>0，所以num不能从0开始。
            x=num;
            for(int num1=1;num1<=2021;num1++){
                y=num1;
                if (num*num1<=2021){
                    num3++;
                }
            }


        }
        System.out.println(num3);
    }
}
