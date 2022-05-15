package com.hakim.layoutManager;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame {
    private Container c;
    private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    private GridLayout gridLayout;
    GridLayoutDemo(){
        init();
    }
    private void init() {
        c = this.getContentPane();
        gridLayout=new GridLayout(2,2);

        c.setLayout(gridLayout);


        btn1=new JButton("One");
        btn2=new JButton("Two");
        btn3=new JButton("Three");
        btn4=new JButton("Four");
        btn5=new JButton("Five");
        btn6=new JButton("Six");
        btn7=new JButton("Seven");
        btn8=new JButton("Eight");

        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
        c.add(btn6);
        c.add(btn7);
        c.add(btn8);
    }
    public static void main(String[] args) {
        GridLayoutDemo frame=new GridLayoutDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,100,600,500);
    }
}
