package com.hakim.layoutManager.projects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageSlider extends JFrame implements ActionListener {

    private Font titleFont;

    private ImageIcon image1;
    private ImageIcon image2;
    private ImageIcon image3;
    private ImageIcon image4;
    private ImageIcon image5;
    private ImageIcon image6;
    private ImageIcon image7;
    private ImageIcon image8;

    private JPanel panel;

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;

    private JLabel title;

    private Container c;

    private JButton next;
    private JButton previous;

    private CardLayout cardLayout;

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==next){
            cardLayout.next(panel);
        }else if (e.getSource()==previous){
            cardLayout.previous(panel);
        }
    }

    ImageSlider(){
        init();
    }

    private void init(){
        c=this.getContentPane();
        c.setBackground(Color.pink);
        panel=new JPanel();
        label1=new JLabel();
        label2=new JLabel();
        label3=new JLabel();
        label4=new JLabel();
        label5=new JLabel();
        label6=new JLabel();
        label7=new JLabel();
        label8=new JLabel();
        cardLayout=new CardLayout();
        title=new JLabel("Image Gallery Show : ");
        next=new JButton("Next");
        previous=new JButton("Previous");
        c.setLayout(null);
        titleFont=new Font("Fira Code",Font.PLAIN,15);
        title.setFont(titleFont);

        title.setBounds(50,10,200,20);

        panel.setLayout(cardLayout);
        panel.setBounds(50,40,500,300);

        previous.setBounds(50,350,100,30);
        next.setBounds(160,350,100,30);

        customizeImage();

        label1.setIcon(image1);
        label2.setIcon(image2);
        label3.setIcon(image3);
        label4.setIcon(image4);
        label5.setIcon(image5);
        label6.setIcon(image6);
        label7.setIcon(image7);
        label8.setIcon(image8);

        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        panel.add(label6);
        panel.add(label7);
        panel.add(label8);

        next.addActionListener(this);
        previous.addActionListener(this);

        c.add(panel);
        c.add(title);
        c.add(next);
        c.add(previous);
    }

    private void customizeImage(){
        image1=new ImageIcon("D:\\java_code\\javaSwingAgain\\src\\com\\hakim\\layoutManager\\projects\\images\\House.png");
        image2=new ImageIcon("D:\\java_code\\javaSwingAgain\\src\\com\\hakim\\layoutManager\\projects\\images\\ice-break.png");
        image3=new ImageIcon("D:\\java_code\\javaSwingAgain\\src\\com\\hakim\\layoutManager\\projects\\images\\IMG20220514085732.jpg");
        image4=new ImageIcon("D:\\java_code\\javaSwingAgain\\src\\com\\hakim\\layoutManager\\projects\\images\\nest.png");
        image5=new ImageIcon("D:\\java_code\\javaSwingAgain\\src\\com\\hakim\\layoutManager\\projects\\images\\palace.png");
        image6=new ImageIcon("D:\\java_code\\javaSwingAgain\\src\\com\\hakim\\layoutManager\\projects\\images\\pexels-fabian-wiktor-994605.jpg");
        image7=new ImageIcon("D:\\java_code\\javaSwingAgain\\src\\com\\hakim\\layoutManager\\projects\\images\\pexels-nathan-cowley-1300510.jpg");
        image8=new ImageIcon("D:\\java_code\\javaSwingAgain\\src\\com\\hakim\\layoutManager\\projects\\images\\terbine.png");



        Image one=image1.getImage();
        Image two=image2.getImage();
        Image three=image3.getImage();
        Image four=image4.getImage();
        Image five=image5.getImage();
        Image six=image6.getImage();
        Image seven=image7.getImage();
        Image eight=image8.getImage();

        one=one.getScaledInstance(panel.getWidth(),panel.getHeight(),Image.SCALE_SMOOTH);
        two=two.getScaledInstance(panel.getWidth(),panel.getHeight(),Image.SCALE_SMOOTH);
        three=three.getScaledInstance(panel.getWidth(),panel.getHeight(),Image.SCALE_SMOOTH);
        four=four.getScaledInstance(panel.getWidth(),panel.getHeight(),Image.SCALE_SMOOTH);
        five=five.getScaledInstance(panel.getWidth(),panel.getHeight(),Image.SCALE_SMOOTH);
        six=six.getScaledInstance(panel.getWidth(),panel.getHeight(),Image.SCALE_SMOOTH);
        seven=seven.getScaledInstance(panel.getWidth(),panel.getHeight(),Image.SCALE_SMOOTH);
        eight=eight.getScaledInstance(panel.getWidth(),panel.getHeight(),Image.SCALE_SMOOTH);

        image1=new ImageIcon(one);
        image2=new ImageIcon(two);
        image3=new ImageIcon(three);
        image4=new ImageIcon(four);
        image5=new ImageIcon(five);
        image6=new ImageIcon(six);
        image7=new ImageIcon(seven);
        image8=new ImageIcon(eight);
    }

    public static void main(String[] args) {
        ImageSlider frame=new ImageSlider();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,100,600,500);
    }
}