package com.hakim.components;

import javax.swing.*;
import java.awt.*;

public class PanelDemo extends JFrame {
    private Container c;
    private Panel panel1,panel2;
    private JButton button1,button2,button3;
    private PanelDemo(){
        init();
    }

    private void init(){
        c=this.getContentPane();
        panel1=new Panel();
        panel2=new Panel();
        button1=new JButton("One");
        button2=new JButton("Two");
        button3=new JButton("Three");

        panel1.setBounds(50,100,250,250);
        panel2.setBounds(310,100,250,250);

        button1.setBounds(10,10,70,20);
        button2.setBounds(90,10,70,20);
        button3.setBounds(10,10,70,20);

        panel1.setBackground(Color.GREEN);
        panel2.setBackground(Color.GREEN);

        panel1.add(button1);
        panel1.add(button2);

        panel2.add(button3);

        c.setLayout(null);
        c.add(panel1);
        c.add(panel2);
    }
    public static void main(String[] args) {
        PanelDemo frame=new PanelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,100,600,500);
    }
}
