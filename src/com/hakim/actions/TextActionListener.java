package com.hakim.actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextActionListener extends JFrame {
    private ImageIcon frameIcon;
    private ImageIcon deleteButtonIcon;
    private ImageIcon submitButtonIcon;
    private Container c;
    private JTextField nameField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private Font passwordFont;
    private Font buttonFont;
    private JButton submitButton;
    private JButton clearButton;
    private Cursor cursor;

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
        buttonFont=new Font("Arial",Font.PLAIN,16);
        cursor=new Cursor(Cursor.HAND_CURSOR);
        deleteButtonIcon=new ImageIcon("D:\\java_code\\javaSwingAgain\\src\\com\\hakim\\images\\Windows-Close-Program-icon.png");
        submitButtonIcon=new ImageIcon("D:\\java_code\\javaSwingAgain\\src\\com\\hakim\\images\\email-send-icon.png");

        nameField=new JTextField();
        emailField=new JTextField();
        passwordField=new JPasswordField();
        submitButton=new JButton();
        clearButton=new JButton();

        nameField.setBounds(20,20,400,30);
        emailField.setBounds(20,60,400,30);
        passwordField.setBounds(20,100,400,30);
        submitButton.setBounds(20,140,150,30);
        clearButton.setBounds(160,140,150,30);

        submitButton.setText("Submit");
        clearButton.setText("Clear");

//        submitButton.setBackground(Color.GREEN);
//        submitButton.setForeground(Color.WHITE);
        submitButton.setCursor(cursor);
        submitButton.setIcon(submitButtonIcon);

//        clearButton.setBackground(Color.RED);
//        clearButton.setForeground(Color.WHITE);
        clearButton.setCursor(cursor);
        clearButton.setIcon(deleteButtonIcon);

        submitButton.setFont(buttonFont);
        clearButton.setFont(buttonFont);

        nameField.setBackground(Color.WHITE);
        nameField.setForeground(Color.BLACK);
        nameField.setHorizontalAlignment(JTextField.LEFT);

        emailField.setBackground(Color.WHITE);
        emailField.setForeground(Color.BLACK);
        emailField.setHorizontalAlignment(JTextField.LEFT);

        passwordField.setBackground(Color.WHITE);
        passwordField.setForeground(Color.BLACK);
        passwordField.setHorizontalAlignment(JTextField.LEFT);

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
        c.add(submitButton);
        c.add(clearButton);
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
