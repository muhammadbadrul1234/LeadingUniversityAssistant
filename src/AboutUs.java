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

        JLabel Homebtn1=new JLabel("New Student Admission");
        Homebtn1.setBounds(380,190,1000,30);
	    //Homebtn.setBackground(new Color(69,90,100));
	    Homebtn1.setFont(labelFont3);
	    Homebtn1.setForeground(Color.WHITE);
	    //Homebtn.setBorder(new LineBorder(new Color(69,90,100)));
	   // Homebtn.setFocusable(false);
        

        JPanel inputpanel2=new JPanel();
		inputpanel2.setBackground(new Color(69,90,100));
        inputpanel2.setBounds(0, 180, 1000, 50);
        inputpanel2.setLayout(null);
        add(Homebtn1);
        add(inputpanel2);

         JPanel inputpanel1=new JPanel();
	//inputpanel1.setBackground(new Color(112,128,144));
        inputpanel1.setBounds(0, 150, 1000, 30);
		inputpanel1.setLayout(null);
        
        
        JButton Homebtn=new JButton("Home");
	    Homebtn.setBounds(0,0,100,30);
	    Homebtn.setBackground(new Color(69,90,100));
	    Homebtn.setFont(labelFont);
	    Homebtn.setForeground(Color.WHITE);
	    Homebtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Homebtn.setFocusable(false);
        inputpanel1.add(Homebtn);
        
        JButton Admissionbtn=new JButton("Admission");
	    Admissionbtn.setBounds(100,0,100,30);
	    Admissionbtn.setBackground(new Color(69,90,100));
	    Admissionbtn.setFont(labelFont);
	    Admissionbtn.setForeground(Color.WHITE);
	    Admissionbtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Admissionbtn.setFocusable(false);
        inputpanel1.add(Admissionbtn);
        
        JButton contacButton=new JButton("Contact");
	    contacButton.setBounds(200,0,100,30);
	    contacButton.setBackground(new Color(69,90,100));
	    contacButton.setFont(labelFont);
	    contacButton.setForeground(Color.WHITE);
	    contacButton.setBorder(new LineBorder(new Color(69,90,100)));
	    contacButton.setFocusable(false);
        inputpanel1.add(contacButton);
        
        JButton FormBtn=new JButton("Forms");
	    FormBtn.setBounds(300,0,100,30);
	    FormBtn.setBackground(new Color(69,90,100));
	    FormBtn.setFont(labelFont);
	    FormBtn.setForeground(Color.WHITE);
	    FormBtn.setBorder(new LineBorder(new Color(69,90,100)));
	    FormBtn.setFocusable(false);
        inputpanel1.add(FormBtn);
        
        JButton noticebButton=new JButton("Notice");
	    noticebButton.setBounds(400,0,100,30);
	    noticebButton.setBackground(new Color(69,90,100));
	    noticebButton.setFont(labelFont);
	    noticebButton.setForeground(Color.WHITE);
	    noticebButton.setBorder(new LineBorder(new Color(69,90,100)));
	    noticebButton.setFocusable(false);
        inputpanel1.add(noticebButton);
        
        JButton Deptsbtn=new JButton("Departments");
	    Deptsbtn.setBounds(500,0,120,30);
	    Deptsbtn.setBackground(new Color(69,90,100));
	    Deptsbtn.setFont(labelFont);
	    Deptsbtn.setForeground(Color.WHITE);
	    Deptsbtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Deptsbtn.setFocusable(false);
        inputpanel1.add(Deptsbtn);
        
        JButton Librarybtn=new JButton("Library");
	    Librarybtn.setBounds(620,0,100,30);
	    Librarybtn.setBackground(new Color(69,90,100));
	    Librarybtn.setFont(labelFont);
	    Librarybtn.setForeground(Color.WHITE);
	    Librarybtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Librarybtn.setFocusable(false);
        inputpanel1.add(Librarybtn);
        
        JButton Resultbtn=new JButton("Result");
	    Resultbtn.setBounds(720,0,70,30);
	    Resultbtn.setBackground(new Color(69,90,100));
	    Resultbtn.setFont(labelFont);
	    Resultbtn.setForeground(Color.WHITE);
	    Resultbtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Resultbtn.setFocusable(false);
        inputpanel1.add(Resultbtn);
        
        JButton Regbtn=new JButton("Semester Registration");
	    Regbtn.setBounds(790,0,195,30);
	    Regbtn.setBackground(new Color(69,90,100));
	    Regbtn.setFont(labelFont);
	    Regbtn.setForeground(Color.WHITE);
	    Regbtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Regbtn.setFocusable(false);
        inputpanel1.add(Regbtn);

        add(inputpanel1);
