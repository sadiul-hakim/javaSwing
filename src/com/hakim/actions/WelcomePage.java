package com.hakim.actions;

import javax.swing.*;
import java.awt.*;

public class WelcomePage extends JFrame {
    private static ImageIcon frameIcon;
    private Container c;
    private JLabel label;
    private Font font;
    private JTextArea ta;
    private JScrollPane pane;

    WelcomePage(){
        initContainer();
    }

    private void initContainer() {
        c = this.getContentPane();
        font=new Font("Fira Code",Font.BOLD+Font.ITALIC,20);

        customizeContainer();

        label=new JLabel("Welcome.");
        label.setBounds(50,50,200,50);
        label.setFont(font);


        ta=new JTextArea();
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);

        pane=new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        pane.setBounds(50,150,300,100);

        c.add(label);
        c.add(pane);

    }

    private void customizeContainer(){
        c.setBackground(Color.gray);
        c.setLayout(null);
    }

    public static void main(String[] args) {
        customizeFrame();
    }

    private static void customizeFrame(){
        WelcomePage frame=new WelcomePage();
        frameIcon=new ImageIcon("D:\\java_code\\javaSwingAgain\\src\\com\\hakim\\images\\Dictionary-icon.png");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(400,200,600,400);
        frame.setIconImage(frameIcon.getImage());
        frame.setTitle("Welcome page");
    }
}
