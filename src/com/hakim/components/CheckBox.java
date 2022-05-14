package com.hakim.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBox extends JFrame implements ActionListener{
    private Container c;
    private JComboBox comboBox;
    private JLabel label;
    private JButton button;
    private final String[] names={"C","Java","JavaScript","php","python"};

    CheckBox(){
        initContainer();
    }

    private void initContainer(){
        c=this.getContentPane();
        comboBox=new JComboBox<String>(names);
        label=new JLabel("Nothing");
        button=new JButton("Show");

        comboBox.setBounds(20,20,100,30);
        label.setBounds(20,60,200,30);
        button.setBounds(20,100,200,40);

        comboBox.setEditable(true);

        comboBox.setSelectedItem("Java");

        //TODO: way No:3 of listening to a action
        //1. implement actionListener interface
        //2. Override all methods



//        Handler handler=new Handler();

        //TODO : way No:2 of Listening to action
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String language=comboBox.getSelectedItem().toString();
//                label.setText("You selected "+language);
//            }
//        });

        button.addActionListener(this);

        c.setLayout(null);


        c.add(comboBox);
        c.add(label);
        c.add(button);
    }

    //TODO : One way of Listening to action
//    class Handler implements ItemListener {
//        @Override
//        public void itemStateChanged(ItemEvent e){
//
//        }
//    }


    @Override
    public void actionPerformed(ActionEvent e){
        String lang=comboBox.getSelectedItem().toString();
        label.setText("You selected "+lang);
    }

    public static void main(String[] args) {
        CheckBox checkBox=new CheckBox();
        checkBox.setVisible(true);
        checkBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        checkBox.setBounds(400,100,500,400);
    }
}
