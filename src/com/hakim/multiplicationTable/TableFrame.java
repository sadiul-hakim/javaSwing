package com.hakim.multiplicationTable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TableFrame extends JFrame {
    private Font resultFont;
    private Container c;
    private static ImageIcon frameIcon;
    private ImageIcon labelImage;
    private JLabel imageLabel;
    private JTextField textField;
    private JButton clearButton;
    private Font fieldFont;
    private Cursor cursor;
    private JTextArea result;
    TableFrame(){
        initContainer();
    }

    private void initContainer(){
        c=this.getContentPane();
        imageLabel=new JLabel();
        textField=new JTextField();
        result=new JTextArea();
        clearButton=new JButton();

        customizeCContainer();
        customizeImageLabel();
        customizeTextField();
        customizeClearButton();
        customizeResult();

        clearButtonAction();
        textFieldAction();

        c.add(result);
        c.add(clearButton);
        c.add(textField);
        c.add(imageLabel);
    }

    private void textFieldAction(){
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=textField.getText();
                try{
                    int number=Integer.parseInt(text);
//                    String table="";
                    result.setText("");
                    for(int i=1;i<=10;i++){
//                        table=table+i+"x"+number+"="+i*number+"\n";

                        result.append(i+" x "+number+" = "+i*number+"\n");
                    }




                }catch (NumberFormatException err){
                    result.setText("");
                    JOptionPane.showMessageDialog(null,"Enter a integer.","Warning Box",JOptionPane.WARNING_MESSAGE);
                }

            }
        });
    }

    private void clearButtonAction(){
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText("");
            }
        });
    }

    private void customizeTextField(){
        textField.setBounds(20,340,150,30);
        fieldFont=new Font("Arial",Font.BOLD,16);
        textField.setFont(fieldFont);
    }

    private void customizeResult(){
        resultFont=new Font("Fira Code",Font.BOLD+Font.ITALIC,14);
        result.setBounds(20,380,300,250);
        result.setBackground(Color.GRAY);
        result.setForeground(Color.WHITE);
        result.setOpaque(true);
        result.setFont(resultFont);
        result.setEditable(false);

    }

    private void customizeClearButton(){
        cursor=new Cursor(Cursor.HAND_CURSOR);
        clearButton.setText("Clear");
        clearButton.setBounds(180,340,100,30);
        clearButton.setBackground(Color.RED);
        clearButton.setForeground(Color.WHITE);

        clearButton.setCursor(cursor);
    }


    private void customizeImageLabel(){
        labelImage=new ImageIcon("D:\\java_code\\javaSwingAgain\\src\\com\\hakim\\multiplicationTable\\parent-clipart-parents-clipart-1.png");

        imageLabel.setBounds(20,20,labelImage.getIconWidth(),labelImage.getIconHeight());

        imageLabel.setIcon(labelImage);

    }
    private void customizeCContainer(){
        c.setLayout(null);
        c.setBackground(Color.DARK_GRAY);
    }


    public static void main(String[] args) {
        customizeFrame();
    }

    private static void customizeFrame(){
        TableFrame frame=new TableFrame();
        frameIcon=new ImageIcon("D:\\java_code\\javaSwingAgain\\src\\com\\hakim\\multiplicationTable\\Dictionary-icon.png");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,50,350,700);
        frame.setIconImage(frameIcon.getImage());
    }
}
