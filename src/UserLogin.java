import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class UserLogin extends Frame implements ActionListener {
Label lName =new Label("User");
TextField tName = new TextField();
Label lPass =new Label("User");
TextField tPass = new TextField();
Button btnConfirm =new Button("YES");

public UserLogin(String title) {
    super(title);
    setSize(300, 300);
    setLayout(null);
    lName.setBounds(60, 50, 70, 20);
    tName.setBounds(135, 50, 100, 20);
    lPass.setBounds(60, 90, 70, 20);
    tPass.setBounds(135, 90, 100, 20);
    tPass.setEchoChar('*');
    btnConfirm.setBounds(100, 140, 70, 20);
    btnConfirm.addActionListener(this);
    add(lName);
    add(tName);
    add(lPass);
    add(tPass);
    add(btnConfirm);
    setLocation(200, 100);
    setVisible(true);
}
    public void actionPerformed(ActionEvent e){

    Object ob =e.getSource();
    if (ob==btnConfirm){
        System.out.println("User:"+tName.getText());
        System.out.println("Pass:"+tPass.getText());
        JOptionPane.showMessageDialog(null, "登录成功");

    }else {

        JOptionPane.showMessageDialog(null, "用户或密码错误，请重新输入");

    }
    }


public static void main (String[] args){
    new UserLogin("Login");

}
}