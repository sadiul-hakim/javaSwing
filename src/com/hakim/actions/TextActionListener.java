package com.hakim.actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextActionListener extends JFrame {
    private ImageIcon frameIcon;
    private Container c;
    private JTextField nameField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private Font passwordFont;
    TextActionListener(){
        customizeFrame();
        initContainer();
    }
    private void customizeFrame(){
        frameIcon=new ImageIcon("D:\\java_code\\javaSwingAgain\\src\\com\\hakim\\images\\Dictionary-icon.png");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300,200,800,600);
        this.setIconImage(frameIcon.getImage());
        this.setTitle("Action Listener");
    }
    private void initContainer(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);
        passwordFont=new Font("Arial",Font.PLAIN,18);

        nameField=new JTextField();
        emailField=new JTextField();
        passwordField=new JPasswordField();

        nameField.setBounds(20,20,400,30);
        emailField.setBounds(20,60,400,30);
        passwordField.setBounds(20,100,400,30);

        nameField.setBackground(Color.WHITE);
        nameField.setForeground(Color.BLACK);
        nameField.setHorizontalAlignment(JTextField.CENTER);

        emailField.setBackground(Color.WHITE);
        emailField.setForeground(Color.BLACK);
        emailField.setHorizontalAlignment(JTextField.CENTER);

        passwordField.setBackground(Color.WHITE);
        passwordField.setForeground(Color.BLACK);
        passwordField.setHorizontalAlignment(JTextField.CENTER);

        Handler handler=new Handler();

        nameField.addActionListener(handler);
        emailField.addActionListener(handler);
        passwordField.addActionListener(handler);

        passwordField.setEchoChar('*');
        passwordField.setFont(passwordFont);
        passwordField.setBackground(Color.WHITE);
        passwordField.setForeground(Color.BLACK);


        c.add(nameField);
        c.add(emailField);
        c.add(passwordField);
    }

    class Handler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){

            if(e.getSource()==nameField){
                String name=nameField.getText();
                if(name.isEmpty()){
                    JOptionPane.showMessageDialog(null,"You did not entered anything","Diolog Box",JOptionPane.WARNING_MESSAGE);
                    return;
                }
                JOptionPane.showMessageDialog(null,"Name : "+name,"Dialog Box",JOptionPane.INFORMATION_MESSAGE);
            }else if(e.getSource()==emailField){
                String email=emailField.getText();
                if(email.isEmpty()){
                    JOptionPane.showMessageDialog(null,"You did not entered anything","Diolog Box",JOptionPane.WARNING_MESSAGE);
                    return;
                }
                JOptionPane.showMessageDialog(null,"Email : "+email,"Dialog Box",JOptionPane.INFORMATION_MESSAGE);
            }
//            else{
//                String password=passwordField.
//                if(password.isEmpty()){
//                    JOptionPane.showMessageDialog(null,"You did not entered anything","Diolog Box",JOptionPane.WARNING_MESSAGE);
//                    return;
//                }
//                JOptionPane.showMessageDialog(null,"You entered password of length "+password.length(),"Dialog Box",JOptionPane.INFORMATION_MESSAGE);
//            }
        }
    }

    public static void main(String[] args) {
        TextActionListener frame=new TextActionListener();
    }
}
