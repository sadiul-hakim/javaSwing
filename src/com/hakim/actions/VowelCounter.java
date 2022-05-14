package com.hakim.actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.List;

public class VowelCounter extends JFrame implements KeyListener, ActionListener {
    private Container c;
    private JTextArea textArea;
    private JLabel label;
    private Font textFont;
    private JScrollPane scrollbar;
    private JButton clearButton;
    private JLabel a,e,i,o,u,total;
    private Font resultFieldsFont;
    private Font titleLabelFont;

    private int numberOfA=0;
    private int numberOfE=0;
    private int numberOfI=0;
    private int numberOfO=0;
    private int numberOfU=0;
    private int totalNumberOfVowel=0;

    private Deque<Integer> codes=new ArrayDeque<>();


    @Override
    public void keyPressed(KeyEvent ex){
        if(ex.getSource()==textArea){

            int code=ex.getKeyCode();
            if(code != 8){
                codes.push(code);
            }
            if(code == 8 && !codes.isEmpty()){
                codes.pop();
            }
            System.out.println(codes);
            for(int sinCode:codes){
                switch (sinCode){
                    case 65->{
                        numberOfA+=1;
                        totalNumberOfVowel+=1;
                        codes.remove(65);
                    }
                    case 69->{
                        numberOfE+=1;
                        totalNumberOfVowel+=1;
                        codes.remove(69);
                    }
                    case 73->{
                        numberOfI+=1;
                        totalNumberOfVowel+=1;
                        codes.remove(73);
                    }
                    case 79->{
                        numberOfO+=1;
                        totalNumberOfVowel+=1;
                        codes.remove(79);
                    }
                    case 85->{
                        numberOfU+=1;
                        totalNumberOfVowel+=1;
                        codes.remove(85);
                    }
                }
            }

            a.setText("Number of A : "+numberOfA);
            e.setText("Number of E : "+numberOfE);
            i.setText("Number of I : "+numberOfI);
            o.setText("Number of O : "+numberOfO);
            u.setText("Number of U : "+numberOfU);
            total.setText("Number of Vowel : "+totalNumberOfVowel);


        }
    }

    @Override
    public void keyTyped(KeyEvent e){

    }

    @Override
    public void keyReleased(KeyEvent e){

    }

    @Override
    public void actionPerformed(ActionEvent ex){
        if(ex.getSource()==clearButton){
            textArea.setText("");

            numberOfI=0;
            numberOfE=0;
            numberOfU=0;
            numberOfA=0;
            numberOfO=0;
            totalNumberOfVowel=0;

            a.setText("Number of A : "+numberOfA);
            e.setText("Number of E : "+numberOfE);
            i.setText("Number of I : "+numberOfI);
            o.setText("Number of O : "+numberOfO);
            u.setText("Number of U : "+numberOfU);
            total.setText("Number of Vowel : "+totalNumberOfVowel);
        }
    }

    VowelCounter(){
        initContainer();
    }

    private void initContainer(){
        c=this.getContentPane();
        textArea=new JTextArea();
        label=new JLabel("Enter your text : ");
        scrollbar=new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        clearButton=new JButton("Clear");
        a=new JLabel("Number of A : "+numberOfA);
        e=new JLabel("Number of E : "+numberOfE);
        i=new JLabel("Number of I : "+numberOfI);
        o=new JLabel("Number of O : "+numberOfO);
        u=new JLabel("Number of U : "+numberOfU);
        total=new JLabel("Number of Vowel : "+totalNumberOfVowel);

        customizeContainer();
        customizeLabel();
        customizeScrollbar();
        customizeTextArea();
        customizeClearButton();
        customizeResultFields();

        c.add(label);
        c.add(scrollbar);
        c.add(clearButton);
        c.add(a);
        c.add(e);
        c.add(i);
        c.add(o);
        c.add(u);
        c.add(total);
    }

    private void customizeContainer(){
        c.setBackground(Color.gray);
        c.setLayout(null);
    }

    private void customizeLabel(){
        titleLabelFont=new Font("Fira Code",Font.PLAIN,16);

        label.setBounds(30,20,200,30);
        label.setFont(titleLabelFont);
        label.setForeground(Color.BLACK);
    }

    private void customizeScrollbar(){
        scrollbar.setBounds(30,60,400,100);
    }

    private void customizeTextArea(){
        textFont=new Font("Fira Code",Font.PLAIN,16);

        textArea.setEditable(true);
        textArea.setFont(textFont);

        textArea.addKeyListener(this);
    }

    private void customizeClearButton(){
        clearButton.setBounds(30,170,70,30);
        clearButton.addActionListener(this);

    }

    private void customizeResultFields(){
        resultFieldsFont=new Font("Fira Code",Font.PLAIN,14);

        a.setBounds(30,210,200,20);
        e.setBounds(30,240,200,20);
        i.setBounds(30,270,200,20);
        o.setBounds(30,300,200,20);
        u.setBounds(30,330,200,20);
        total.setBounds(30,360,200,20);

        a.setFont(resultFieldsFont);
        e.setFont(resultFieldsFont);
        i.setFont(resultFieldsFont);
        o.setFont(resultFieldsFont);
        u.setFont(resultFieldsFont);
        total.setFont(resultFieldsFont);

        total.setForeground(Color.BLACK);
    }

    public static void main(String[] args) {
        VowelCounter frame=new VowelCounter();
        frame.setVisible(true);
        frame.setBounds(400,100,600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
