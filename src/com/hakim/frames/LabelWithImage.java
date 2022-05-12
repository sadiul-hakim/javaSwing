package com.hakim.frames;

import javax.swing.*;
import java.awt.*;

public class LabelWithImage extends JFrame {
    private Container container;
    private ImageIcon icon;
    private JLabel label;
    private Image image;
    LabelWithImage(){
        createFrame();
        initContainer();
    }

    private void createFrame(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400,200,400,300);
    }

    private void initContainer(){
        container=this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.gray);


        icon=new ImageIcon("D:\\java_code\\javaSwingAgain\\src\\com\\hakim\\images\\Matte-Library-icon.png");
        label=new JLabel("Enter name :",icon,JLabel.CENTER);
//        label.setIcon(icon);
        label.setBounds(20,20,150,70);

        container.add(label);
    }



    public static void main(String[] args) {
        LabelWithImage frame=new LabelWithImage();
    }
}
