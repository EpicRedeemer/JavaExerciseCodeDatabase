package 状态转移方程算法;
//01背包
//播报
//编辑
//讨论
//上传视频
//数学问题
//01背包是在M件物品取出若干件放在空间为W的背包里，每件物品的体积为W1，W2至Wn，与之相对应的价值为P1,P2至Pn。01背包是背包问题中最简单的问题。
//01背包的约束条件是给定几种物品，每种物品有且只有一个，并且有权值和体积两个属性。在01背包问题中，因为每种物品只有一个，对于每个物品只需要考虑选与不选两种情况。
//如果不选择将其放入背包中，则不需要处理。如果选择将其放入背包中，由于不清楚之前放入的物品占据了多大的空间，需要枚举将这个物品放入背包后可能占据背包空间的所有情况。
//方程格式：f[i][v]=max{f[i-1][v],f[i-1][v-c[i]]+w[i]}
//例题：
//装箱问题
//描述 Description ：
//有一个箱子容量为V（正整数，0≤V≤20000），同时有n个物品（0小于n≤30），每个物品有一个体积（正整数）。要求从n个物品中，任取若干个装入箱内，使箱子的剩余空间为最小。
//输入v，n，在输入n个物品。
//输出箱子的剩余空间为最小。
//输入 Input ：
//24 （一个整数，表示箱子容量）
//6 （一个整数 [ 即n ] ，表示有n个物品）
//8 （接下来n行，分别表示这n个物品的各自体积。）
//3
//12
//7
//9
//7
//输出 Output
//0 （ 一个整数，表示箱子剩余空间。）
//分析
//转化为01背包，认为每个物品的价值相等，用0/1背包求出价值最大值，在用空间减去价值最大值即可
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int v, n, k;
        int a[]=new int[31];

 Scanner scan = new Scanner(System.in);
 v= scan.nextInt();
 n= scan.nextInt();
            for (int i = 1; i <= n; i++) {
                a[i] = scan.nextInt();
            }
        boolean f[]=new boolean [20001];
            f[0] = true;
            for (int i = 1; i <= n; i++) {
                for (int j = v; j >= a[i]; j--) {
                    if (!f[j] && f[j - a[i]])
                        f[j] = true;
                }
            }
            for (k = v; k > 1 && !f[k]; k--);
System.out.print(v-k);
    }
}
//C++格式：
//#include<iostream>
//int v, n, i, j, k, a[31];
//bool f[20001];
//int main()
//{
//    using namespace std;
//    cin >> v >> n;
//    for (int i = 1; i <= n; i++)
//        cin >> a[i];
//    f[0] = 1;
//    for (int i = 1; i <= n; i++)
//        for (int j = v; j >= a[i]; j--)
//            if (!f[j] && f[j - a[i]])
//                f[j] = 1;
//    for (k = v; k > 1 && !f[k]; k--);
//    cout << v - k << endl;
//    return 0;
//}