package com.hakim.frames;

import javax.swing.*;
import java.awt.*;

public class TextField extends JFrame {
    private Font font;
    private Container c;
    private JTextField tf1,tf2;
    private static ImageIcon containerIcon;
    TextField(){
        initContainer();
    }

    private void initContainer(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);


        font=new Font("Arial",Font.PLAIN + Font.ITALIC,14);

        tf1=new JTextField();
        tf2=new JTextField();

        tf1.setBounds(20,20,200,30);
        tf2.setBounds(20,60,200,30);

        tf1.setFont(font);
        tf2.setFont(font);

        tf1.setForeground(Color.BLACK);
        tf1.setBackground(Color.WHITE);

        tf2.setForeground(Color.BLACK);
        tf2.setBackground(Color.WHITE);

        tf1.setHorizontalAlignment(JTextField.RIGHT);
        tf2.setHorizontalAlignment(JTextField.CENTER);

        c.add(tf1);
        c.add(tf2);
    }

    public static void main(String[] args) {
        TextField textField=new TextField();
        containerIcon=new ImageIcon("D:\\java_code\\javaSwingAgain\\src\\com\\hakim\\images\\Dictionary-icon.png");
        textField.setVisible(true);
        textField.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textField.setBounds(400,200,400,300);
        textField.setTitle("Text Field");
        textField.setIconImage(containerIcon.getImage());

    }
}
