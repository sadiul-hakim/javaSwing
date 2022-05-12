package com.hakim.actions;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {
    private static ImageIcon frameIcon;
    private Container c;
    private JTextField nameField,emailField;
    private JButton submitButton,clearButton;
    private Font fieldFont,buttonFont,labelFont;
    private JLabel nameLabel,emailLabel;
    LoginFrame(){
        initContainer();
    }

    private void initContainer(){
        c=this.getContentPane();
        nameField=new JTextField();
        emailField=new JTextField();
        submitButton=new JButton();
        clearButton=new JButton();
        nameLabel=new JLabel("Enter your name : ");
        emailLabel=new JLabel("Enter your email address : ");

        customizeContainer();
        customizeField();
        customizeButton();

        c.add(nameLabel);
        c.add(nameField);
        c.add(emailLabel);
        c.add(emailField);
        c.add(submitButton);
        c.add(clearButton);
    }

    private void customizeContainer(){
        c.setBackground(Color.gray);
        c.setLayout(null);
    }


    private void customizeField(){
        fieldFont=new Font("Arial",Font.PLAIN,16);
        labelFont=new Font("Arial",Font.BOLD,14);

        nameLabel.setFont(labelFont);
        emailField.setFont(labelFont);

        nameLabel.setBounds(20,20,200,30);
        nameField.setBounds(20,55,300,40);

        emailLabel.setBounds(20,100,200,30);
        emailField.setBounds(20,135,300,40);

        nameField.setFont(fieldFont);
        emailField.setFont(fieldFont);

    }

    private void customizeButton(){
        buttonFont=new Font("Arial",Font.PLAIN,14);

        submitButton.setText("Submit");
        clearButton.setText("Clear");

        submitButton.setBounds(20,180,100,30);
        clearButton.setBounds(130,180,100,30);

        submitButton.setFont(buttonFont);
        clearButton.setFont(buttonFont);
    }

    public static void main(String[] args) {
        customizeFrame();
    }

    private static void customizeFrame(){
        LoginFrame frame=new LoginFrame();
        frameIcon=new ImageIcon("D:\\java_code\\javaSwingAgain\\src\\com\\hakim\\images\\Dictionary-icon.png");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,200,600,400);
        frame.setIconImage(frameIcon.getImage());
        frame.setTitle("Login Page");
    }
}
