package com.hakim.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ColorButton extends JFrame{
    private Container c;
    private JTextField field;
    private JTextArea area;
    ColorButton(){
        initContainer();
    }
    private void initContainer() {
        c = this.getContentPane();
        c.setLayout(null);
        field=new JTextField();
        area=new JTextArea();
        c.setBackground(Color.GRAY);

        field.setBounds(20,20,100,30);
        area.setBounds(20,60,200,200);

      area.setEditable(false);

        field.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e){
                area.append("key pressed "+e.getKeyChar()+"\n");
            }

            @Override
            public void keyTyped(KeyEvent e){
                area.append("key typed "+e.getKeyChar()+"\n");
            }

            @Override
            public void keyReleased(KeyEvent e){
                area.append("key released "+e.getKeyChar()+"\n");

            }
        });

        c.add(field);
        c.add(area);

    }
    public static void main(String[] args) {
        ColorButton checkBox=new ColorButton();
        checkBox.setVisible(true);
        checkBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        checkBox.setBounds(400,100,500,400);
    }
}
