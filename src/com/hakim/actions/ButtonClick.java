package com.hakim.actions;

import javax.swing.*;
import java.awt.Container;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonClick extends JFrame{
    private static ImageIcon frameIcon;
    private ImageIcon buttonIcon;
    private Container c;
    private JTextField textField;
    private Font textFieldFont;
    private JButton button;
    ButtonClick(){
        initContainer();
    }


    private void initContainer(){
        c=this.getContentPane();
        customizeContainer();
        customizeField();
       customizeButton();

       buttonAction();

        c.add(textField);
        c.add(button);

    }

    private void buttonAction(){
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                textField.setText("");
            }
        });
    }

    private void customizeContainer(){
        c.setLayout(null);
        c.setBackground(Color.gray);
        textFieldFont=new Font("Arial",Font.PLAIN,16);
        buttonIcon=new ImageIcon("D:\\java_code\\javaSwingAgain\\src\\com\\hakim\\images\\Windows-Close-Program-icon.png");
    }

    private void customizeField(){
        textField=new JTextField();
        textField.setBounds(20,20,200,30);
        textField.setFont(textFieldFont);
    }

    private void customizeButton(){
        button=new JButton();
        button.setBounds(20,60,100,30);
        button.setText("Clear");
        button.setIcon(buttonIcon);
    }


    public static void main(String[] args) {
        createFrame();
    }

    private static void createFrame(){
        ButtonClick frame=new ButtonClick();
        frameIcon=new ImageIcon("D:\\java_code\\javaSwingAgain\\src\\com\\hakim\\images\\Dictionary-icon.png");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,200,600,400);
        frame.setIconImage(frameIcon.getImage());
        frame.setTitle("Clear Text");
    }
}
