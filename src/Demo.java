import javax.swing.border.LineBorder;
import javax.xml.crypto.Data;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class Demo extends JFrame {
    JScrollPane jp;
    JLabel img;

    /**
     * 
     */
    Demo() {
        super("Leading University");
        
        ImageIcon icon;
        icon = new ImageIcon(this.getClass().getResource("/image/logo.png"));
        this.setIconImage(icon.getImage());
 JFrame f;
        JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,lab,lab1,lab2;
        JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
        JButton b,b1,b2,b3;
        JComboBox c1, c2;
        setSize(1250,800);
        setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
        setLayout(null);
        setBackground(new Color(69,90,100));

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
        id1.setBounds(150,250,100,30);
        id1.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id1);

        t1=new JTextField();
        t1.setBounds(300,250,150,30);
        id15.add(t1);

        id2 = new JLabel("Father's Name");
        id2.setBounds(500,250,200,30);
        id2.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id2);

        t2=new JTextField();
        t2.setBounds(700,250,150,30);
        id15.add(t2);

        id3= new JLabel("Age");
        id3.setBounds(150,300,100,30);
        id3.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id3);

        t3=new JTextField();
        t3.setBounds(300,300,150,30);
        id15.add(t3);

        id4= new JLabel("DOB (dd/mm/yyyy)");  
        id4.setBounds(500,300,200,30);
        id4.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id4);

        t4=new JTextField();
        t4.setBounds(700,300,150,30);
        id15.add(t4);

        id5= new JLabel("Address");
        id5.setBounds(150,450,100,30);
        id5.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id5);

        t5=new JTextField();
        t5.setBounds(300,450,150,30);
        id15.add(t5);

        id6= new JLabel("Phone");
        id6.setBounds(500,450,100,30);
        id6.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id6);

        t6=new JTextField();
        t6.setBounds(700,450,150,30);
        id15.add(t6);

        id7= new JLabel("Email Id");
        id7.setBounds(150,350,100,30);
        id7.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id7);

        t7=new JTextField();
        t7.setBounds(300,350,150,30);
        id15.add(t7);

        id9= new JLabel("SSC GPA");
        id9.setBounds(500,350,130,30);
        id9.setFont(new Font("Calibri",Font.BOLD,20));    
        id15.add(id9);

        t8=new JTextField();
        t8.setBounds(700,350,150,30);
        id15.add(t8);

        id10= new JLabel("HSC GPA");
        id10.setBounds(150,400,130,30);
        id10.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id10);

        t9=new JTextField();
        t9.setBounds(300,400,150,30);
        id15.add(t9);


        id11= new JLabel("NID No");
        id11.setBounds(500,400,100,30);
        id11.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id11);

        t10=new JTextField();
        t10.setBounds(700,400,150,30);
        id15.add(t10);

        id12= new JLabel("Employee ID");
        id12.setBounds(150,500,150,30);
        id12.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id12);

        t11=new JTextField();   
        t11.setBounds(300,500,150,30);
        t11.setText("");
        id15.add(t11);


        lab=new JLabel("Course");
        lab.setBounds(500,500,150,30);
	lab.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(lab);
            
        String course[] = {"B.Tech","BBA","BCA","Bsc","Msc","MBA","MCA","BA","BCom"};
        //c1 = new JComboBox("Badrullah",course);
        c1.setBackground(new Color(69,90,100));
	   //c1.setFont(labelFont);
	    c1.setForeground(Color.GRAY);
	    c1.setBorder(new LineBorder(new Color(69,90,100)));
	    //c1.setFocusable(false);
        c1.setBackground(new Color(69,90,100));
        c1.setBounds(700,500,150,30);
        id15.add(c1);
        
        lab2=new JLabel("Branch");
        lab2.setBounds(150,550,150,30);
	lab2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(lab2);
        
        String branch[] = {"Computer Science","Electronics","Electrical","Mechanical","Civil"};
        c2 = new JComboBox(branch);
        c2.setBackground(Color.WHITE);
        c2.setBounds(300,550,150,30);
        id15.add(c2);
       

       // add(inputpanel1);
        setVisible(true);

    }
}
       