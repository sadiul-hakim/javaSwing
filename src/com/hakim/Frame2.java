package com.hakim;

import javax.swing.*;
import java.awt.Container;
import java.awt.Color;
import java.awt.Font;

public class Frame2 extends JFrame {
    private ImageIcon icon;
    private Container c;
    private JLabel userLabel;
    private JLabel passLabel;
    private Font font;
    Frame2(){
        setIcon();
        initComponents();
    }

    private void initComponents(){
        c=this.getContentPane();
        font=new Font("Arial",Font.BOLD,14);
        c.setLayout(null);
        c.setBackground(Color.gray);

        userLabel=new JLabel();
        userLabel.setText("Enter your name : ");
        userLabel.setBounds(10,10,150,30);
        userLabel.setFont(font);
        userLabel.setForeground(Color.blue);
        userLabel.setOpaque(true);
        userLabel.setBackground(Color.WHITE);
        c.add(userLabel);

        passLabel=new JLabel("Enter your password : ");
        passLabel.setBounds(10,40,150,30);
        passLabel.setForeground(Color.blue);
        passLabel.setOpaque(true);
        passLabel.setBackground(Color.WHITE);
        c.add(passLabel);
    }

    private void setIcon(){
        icon=new ImageIcon("D:\\java_code\\javaSwingAgain\\src\\com\\hakim\\Dictionary-icon.png");
        this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {
        Frame2 frame=new Frame2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setSize(400,300);
    }

}
