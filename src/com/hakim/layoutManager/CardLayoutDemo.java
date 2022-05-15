package com.hakim.layoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutDemo extends JFrame implements ActionListener {
    private Container c;
    private JButton btn1,btn2,btn3;
    private CardLayout cardLayout;
    private JPanel panel;

    @Override
    public void actionPerformed(ActionEvent e){
        cardLayout.previous(c);

    }

    CardLayoutDemo(){
        init();
    }

    private void init(){
        c=this.getContentPane();
        cardLayout=new CardLayout();
        c.setLayout(cardLayout);

        btn1=new JButton("One");
        btn2=new JButton("Two");
        btn3=new JButton("Three");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);


        c.add(btn1,"1");
        c.add(btn2,"2");
        c.add(btn3,"3");
    }


    public static void main(String[] args) {
        CardLayoutDemo frame=new CardLayoutDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,100,600,500);
    }
}
