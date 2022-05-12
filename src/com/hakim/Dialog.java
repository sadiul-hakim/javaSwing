package com.hakim;

import javax.swing.*;

public class Dialog {
    public static void main(String[] args) {
        ImageIcon icon=new ImageIcon("D:\\java_code\\javaSwingAgain\\src\\com\\hakim\\regex-tutorial.png");
        String name=JOptionPane.showInputDialog(null,"Enter your name","Title",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Your name is "+name);
        int option=JOptionPane.showConfirmDialog(null,"Do you want to quite","Title",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,icon);

        if(option==JOptionPane.YES_OPTION){
            System.exit(0);
        }else{
            System.out.println("You clicked NO Button.");
        }
    }
}
