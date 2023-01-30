package CSDN登录窗口程序;

import java.awt.*;

import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;


//LoginFrame 登陆窗口  功能 实现用户登陆 ,如果成功就跳转

//LoginFrame 继承于窗口类, 并实现ActionListener接口

public class LoginFrame extends JFrame implements ActionListener {

// 申明需要的组件


    JButton jb1, jb2,jb3,jb4;//按钮

    JTextField jtf1;//文本框

    JPasswordField jpf1;//密码框
    String user;
    String pass;
  register e1 =new register();
    arraylist a=new arraylist();
    String name2[]=new String[2];
    String userture="YANG";
    String passture="12345";
    public LoginFrame() {

// 窗口属性的设置

        setTitle("登陆窗");// 窗口标题

        setSize(300, 180);// 窗口大小

        setLocationRelativeTo(null);// 窗口居中

        setDefaultCloseOperation(EXIT_ON_CLOSE);// 关闭窗口则退出虚拟机

        setLayout(new FlowLayout());// 设置布局流式布局

        JPanel jp = new JPanel(new GridLayout(4, 1));// 设置面板为表格布局4行1列

// 第一行

        JPanel jp1 = new JPanel();

        JLabel jl1 = new JLabel("账号 ");

        jtf1 = new JTextField(12);

        jp1.add(jl1);

        jp1.add(jtf1);

        jp.add(jp1);

// 第二行

        JPanel jp2 = new JPanel();

        JLabel jl2 = new JLabel("密码 ");

        jpf1 = new JPasswordField(12);

        jp2.add(jl2);

        jp2.add(jpf1);

        jp.add(jp2);

// 第三行

        JPanel jp3 = new JPanel();

        jb1 = new JButton("登陆");

        jb1.addActionListener(this);// 添加动作响应器

        jb2 = new JButton("重置");

        jb2.addActionListener(this);// 添加动作响应器
        jb3 = new JButton("注册");

        jb3.addActionListener(this);// 添加动作响应器
        jb4 = new JButton("帮助");

        jb4.addActionListener(this);// 添加动作响应器

        jp3.add(jb1);

        jp3.add(jb2);
        jp3.add(jb3);
        jp3.add(jb4);

        jp.add(jp3);

// 第四行

        JPanel jp4 = new JPanel();

        JLabel jl3 = new JLabel("欢迎进入YANG管理系统");

        jl3.setForeground(Color.DARK_GRAY);

        jp4.add(jl3);

        jp.add(jp4);

        add(jp);
      //  a.nameIN();

    }

// 动作响应

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();// 根据动作命令,来进行分别处理

        if (cmd.equals("登陆")) {

            user = jtf1.getText();// 取得用户名

            pass = new String(jpf1.getPassword());// 取得密码

                for(int x =0;x<a.user.size();x++) {
                    if (user.equals(userture) && pass.equals(passture)) {// 判断是否登录成功

// 如果登录成功
                        JOptionPane.showMessageDialog(this, "right", "通知", 1);
                        setVisible(false);// 本窗口隐藏,

                        new MainFrame(user).setVisible(true);// 新窗口显示

                        dispose();//本窗口销毁,释放内存资源

                    } else {

//如果登录失败  弹出提示

                        JOptionPane.showMessageDialog(this, "账户或密码错误", "通知", 0);

                        clearText();//清空文本框 密码框的输入

                    }
                }


        } else if (cmd.equals("重置")) {

            clearText();

        } else if (cmd.equals("帮助")) {

            JOptionPane.showMessageDialog(this, "管理员联系电话：18676663292", "帮助", 0);

        }
     else if (cmd.equals("注册")) {

            new register().setVisible(true);//创建登录窗口,并可见

    }
    }


    public void clearText() {//清空文本框, 密码框的输入

        jtf1.setText("");

        jpf1.setText("");

    }

//main方法, 程序的入口

    public static void main(String[] args) {
        arraylist a=new arraylist();
        new LoginFrame().setVisible(true);//创建登录窗口,并可见
     //   a.nameIN();
    }

    public static class arraylist extends Component {
        ArrayList name = new ArrayList();
        ArrayList user= new ArrayList();
        ArrayList pass= new ArrayList();
        void nameIN(String x){
    name.add(x);
        }
        void userIN(){

        }
        void passIN(){

        }

    }

    public static class MainFrame extends JFrame {

        public MainFrame(String name) {

            setTitle("主窗口");//标题

            setSize(300, 260);//大小

            setLocationRelativeTo(null);//居中

            setDefaultCloseOperation(EXIT_ON_CLOSE);

            JPanel jp = new JPanel();

            JLabel jl1 = new JLabel("欢迎");

            JLabel jl2 = new JLabel(name);

            jl2.setForeground(Color.BLUE);//设置文本颜色

            JLabel jl3 = new JLabel("使用系统.");

            jp.add(jl1);

            jp.add(jl2);

            jp.add(jl3);

            add(jp, BorderLayout.NORTH);

           JTextArea jta = new JTextArea();

            jta.setLineWrap(true);

            jta.append("消息提示");

            jta.append(" 消息!通知~!");

            JScrollPane jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

            add(jsp);

            JPanel jp2 = new JPanel();

            JButton jb = new JButton("退出");

            jb.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {

                    System.exit(0);//退出

                }

            });

            jp2.add(jb);

            add(jp2,BorderLayout.SOUTH);

        }

    }

    public static class register extends JFrame implements ActionListener {
    // 申明需要的组件

        JButton jb1, jb2, jb3, jb4;//按钮

        JTextField jtf1,jtf2;//文本框

        JPasswordField jpf1;//密码框


        arraylist a=new arraylist();
        String name2[]=new String[2];
        public register() {

    // 窗口属性的设置

            setTitle("注册窗口");// 窗口标题

            setSize(300, 250);// 窗口大小

            setLocationRelativeTo(null);// 窗口居中

            setDefaultCloseOperation(EXIT_ON_CLOSE);// 关闭窗口则退出虚拟机

            setLayout(new FlowLayout());// 设置布局流式布局

            JPanel jp = new JPanel(new GridLayout(5, 1));// 设置面板为表格布局4行1列

    // 第一行

            JPanel jp1 = new JPanel();

            JLabel jl1 = new JLabel("欢迎进入YANG管理系统注册界面");

            jl1.setForeground(Color.DARK_GRAY);

            jp1.add(jl1);

            jp.add(jp1);

            add(jp);
            JPanel jp5 = new JPanel();

            JLabel jl5 = new JLabel("用户名");

           jtf2 = new JTextField(12);

            jp5.add(jl5);

            jp5.add(jtf2);

            jp.add(jp5);

            JPanel jp4 = new JPanel();

            JLabel jl3 = new JLabel("账号  ");

            jtf1 = new JTextField(12);

            jp4.add(jl3);

            jp4.add(jtf1);

            jp.add(jp4);

    // 第二行

            JPanel jp2 = new JPanel();

            JLabel jl2 = new JLabel("密码 ");

            jpf1 = new JPasswordField(12);

            jp2.add(jl2);

            jp2.add(jpf1);

            jp.add(jp2);

    // 第三行

            JPanel jp3 = new JPanel();

            jb1 = new JButton("注册");

            jb1.addActionListener(this);// 添加动作响应器

            jb2 = new JButton("退出");

            jb2.addActionListener(this);// 添加动作响应器
            jb3 = new JButton("注册");

            jb3.addActionListener(this);// 添加动作响应器
            jb4 = new JButton("帮助");

            jb4.addActionListener(this);// 添加动作响应器

            jp3.add(jb1);

            jp3.add(jb2);
            //jp3.add(jb3);
            jp3.add(jb4);

            jp.add(jp3);

    // 第四行


        }

        public void actionPerformed(ActionEvent e) {

            String cmd = e.getActionCommand();// 根据动作命令,来进行分别处理
            if (cmd.equals("注册")) {
               String name =jtf2.getText();
               name2[0]=name;
               String user = jtf1.getText();// 取得用户名

                a.user.add(user);
              String  pass = new String(jpf1.getPassword());// 取得密码

                a.pass.add(pass);

                //System.out.println("集合的长度：" + a.name.get(0));

                    JOptionPane.showMessageDialog(this, "注册成功", "通知", 1);
                    setVisible(false);// 本窗口隐藏,

                new LoginFrame().setVisible(true);// 新窗口显示
               // a.nameIN();
                    dispose();//本窗口销毁,释放内存资源


            } else if (cmd.equals("退出")) {

                new LoginFrame().setVisible(true);
                dispose();//本窗口销毁,释放内存资源

            } else if (cmd.equals("帮助")) {

                JOptionPane.showMessageDialog(this, "管理员联系电话：18676663292", "帮助", 0);

            }
        }

        private void clearText() {//清空文本框, 密码框的输入

            jtf1.setText("");
            jtf2.setText("");
            jpf1.setText("");

        }






    }
}


// 申明需要的组件



