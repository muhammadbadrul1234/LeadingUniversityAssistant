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

import java.lang.Object;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;
import javax.swing.plaf.ComboBoxUI;


public class Homepage extends JFrame {
    public Homepage() {
       super("Leading University");
        
        ImageIcon icon;
        icon = new ImageIcon(this.getClass().getResource("/image/logo.png"));
		this.setIconImage(icon.getImage());
		JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,lab,lab1,lab2;
        JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
        JButton b,b1,b2,b3;
		JComboBox c1, c2;
		
		JComboBox Manage,Update,Database,Attendence;

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
	    Homebtn.setBounds(0,0,130,30);
	    Homebtn.setBackground(new Color(69,90,100));
	    Homebtn.setFont(labelFont);
	    Homebtn.setForeground(Color.WHITE);
	    Homebtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Homebtn.setFocusable(false);
		inputpanel1.add(Homebtn);
		
		String Man[] = {"Add","Admission","Add Teacher","Add Employee"};
        Manage = new JComboBox(Man);
        // c1.setUI(ColorArrowUI.createUI(c1));
       
        
        Manage.setName("Badrul");
        Manage.setBackground(new Color(69,90,100));
	   	Manage.setFont(labelFont);
	    Manage.setForeground(Color.WHITE);
	    Manage.setBorder(new LineBorder(new Color(69,90,100)));
	    Manage.setFocusable(false);
        Manage.setBackground(new Color(69,90,100));
        Manage.setBounds(130, 0, 130, 30);
        Manage.setUI(new BasicComboBoxUI() {
            @Override
            protected ComboPopup createPopup() {
                BasicComboPopup basicComboPopup = new BasicComboPopup(comboBox);
                        basicComboPopup.setBorder(new LineBorder(new Color(69, 90, 100)));
                basicComboPopup.setBackground(new Color(69,90,100));
                return basicComboPopup;
            }
        });
		
		
		String Updt[] = {"Update","Student","Teacher"," Employee"};
        Update = new JComboBox(Updt);
        // c1.setUI(ColorArrowUI.createUI(c1));
       
        
        Update.setName("Badrul");
        Update.setBackground(new Color(69,90,100));
	   	Update.setFont(labelFont);
	    Update.setForeground(Color.WHITE);
	    Update.setBorder(new LineBorder(new Color(69,90,100)));
	    Update.setFocusable(false);
        Update.setBackground(new Color(69,90,100));
        Update.setBounds(230, 0, 130, 30);
        Update.setUI(new BasicComboBoxUI() {
            @Override
            protected ComboPopup createPopup() {
                BasicComboPopup basicComboPopup = new BasicComboPopup(comboBox);
                        basicComboPopup.setBorder(new LineBorder(new Color(69, 90, 100)));
                basicComboPopup.setBackground(new Color(69,90,100));
                return basicComboPopup;
            }
		});
		
		String Attndnc[] = {"Data Sheet","Student Details","Teacher Details"," Employee Details","Student Attendance","Teacher Attendence"," Employee Attendance"};
        Attendence = new JComboBox(Attndnc);
        // c1.setUI(ColorArrowUI.createUI(c1));
       
        
        Attendence.setName("Badrul");
        Attendence.setBackground(new Color(69,90,100));
	   	Attendence.setFont(labelFont);
	    Attendence.setForeground(Color.WHITE);
	    Attendence.setBorder(new LineBorder(new Color(69,90,100)));
	    Attendence.setFocusable(false);
        Attendence.setBackground(new Color(69,90,100));
        Attendence.setBounds(330, 0, 130, 30);
        Attendence.setUI(new BasicComboBoxUI() {
            @Override
            protected ComboPopup createPopup() {
                BasicComboPopup basicComboPopup = new BasicComboPopup(comboBox);
                        basicComboPopup.setBorder(new LineBorder(new Color(69, 90, 100)));
                basicComboPopup.setBackground(new Color(69,90,100));
                return basicComboPopup;
            }
		});

		inputpanel1.add(Manage);
		inputpanel1.add(Update);
		inputpanel1.add(Attendence);
		inputpanel1.add(Attendence);
		//add(inputpanel1);

		String dtbs[] = {"Data Sheet","Student Details","Teacher Details"," Employee Details","Student Attendance","Teacher Attendence"," Employee Attendance"};
        Database = new JComboBox(dtbs);
        // c1.setUI(ColorArrowUI.createUI(c1));
       
        
        Database.setName("Badrul");
        Database.setBackground(new Color(69,90,100));
	   	Database.setFont(labelFont);
	    Database.setForeground(Color.WHITE);
	    Database.setBorder(new LineBorder(new Color(69,90,100)));
	    Database.setFocusable(false);
        Database.setBackground(new Color(69,90,100));
        Database.setBounds(330, 0, 130, 30);
        Database.setUI(new BasicComboBoxUI() {
            @Override
            protected ComboPopup createPopup() {
                BasicComboPopup basicComboPopup = new BasicComboPopup(comboBox);
                        basicComboPopup.setBorder(new LineBorder(new Color(69, 90, 100)));
                basicComboPopup.setBackground(new Color(69,90,100));
                return basicComboPopup;
            }
		});

		
		
		inputpanel1.add(Database);
		inputpanel1.add(Update);
		inputpanel1.add(Manage);

       

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

