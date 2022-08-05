import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import javax.xml.crypto.Data;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class Demo extends JFrame {
    JScrollPane jp;
    JLabel img;

    Demo() {
        super("Leading University");
        ImageIcon icon;
        icon = new ImageIcon(this.getClass().getResource("/image/logo.png"));
        this.setIconImage(icon.getImage());

         Font labelFont=((new Font("Segoe UI",Font.CENTER_BASELINE,16)));
	    JPanel headerpanel=new JPanel();
	    //headerpanel.setBackground(new Color(93,130,250));
		headerpanel.setBounds(0, 0, 1000, 150);
		
	    
	    JLabel headerTxt=new JLabel("Welcome to Leading University Portal");
		headerTxt.setFont((new Font("Segoe UI", Font.BOLD, 30)));
		headerTxt.setForeground(Color.WHITE);
		JLabel imgLabel = new JLabel(new ImageIcon(this.getClass().getResource("/image/header.png")));
		
		headerpanel.add(imgLabel);
        add(headerpanel);
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
        


        setSize(1000, 800);
        setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setLayout(null);

        img = new JLabel(new ImageIcon("fp.png"));

        jp = new JScrollPane(img);
        jp.setBounds(00, 200, 983, 580);

       jp.setForeground(Color.WHITE);
        jp.setViewportView(img);
        add(jp);
        setVisible(true);

    }
}
       