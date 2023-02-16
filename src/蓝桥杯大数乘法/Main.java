package 蓝桥杯大数乘法;
//题目解析https://blog.csdn.net/CodingFire/article/details/126556799
//看作普通乘法，“/”为取前一位，“%”为取末位。
public class Main {
    public static void main(String[] args) {
        int x=87654321;int y=12345678; int r[] = new int[4];
    
            int base = 10000;
            int x2 = x / base;
            int x1 = x % base;
            int y2 = y / base;
            int y1 = y % base;

            int n1 = x1 * y1;
            int n2 = x1 * y2;
            int n3 = x2 * y1;
            int n4 = x2 * y2;

            r[3] = n1 % base;
            r[2] = n1 / base + n2 % base + n3 % base;
            r[1] = n2 / base + n3 / base + n4 % base;
            r[0] = n4 / base;

            r[1] += r[2] / base;
            r[2] = r[2] % base;
            r[0] += r[1] / base;
            r[1] = r[1] % base;
            

            System.out.printf("%d%d%d%d\n", r[0], r[1], r[2], r[3]);

     
    }
}
