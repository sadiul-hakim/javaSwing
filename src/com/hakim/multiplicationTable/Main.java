package com.hakim.multiplicationTable;

import javax.swing.*;

public class Main {
    private static ImageIcon frameIcon;
    public static void main(String[] args) {
        TableFrame frame=new TableFrame();
        frameIcon=new ImageIcon("D:\\java_code\\javaSwingAgain\\src\\com\\hakim\\multiplicationTable\\Dictionary-icon.png");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,50,350,700);
        frame.setIconImage(frameIcon.getImage());
    }
}
