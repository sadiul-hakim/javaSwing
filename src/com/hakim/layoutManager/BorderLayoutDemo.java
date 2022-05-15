package com.hakim.layoutManager;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {
    private Container c;
    private JPanel btn1,btn2,btn3,btn4,btn5;
    private BorderLayout borderLayout;
    BorderLayoutDemo(){
        init();
    }
    private void init(){
        c=this.getContentPane();
        borderLayout=new BorderLayout();
        borderLayout.setHgap(10);
        borderLayout.setVgap(10);
        c.setLayout(borderLayout);

        btn1=new JPanel();
        btn2=new JPanel();
        btn3=new JPanel();
        btn4=new JPanel();
        btn5=new JPanel();


        btn1.setBackground(Color.red);
        btn2.setBackground(Color.green);
        btn3.setBackground(Color.blue);
        btn4.setBackground(Color.orange);
        btn5.setBackground(Color.yellow);

        c.add(btn1,BorderLayout.NORTH);
        c.add(btn2,BorderLayout.SOUTH);
        c.add(btn3,BorderLayout.EAST);
        c.add(btn4,BorderLayout.WEST);
        c.add(btn5,BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        BorderLayoutDemo frame=new BorderLayoutDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,100,600,500);
    }
}
