package com.hakim.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorButton extends JFrame{
    private Container c;
    private JTextField field;
    private JTextArea area;
    private JScrollPane scrollPane;
    ColorButton(){
        initContainer();
    }
    private void initContainer() {
        c = this.getContentPane();
        c.setLayout(null);
        field=new JTextField();
        area=new JTextArea();
        c.setBackground(Color.GRAY);
        scrollPane=new JScrollPane(area);

        field.setBounds(20,20,100,30);
        scrollPane.setBounds(20,60,200,200);

      area.setEditable(false);



        c.add(field);
        c.add(scrollPane);

    }
    public static void main(String[] args) {
        ColorButton checkBox=new ColorButton();

        checkBox.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window Opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window Closed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Window Iconified");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window Deiconified");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Window Activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window Deactivated");
            }
        });

        checkBox.setVisible(true);
        checkBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        checkBox.setBounds(400,100,500,400);
    }
}

/**
 * Mouse pressed
 * Mouse released
 * Mouse Clicked
 * Mouse Entered
 * Mouse Exited
 */

/**
 * Mouse Dragged
 * Mouse Moved
 */

/**
 * Focus gained
 * Focus Lost
 */