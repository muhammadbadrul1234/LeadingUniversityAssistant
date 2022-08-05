import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicPanelUI;
import org.w3c.dom.events.MouseEvent;

import com.mysql.cj.util.Util;

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

        setSize(1250,800);
        setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setLayout(null);

        Font labelFont=((new Font("sans-serif",Font.TYPE1_FONT,16)));

	    JPanel headerpanel=new JPanel();
	    //headerpanel.setBackground(new Color(93,130,250));
		headerpanel.setBounds(0, 0, 1250, 150);
		headerpanel.setBackground(new Color(69,90,100));


	    JLabel headerTxt=new JLabel("Welcome to Leading University Portal");
		headerTxt.setFont((new Font("Segoe UI", Font.BOLD, 30)));
		headerTxt.setForeground(Color.WHITE);
		JLabel imgLabel = new JLabel(new ImageIcon(this.getClass().getResource("/image/header.png")));

		headerpanel.add(imgLabel);
        add(headerpanel);
        JPanel inputpanel1=new JPanel();
	//inputpanel1.setBackground(new Color(112,128,144));
        inputpanel1.setBounds(0, 150, 1250, 30);
		inputpanel1.setLayout(null);
		inputpanel1.setBackground(new Color(69,90,100));


        JButton Homebtn=new JButton("Home");
	    Homebtn.setBounds(0,0,150,30);
	    Homebtn.setBackground(new Color(69,90,100));
	    Homebtn.setFont(labelFont);
	    Homebtn.setForeground(Color.WHITE);
	    Homebtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Homebtn.setFocusable(false);
        inputpanel1.add(Homebtn);

        JButton Admissionbtn=new JButton("Admission");
	    //Admissionbtn.setBounds(150,0,150,30);
	    Admissionbtn.setBackground(new Color(69,90,100));
	    Admissionbtn.setFont(labelFont);
	    Admissionbtn.setForeground(Color.WHITE);
	    Admissionbtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Admissionbtn.setFocusable(false);
		//inputpanel1.add(Admissionbtn);

		JMenuBar menuBar = new JMenuBar("Admission");
		menuBar.setBackground(new Color(69, 90, 100));
		menuBar.setBorder(new LineBorder(new Color(69, 90, 100)));
		menuBar.setForeground(Color.WHITE);


        JButton contacButton=new JButton("Add Teacher");
	    contacButton.setBounds(200,0,150,30);
	    contacButton.setBackground(new Color(69,90,100));
	    contacButton.setFont(labelFont);
	    contacButton.setForeground(Color.WHITE);
	    contacButton.setBorder(new LineBorder(new Color(69,90,100)));
	    contacButton.setFocusable(false);
        inputpanel1.add(contacButton);

        JButton FormBtn=new JButton("Forms");
	    FormBtn.setBounds(350,0,50,30);
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

		JButton Aboutbtn=new JButton("About");
	    Aboutbtn.setBounds(935,0,150,30);
	    Aboutbtn.setBackground(new Color(69,90,100));
	    Aboutbtn.setFont(labelFont);
	    Aboutbtn.setForeground(Color.WHITE);
	    Aboutbtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Aboutbtn.setFocusable(false);
		inputpanel1.add(Aboutbtn);
		
		JButton Logoutbtn=new JButton("Logout");
	    Logoutbtn.setBounds(1085,0,150,30);
	    Logoutbtn.setBackground(new Color(69,90,100));
	    Logoutbtn.setFont(labelFont);
	    Logoutbtn.setForeground(Color.WHITE);
	    Logoutbtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Logoutbtn.setFocusable(false);
		inputpanel1.add(Logoutbtn);

		Homebtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//dispose();
				//new Homepage();
			}
		});

		Admissionbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Admission();
			}
		});
		contacButton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			new AddEmployee();
		}
		});

		Aboutbtn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			new AboutUs();
		}
		});

		Logoutbtn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			new LoginPage();
		}
		});

		







        JPanel inputpanel2=new JPanel();
		

        inputpanel2.setBounds(0, 180, 1000, 600);

		JLabel imgLabel2 = new JLabel(new ImageIcon(this.getClass().getResource("/uielement/Frontpage.png")));
		inputpanel2.add(imgLabel2);
		add(inputpanel2);
        



        add(inputpanel1);
        setVisible(true);






        /*
         * Action Listener of menu bar
         */

		


    }
}

