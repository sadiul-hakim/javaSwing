package com.hakim.frames;

import javax.swing.JFrame;

public class Frame {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        frame.setSize(400,300);
//        frame.setLocationRelativeTo(null);
//        frame.setLocation(500,200);
        frame.setTitle("This is title");
        frame.setResizable(true);
        frame.setBounds(500,200,400,300);
    }

}
