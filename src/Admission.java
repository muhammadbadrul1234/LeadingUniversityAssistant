import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import javax.xml.crypto.Data;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class Admission extends JFrame {
    public Admission() {
        super("Admission");

        ImageIcon icon;
        icon = new ImageIcon(this.getClass().getResource("/image/logo.png"));
        this.setIconImage(icon.getImage());

        setSize(1000, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);

        Font labelFont = ((new Font("Segoe UI", Font.CENTER_BASELINE, 16)));
        Font labelFont2 = ((new Font("Segoe UI", Font.ROMAN_BASELINE, 20)));
        Font labelFont3 = ((new Font("Segoe UI", Font.CENTER_BASELINE, 20)));
        JPanel headerpanel = new JPanel();
        //headerpanel.setBackground(new Color(93,130,250));
        headerpanel.setBounds(0, 0, 1000, 150);

        JLabel imgLabel = new JLabel(new ImageIcon(this.getClass().getResource("/image/header.png")));

        headerpanel.add(imgLabel);
        add(headerpanel);

        JLabel Homebtn=new JLabel("New Student Admission");
        Homebtn.setBounds(380,160,1000,30);
	    //Homebtn.setBackground(new Color(69,90,100));
	    Homebtn.setFont(labelFont3);
	    Homebtn.setForeground(Color.WHITE);
	    //Homebtn.setBorder(new LineBorder(new Color(69,90,100)));
	   // Homebtn.setFocusable(false);
        

        JPanel inputpanel1=new JPanel();
		inputpanel1.setBackground(new Color(69,90,100));
        inputpanel1.setBounds(0, 150, 1000, 50);
        inputpanel1.setLayout(null);
        add(Homebtn);
        add(inputpanel1);

        

        JFrame f;
        JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,lab,lab1,lab2;
        JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
        JButton b,b1,b2,b3;
        JComboBox c1, c2;

        id15=new JLabel();
        id15.setBounds(0,0,900,700);
        id15.setLayout(null);

         id8 = new JLabel("New Student Details");
        id8.setBounds(320,100,500,50);
        id8.setFont(new Font("serif",Font.ITALIC,25));
        id8.setForeground(Color.black);
        id15.add(id8);
        add(id15);

 
        id1 = new JLabel("Name");
        id1.setBounds(150,230,100,30);
        id1.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id1);

        t1=new JTextField();
        t1.setBounds(300,230,150,30);
        id15.add(t1);

        id2 = new JLabel("Father's Name");
        id2.setBounds(500,230,200,30);
        id2.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id2);

        t2=new JTextField();
        t2.setBounds(700,230,150,30);
        id15.add(t2);

        id3= new JLabel("Age");
        id3.setBounds(150,280,100,30);
        id3.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id3);

        t3=new JTextField();
        t3.setBounds(300,280,150,30);
        id15.add(t3);

        id4= new JLabel("DOB (dd/mm/yyyy)");  
        id4.setBounds(500,280,200,30);
        id4.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id4);

        t4=new JTextField();
        t4.setBounds(700,280,150,30);
        id15.add(t4);

        id5= new JLabel("Address");
        id5.setBounds(150,430,100,30);
        id5.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id5);

        t5=new JTextField();
        t5.setBounds(300,430,150,30);
        id15.add(t5);

        id6= new JLabel("Phone");
        id6.setBounds(500,430,100,30);
        id6.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id6);

        t6=new JTextField();
        t6.setBounds(700,430,150,30);
        id15.add(t6);

        id7= new JLabel("Email Id");
        id7.setBounds(150,330,100,30);
        id7.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id7);

        t7=new JTextField();
        t7.setBounds(300,330,150,30);
        id15.add(t7);

        id9= new JLabel("Class X(%)");
        id9.setBounds(500,330,130,30);
        id9.setFont(new Font("Calibri",Font.BOLD,20));    
        id15.add(id9);

        t8=new JTextField();
        t8.setBounds(700,330,150,30);
        id15.add(t8);

        id10= new JLabel("Class XII(%)");
        id10.setBounds(150,380,130,30);
        id10.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id10);

        t9=new JTextField();
        t9.setBounds(300,380,150,30);
        id15.add(t9);


        id11= new JLabel("NID No");
        id11.setBounds(500,380,100,30);
        id11.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id11);

        t10=new JTextField();
        t10.setBounds(700,380,150,30);
        id15.add(t10);

        id12= new JLabel("Roll No");
        id12.setBounds(150,480,150,30);
        id12.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id12);

        t11=new JTextField();   
        t11.setBounds(300,480,150,30);
        t11.setText("");
        id15.add(t11);


        lab=new JLabel("Course");
        lab.setBounds(500,480,150,30);
	lab.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(lab);
            
        String course[] = {"B.Tech","BBA","BCA","Bsc","Msc","MBA","MCA","BA","BCom"};
        c1 = new JComboBox(course);
        c1.setBackground(Color.WHITE);
        c1.setBounds(700,480,150,30);
        id15.add(c1);
        
        lab2=new JLabel("Branch");
        lab2.setBounds(150,530,150,30);
	lab2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(lab2);
        
        String branch[] = {"Computer Science","Electronics","Electrical","Mechanical","Civil"};
        c2 = new JComboBox(branch);
        c2.setBackground(Color.WHITE);
        c2.setBounds(300,530,150,30);
        id15.add(c2);
        
        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(350,550,150,40);
        
        id15.add(b);

        b1=new JButton("Cancel");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,550,150,40);
        
        id15.add(b1);
        




        setVisible(true);
    }
}