package com.hakim.actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private static ImageIcon frameIcon;
    private Container c;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton submitButton,clearButton;
    private Font fieldFont,buttonFont,labelFont;
    private JLabel emailLabel,passwordLabel;

    private String userEmail="hakim";
    private String userPassword="hakim";
    LoginFrame(){
        initContainer();
    }

    private void initContainer(){
        c=this.getContentPane();
        passwordField=new JPasswordField();
        emailField=new JTextField();
        submitButton=new JButton();
        clearButton=new JButton();
        emailLabel=new JLabel("Enter your email address : ");
        passwordLabel=new JLabel("Enter your Password : ");


        customizeContainer();
        customizeField();
        customizeButton();

        clearButtonAction();
        submitButtonAction();


        c.add(emailLabel);
        c.add(emailField);
        c.add(passwordLabel);
        c.add(passwordField);
        c.add(submitButton);
        c.add(clearButton);
    }

    private void submitButtonAction(){
        submitButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String email=emailField.getText();
                String password=passwordField.getText();

                if(email.equals(userEmail) && password.equals(userPassword)){
                    JOptionPane.showMessageDialog(null,"Successfully logged in.");
                    WelcomePage page=new WelcomePage();
                    page.setVisible(true);
                    page.setBounds(400,200,600,400);

                }else{
                    JOptionPane.showMessageDialog(null,"Invalid credentials","Dialog box",JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    private void clearButtonAction(){
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emailField.setText("");
                passwordField.setText("");
            }
        });
    }


    private void customizeContainer(){
        c.setBackground(Color.gray);
        c.setLayout(null);
    }


    private void customizeField(){
        fieldFont=new Font("Arial",Font.PLAIN,16);
        labelFont=new Font("Arial",Font.BOLD,14);

        passwordLabel.setFont(labelFont);
        emailField.setFont(labelFont);

        emailLabel.setBounds(20,20,200,30);
        emailField.setBounds(20,55,300,40);

        passwordLabel.setBounds(20,100,200,30);
        passwordField.setBounds(20,135,300,40);

        passwordField.setFont(fieldFont);
        emailField.setFont(fieldFont);

        passwordField.setEchoChar('*');

    }

    private void customizeButton(){
        buttonFont=new Font("Arial",Font.PLAIN,14);

        submitButton.setText("Login");
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
