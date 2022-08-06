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
		
		JComboBox Manage,Update,Database,Attendence,Fee,Utility,Exam;

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
		
		String Man[] = {"Add","Admission","New Faculty","Add Employee"};
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
          Manage.addActionListener(new ActionListener() {
			
			@Override
            public void actionPerformed(ActionEvent e) {
		String Man2 = (String) Manage.getSelectedItem();
		switch (Man2) {//check for a match
			case "Admission":
				dispose();
				new Admission();
                break;
            case "New Faculty":
                dispose();
                new AddTeacher();
                break;
            case "Add Employee":
                dispose();
				new AddEmployee();
                break;
            default:
                        
                }
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
        Update.addActionListener(new ActionListener() {
			
			@Override
            public void actionPerformed(ActionEvent e) {
		String updt2 = (String) Update.getSelectedItem();
		switch (updt2) {//check for a match
                    case "Student":
                        JFrame frame = new JFrame("Update Student");
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setSize(500, 500);
                        frame.setLocationRelativeTo(null);
                        frame.setLayout(null);
                        
                        JPanel panel = new JPanel();
                        panel.setBounds(0, 0, 500, 500);
                        panel.setLayout(null);
                        frame.add(panel);

                        JLabel l1,l2;
                        JTextField t1;
                        JPasswordField t2;
                        JButton b1,b2;

                        l1 = new JLabel("Student ID");
                        l1.setBounds(40,20,100,30);
                        panel.add(l1);

                        JButton registerButton = new JButton("Register");
                        registerButton.setBounds(600,490,100,30);
                        registerButton.setBackground(new Color(219,143,160));
                        registerButton.setFont(labelFont);
                        registerButton.setForeground(Color.white);
                        registerButton.setBorder(new LineBorder(new Color(93,130,250)));
                        registerButton.setFocusable(false);
                        inputPanel.add(registerButton);
                                        
                       
                
                        t1=new JTextField();
                        t1.setBounds(150,20,150,30);
                        panel.add(t1);

                       


                        frame.setVisible(true);



				// dispose();
				// new Admission();
                // break;
            case "New Faculty":
                dispose();
                new AddTeacher();
                break;
            case "Add Employee":
                dispose();
				new AddEmployee();
                break;
            default:
                        
                }
            }
        });
		

		String dtbs[] = {"Data Sheet","Student Details","Teacher Details"," Employee Details","Student Attendance","Teacher Attendence"," Employee Attendance"};
        Database = new JComboBox(dtbs);
        //DatabaseI(ColorArrowUI.createUDatabase
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
		
		String Attndnc[] = {"Attendance","Student","Teacher"," Employee"};
        Attendence = new JComboBox(Attndnc);
        // c1.setUI(ColorArrowUI.createUI(c1));
       
        
        Attendence.setName("Badrul");
        Attendence.setBackground(new Color(69,90,100));
	   	Attendence.setFont(labelFont);
	    Attendence.setForeground(Color.WHITE);
	    Attendence.setBorder(new LineBorder(new Color(69,90,100)));
	    Attendence.setFocusable(false);
        Attendence.setBackground(new Color(69,90,100));
        Attendence.setBounds(430, 0, 130, 30);
        Attendence.setUI(new BasicComboBoxUI() {
            @Override
            protected ComboPopup createPopup() {
                BasicComboPopup basicComboPopup = new BasicComboPopup(comboBox);
                        basicComboPopup.setBorder(new LineBorder(new Color(69, 90, 100)));
                basicComboPopup.setBackground(new Color(69,90,100));
                return basicComboPopup;
            }
		});

		String fee[] = {"Fee","Fee Structure","Payslip"};
        Fee= new JComboBox(fee);
        // c1.setUI(ColorArrowUI.createUI(c1));
       
        
        Fee.setName("Badrul");
        Fee.setBackground(new Color(69,90,100));
	   	Fee.setFont(labelFont);
	    Fee.setForeground(Color.WHITE);
	    Fee.setBorder(new LineBorder(new Color(69,90,100)));
	    Fee.setFocusable(false);
        Fee.setBackground(new Color(69,90,100));
        Fee.setBounds(530, 0, 130, 30);
        Fee.setUI(new BasicComboBoxUI() {
            @Override
            protected ComboPopup createPopup() {
                BasicComboPopup basicComboPopup = new BasicComboPopup(comboBox);
                        basicComboPopup.setBorder(new LineBorder(new Color(69, 90, 100)));
                basicComboPopup.setBackground(new Color(69,90,100));
                return basicComboPopup;
            }
		});

		String exm[] = {"Exam","Fee Structure","Payslip"};
        Exam= new JComboBox(exm);
        // c1.setUI(ColorArrowUI.createUI(c1));
       
        
        Exam.setName("Badrul");
        Exam.setBackground(new Color(69,90,100));
	   	Exam.setFont(labelFont);
	    Exam.setForeground(Color.WHITE);
	    Exam.setBorder(new LineBorder(new Color(69,90,100)));
	    Exam.setFocusable(false);
        Exam.setBackground(new Color(69,90,100));
        Exam.setBounds(630, 0, 130, 30);
        Exam.setUI(new BasicComboBoxUI() {
            @Override
            protected ComboPopup createPopup() {
                BasicComboPopup basicComboPopup = new BasicComboPopup(comboBox);
                        basicComboPopup.setBorder(new LineBorder(new Color(69, 90, 100)));
                basicComboPopup.setBackground(new Color(69,90,100));
                return basicComboPopup;
            }
		});

		String utlt[] = {"Utility","Fee Structure","Payslip"};
        Utility= new JComboBox(utlt);
        // c1.setUI(ColorArrowUI.createUI(c1));
       
        
        Utility.setName("Badrul");
        Utility.setBackground(new Color(69,90,100));
	   	Utility.setFont(labelFont);
	    Utility.setForeground(Color.WHITE);
	    Utility.setBorder(new LineBorder(new Color(69,90,100)));
	    Utility.setFocusable(false);
        Utility.setBackground(new Color(69,90,100));
        Utility.setBounds(730, 0, 130, 30);
        Utility.setUI(new BasicComboBoxUI() {
            @Override
            protected ComboPopup createPopup() {
                BasicComboPopup basicComboPopup = new BasicComboPopup(comboBox);
                        basicComboPopup.setBorder(new LineBorder(new Color(69, 90, 100)));
                basicComboPopup.setBackground(new Color(69,90,100));
                return basicComboPopup;
            }
		});
		JButton Aboutbtn=new JButton("About");
	    Aboutbtn.setBounds(830,0,150,30);
	    Aboutbtn.setBackground(new Color(69,90,100));
	    Aboutbtn.setFont(labelFont);
	    Aboutbtn.setForeground(Color.WHITE);
	    Aboutbtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Aboutbtn.setFocusable(false);
		inputpanel1.add(Aboutbtn);
		
		JButton Logoutbtn=new JButton("Logout");
	    Logoutbtn.setBounds(980,0,150,30);
	    Logoutbtn.setBackground(new Color(69,90,100));
	    Logoutbtn.setFont(labelFont);
	    Logoutbtn.setForeground(Color.WHITE);
	    Logoutbtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Logoutbtn.setFocusable(false);
		inputpanel1.add(Logoutbtn);

		inputpanel1.add(Utility);
		inputpanel1.add(Exam);
		
		inputpanel1.add(Fee);
		inputpanel1.add(Attendence);
		inputpanel1.add(Database);
		inputpanel1.add(Update);

		inputpanel1.add(Manage);

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
