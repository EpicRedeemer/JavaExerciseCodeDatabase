import java.util.ArrayList;
import java.util.Scanner;
public class zhujiemian {
    ArrayList<String> chenyuan = new ArrayList<>();
        public void zhuye(){
            System.out.println("------欢，应用处于开发迎进入YANG系统主界面调试阶段BEAT-----");
            System.out.println("1，成员管理界面");
            System.out.println("2.成员信息录入界面");
            System.out.println("3.管理员联系界面");
            System.out.println("4.退出系统");
            System.out.println("5.退出程序");
            System.out.println("-----请输入对应数字-----");
            Scanner scan =new Scanner(System.in);
            int xuanxiang = scan.nextInt();
            switch (xuanxiang){
                case 1 :System.out.println("-----执行成功-----");
                xinxi();break;
                case 2 :System.out.println("-----执行成功-----");
                luru();break;
                case 3 :System.out.println("-----执行成功-----");
                guanli();break;
                case 4 :System.out.println("-----执行成功-----");
                System.out.println("正在退出登录");
                denglu();break;
                case 5 :System.out.println("-----执行成功-----");
                System.out.println("正在结束程序");break;
            }
        }
        public void luru (){
            System.out.println("-----欢迎进入成员信息录入界面-----");
            System.out.println("请输入需要录入的信息总数，输入0则返回主界面");
                 Scanner scan =new Scanner(System.in);
                int num= scan.nextInt();
                if(num==0){
                    zhuye();
                }else {
                    for (int i=1;i<num+1;i++) {
                System.out.println("请输入第" + i + "个成员信息");
                Scanner scan1 = new Scanner(System.in);
                System.out.print("请输入成员姓名:");
                String name1 = scan1.next();
                System.out.print("请输入成员数据:");
                String shuju = scan1.next();
                System.out.print("请输入成员ID:");
                String id = scan1.next();
                chenyuan.add(id+"     "+name1 + "    " + shuju);
            }
            zhuye();
            }
        }
        public void xinxi (){
            System.out.println("序号   ID   成员姓名   成员数据");
            for (int i=0;i<chenyuan.size();i++){
                System.out.println(i+"     "+chenyuan.get(i));
            }
            System.out.println("输入0返回主界面");
            System.out.println("输入1进入信息删除界面");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            if (num==0){
                zhuye();
            }
            if(num==1){
                shanchu();
            }

        }
        public void guanli (){
            System.out.println("-----管理员联系信息-----");
            System.out.println("管理员：杨哲");
            System.out.println("联系电话：18676663292");
            System.out.println("输入0返回上一页");
            Scanner scan =new Scanner(System.in);
            int num = scan.nextInt();
            if (num==0){
                zhuye();
            }
        }
        public void denglu(){
            System.out.println("-----欢迎进入管理员调试系统-----");
            denglu s1 = new denglu();
            zhujiemian s2 = new zhujiemian();
            for(int i=3;i>=0;i--) {
                Scanner scan = new Scanner(System.in);
                System.out.print("请输入管理员账户：");
                String user1 = scan.next();
                System.out.print("请输入管理员密码：");
                String psd1 = scan.next();
                if (user1.equals(s1.getUser()) && psd1.equals(s1.getPassword())) {
                    System.out.println("登录成功，欢迎");
                    s2.zhuye();
                    break;
                }
                if (i==0){
                    System.out.println("登录失败，你的账户已被锁定，请与管理员取得联系");
                }
                else {
                    System.out.println("登录失败，你还有"+i+"次机会");
                }
            }
        }
        public void shanchu(){
            System.out.println("-----欢迎进入成员删除系统-----");
            System.out.println("目前仅支持通过序号删除信息，索引功能后续更新");
            System.out.println("请输入需要删除的数据个数");
            Scanner scan=new Scanner(System.in);
            int num = scan.nextInt();
            for (int i =0;i<num;i++) {
                System.out.print("请输入你需要删除的数据序号：");
                Scanner scan1 = new Scanner(System.in);
                int num1 = scan1.nextInt();
                String element = chenyuan.remove(num1 - i);
                System.out.println("---成员信息删除成功---");
            }
            System.out.println("---正在返回成员信息界面---");
            xinxi();
        }
    }
