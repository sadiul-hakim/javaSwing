package com.hakim.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButton extends JFrame {
    private Container c;
    private JRadioButton male,female;
    private ButtonGroup group;
    private Font font;
    private JTextArea area;
    private JCheckBox checkBox;
    RadioButton(){
        init();
    }

    private void init(){
        c=this.getContentPane();
       male=new JRadioButton();
       female=new JRadioButton();
        c.setLayout(null);
        group=new ButtonGroup();
        font=new Font("Arial",Font.BOLD,14);
        area=new JTextArea();
        checkBox=new JCheckBox("Do you agree with all the terms?",true);




        male.setText("Male");
        female.setText("Female");

        male.setBounds(20,100,100,20);
        female.setBounds(130,100,200,20);
        checkBox.setBounds(20,130,300,30);
        area.setBounds(20,170,300,200);

        area.setEditable(false);



        male.setFont(font);
        female.setFont(font);

        Handler handler=new Handler();
        male.addActionListener(handler);
        female.addActionListener(handler);
        checkBox.addActionListener(handler);



        c.add(male);
        c.add(female);
        c.add(area);
        c.add(checkBox);

        group.add(male);
        group.add(female);

    }

    class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==male){
                area.setText("");
                checkBox.setSelected(false);
                area.setText("You selected male");
            }else if(e.getSource()==female){
                area.setText("");
                checkBox.setSelected(false);
                area.setText("You selected female");
            }else if(e.getSource()==checkBox){
                area.append("\n");
                area.append("You agreed all the terms.");
            }
        }
    }


    public static void main(String[] args) {
        RadioButton frame=new RadioButton();
        frame.setVisible(true);
        frame.setBounds(400,100,600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
