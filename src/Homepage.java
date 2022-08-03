import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicPanelUI;
import org.w3c.dom.events.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.awt.*;

public class Homepage extends JFrame {
    public Homepage() {
       super("Leading University");
        
        ImageIcon icon;
        icon = new ImageIcon(this.getClass().getResource("/image/logo.png"));
        this.setIconImage(icon.getImage());

        setSize(1000,800);
        setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setLayout(null);
        
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
        inputpanel1.setBounds(0, 150, 1000, 50);
		inputpanel1.setLayout(null);
        
        
        JButton Homebtn=new JButton("Home");
	    Homebtn.setBounds(0,0,100,30);
	    Homebtn.setBackground(new Color(112,128,144));
	    Homebtn.setFont(labelFont);
	    Homebtn.setForeground(Color.WHITE);
	    Homebtn.setBorder(new LineBorder(new Color(112,128,144)));
	    Homebtn.setFocusable(false);
        inputpanel1.add(Homebtn);
        
        JButton Admissionbtn=new JButton("Admission");
	    Admissionbtn.setBounds(100,0,100,30);
	    Admissionbtn.setBackground(new Color(112,128,144));
	    Admissionbtn.setFont(labelFont);
	    Admissionbtn.setForeground(Color.WHITE);
	    Admissionbtn.setBorder(new LineBorder(new Color(112,128,144)));
	    Admissionbtn.setFocusable(false);
        inputpanel1.add(Admissionbtn);
        
        JButton contacButton=new JButton("Contact");
	    contacButton.setBounds(200,0,100,30);
	    contacButton.setBackground(new Color(112,128,144));
	    contacButton.setFont(labelFont);
	    contacButton.setForeground(Color.WHITE);
	    contacButton.setBorder(new LineBorder(new Color(112,128,144)));
	    contacButton.setFocusable(false);
        inputpanel1.add(contacButton);
        
        JButton FormBtn=new JButton("Forms");
	    FormBtn.setBounds(300,0,100,30);
	    FormBtn.setBackground(new Color(112,128,144));
	    FormBtn.setFont(labelFont);
	    FormBtn.setForeground(Color.WHITE);
	    FormBtn.setBorder(new LineBorder(new Color(112,128,144)));
	    FormBtn.setFocusable(false);
        inputpanel1.add(FormBtn);
        
        JButton noticebButton=new JButton("Notice");
	    noticebButton.setBounds(400,0,100,30);
	    noticebButton.setBackground(new Color(112,128,144));
	    noticebButton.setFont(labelFont);
	    noticebButton.setForeground(Color.WHITE);
	    noticebButton.setBorder(new LineBorder(new Color(112,128,144)));
	    noticebButton.setFocusable(false);
        inputpanel1.add(noticebButton);
        
        JButton Deptsbtn=new JButton("Deparrtments");
	    Deptsbtn.setBounds(500,0,100,30);
	    Deptsbtn.setBackground(new Color(112,128,144));
	    Deptsbtn.setFont(labelFont);
	    Deptsbtn.setForeground(Color.WHITE);
	    Deptsbtn.setBorder(new LineBorder(new Color(112,128,144)));
	    Deptsbtn.setFocusable(false);
        inputpanel1.add(Deptsbtn);
        
        JButton Homebtn=new JButton("Library");
	    Homebtn.setBounds(0,0,100,30);
	    Homebtn.setBackground(new Color(112,128,144));
	    Homebtn.setFont(labelFont);
	    Homebtn.setForeground(Color.WHITE);
	    Homebtn.setBorder(new LineBorder(new Color(112,128,144)));
	    Homebtn.setFocusable(false);
        inputpanel1.add(Homebtn);
        
        JButton Homebtn=new JButton("Home");
	    Homebtn.setBounds(0,0,100,30);
	    Homebtn.setBackground(new Color(112,128,144));
	    Homebtn.setFont(labelFont);
	    Homebtn.setForeground(Color.WHITE);
	    Homebtn.setBorder(new LineBorder(new Color(112,128,144)));
	    Homebtn.setFocusable(false);
		inputpanel1.add(Homebtn);
        



        add(inputpanel1);
        setVisible(true);


    }
}

