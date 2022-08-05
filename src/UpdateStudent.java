import javax.swing.JFrame;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

public class UpdateStudent extends JFrame {
    public UpdateStudent() {
        super("Update Student");

        ImageIcon icon;
        icon = new ImageIcon(this.getClass().getResource("/image/logo.png"));
        this.setIconImage(icon.getImage());

        setSize(1250, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);

        Font labelFont = ((new Font("Segoe UI", Font.CENTER_BASELINE, 16)));
        Font labelFont2 = ((new Font("Segoe UI", Font.ROMAN_BASELINE, 20)));
        Font labelFont3 = ((new Font("Segoe UI", Font.CENTER_BASELINE, 20)));
        JPanel headerpanel = new JPanel();
        //headerpanel.setBackground(new Color(93,130,250));
        headerpanel.setBounds(0, 0, 1250, 150);
        headerpanel.setBackground(new Color(69,90,100));
        JLabel imgLabel = new JLabel(new ImageIcon(this.getClass().getResource("/image/header.png")));

        headerpanel.add(imgLabel);
        add(headerpanel);

        JLabel Homebtn1=new JLabel("Update Student Details");
        Homebtn1.setBounds(450,190,1000,30);
	   // Homebtn1.setBackground(new Color(255,255,255));
	    Homebtn1.setFont(labelFont3);
	    Homebtn1.setForeground(Color.WHITE);
	    //Homebtn.setBorder(new LineBorder(new Color(69,90,100)));
	   // Homebtn.setFocusable(false);
        

        JPanel inputpanel2=new JPanel();
		inputpanel2.setBackground(new Color(69,90,100));
        inputpanel2.setBounds(0, 180, 1250, 50);
        inputpanel2.setLayout(null);
        add(Homebtn1);
        add(inputpanel2);

         JPanel inputpanel1=new JPanel();
	//inputpanel1.setBackground(new Color(112,128,144));
        inputpanel1.setBounds(0, 150, 1000, 30);
        inputpanel1.setLayout(null);
        








        




        JFrame f;
        JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,lab,lab1,lab2;
        JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
        JButton b,b1,b2; 
        String id_emp;

       
       //b2.addActionListener(this);


    
    add(inputpanel1);
        setVisible(true);
    }
}

