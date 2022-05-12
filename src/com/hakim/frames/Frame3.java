package com.hakim.frames;

import javax.swing.JFrame;

public class Frame3 extends JFrame{
        Frame3(){
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(200,100,300,200);
        }
    public static void main(String[] args) {
        Frame3 frame=new Frame3();
    }
}
