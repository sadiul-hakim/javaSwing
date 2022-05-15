package com.hakim.layoutManager;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemo extends JFrame {
    private Container c;
    private JButton btn1,btn2,btn3,btn4,btn5;
    private BoxLayout boxLayout;
    BoxLayoutDemo(){
        init();
    }
    private void init() {
        c = this.getContentPane();
        boxLayout=new BoxLayout(c,BoxLayout.X_AXIS);
        c.setLayout(boxLayout);


        btn1=new JButton("One");
        btn2=new JButton("Two");
        btn3=new JButton("Three");
        btn4=new JButton("Four");
        btn5=new JButton("Five");

        c.add(btn1);
        c.add(Box.createHorizontalStrut(10));
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
    }
    public static void main(String[] args) {
        BoxLayoutDemo frame=new BoxLayoutDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,100,600,500);
    }
}
