import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame{
    public Register() {
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
		//inputpanel1.setBackground(new Color(93,130,250));
        inputpanel1.setBounds(300, 150, 350, 50);
		//inputpanel1.setLayout(null);
		JLabel imgLabel2 = new JLabel(new ImageIcon(this.getClass().getResource("/image/Registration.png")));
		inputpanel1.add(imgLabel2);
		add(inputpanel1);

		JPanel inputpanel2=new JPanel();
		
		inputpanel2.setBackground(new Color(255,255,255));
        inputpanel2.setBounds(0, 150, 1000, 50);
		//inputpanel1.setLayout(null);
		add(inputpanel2);
	


	
		
		JPanel inputPanel = new JPanel();
		inputPanel.setBackground(new Color(93,130,250));
		inputPanel.setBounds(0,60,1000,740);
		inputPanel.setLayout(null);
		add(inputPanel);
		
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setBounds(250,165,100,25);
        nameLabel.setFont(labelFont);
        nameLabel.setForeground(Color.WHITE);
		inputPanel.add(nameLabel);

		JTextField nameText = new JTextField();
		nameText.setBounds(500,165,200,25);
		nameText.setFont(labelFont);
		inputPanel.add(nameText);
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setBounds(250,200,100,25);
		emailLabel.setFont(labelFont);
		emailLabel.setForeground(Color.WHITE);
		inputPanel.add(emailLabel);
		
		JTextField emailTextField = new JTextField();
		emailTextField.setBounds(500,200,200,25);
		emailTextField.setFont(labelFont);
		inputPanel.add(emailTextField);
		
		JLabel passwordLabel = new JLabel("Password ");
		passwordLabel.setBounds(250,240,100,25);
		passwordLabel.setFont(labelFont);
		passwordLabel.setForeground(Color.WHITE);
		inputPanel.add(passwordLabel);
		
		JTextField passwordTextField = new JTextField();
		passwordTextField.setBounds(500,240,200,25);
		passwordTextField.setFont(labelFont);
		
		inputPanel.add(passwordTextField);
		
		JLabel conPassLabel = new JLabel("Confirm Password");
		conPassLabel.setBounds(250,280,170,25);
		conPassLabel.setFont(labelFont);
		conPassLabel.setForeground(Color.WHITE);
		inputPanel.add(conPassLabel);
				
	    JTextField consPassText = new JTextField();
		consPassText.setBounds(500,280,200,25);
		consPassText.setFont(labelFont);
		inputPanel.add(consPassText);
		
		JLabel MobileNum = new JLabel("Mobile");
		MobileNum.setBounds(250,320,100,25);
		MobileNum.setFont(labelFont);
		MobileNum.setForeground(Color.WHITE);
		inputPanel.add(MobileNum);
		
		JTextField mobileText= new JTextField();
		mobileText.setBounds(500,320,200,25);
		mobileText.setFont(labelFont);

		inputPanel.add(mobileText);

		JLabel addressField = new JLabel("Address");
		addressField.setBounds(250,360,100,25);
		addressField.setFont(labelFont);
		addressField.setForeground(Color.WHITE);
		inputPanel.add(addressField);
				
		JTextField addressText= new JTextField();
		addressText.setBounds(500,360,200,25);
		addressText.setFont(labelFont);
		inputPanel.add(addressText);

		JLabel uniID = new JLabel("University ID");
		uniID.setBounds(250,400,100,25);
		uniID.setFont(labelFont);
		uniID.setForeground(Color.WHITE);
		inputPanel.add(uniID);
				
		JTextField uniIDText= new JTextField();
		uniIDText.setBounds(500,400,200,25);
		uniIDText.setFont(labelFont);
		inputPanel.add(uniIDText);

		JLabel dob = new JLabel("Date of Birth");
		dob.setBounds(250,440,100,25);
		dob.setFont(labelFont);
		dob.setForeground(Color.WHITE);
		inputPanel.add(dob);
				
		JTextField dobText= new JTextField();
		dobText.setBounds(500,440,200,25);
		dobText.setFont(labelFont);
		inputPanel.add(dobText);

		JLabel uniIDpp = new JLabel("*Contact Admission Office if you");
		uniIDpp.setBounds(710, 380, 500, 50);
		Font labelFont2=((new Font("Segoe UI",Font.CENTER_BASELINE,14)));
		uniIDpp.setFont(labelFont2);
		uniIDpp.setForeground(Color.WHITE);
		inputPanel.add(uniIDpp);

		JLabel uniIDpp2 = new JLabel(" don't have University ID");
		uniIDpp2.setBounds(710, 395, 500, 50);
		uniIDpp2.setFont(labelFont2);
		uniIDpp2.setForeground(Color.WHITE);
		inputPanel.add(uniIDpp2);

		JButton registerButton = new JButton("Register");
		registerButton.setBounds(550,490,100,30);
		registerButton.setBackground(new Color(219,143,160));
		registerButton.setFont(labelFont);
		registerButton.setForeground(Color.white);
		registerButton.setBorder(new LineBorder(new Color(93,130,250)));
		registerButton.setFocusable(false);
		inputPanel.add(registerButton);
		
		JButton loginButton = new JButton("Return to Login Page");
		loginButton.setBounds(450, 540, 300, 25);
		loginButton.setBackground(new Color(93,130,250));
		loginButton.setFont(labelFont);
		loginButton.setForeground(new Color(255,255,255));
		loginButton.setBorder(new LineBorder(new Color(93,130,250)));
		loginButton.setFocusable(false);
		inputPanel.add(loginButton);

		loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new LoginPage();
			}
		});
		registerButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String userName= nameText.getText();//badrul
				String email= emailTextField.getText();
				String pass= passwordTextField.getText();
				String conPass= dobText.getText();
				String mobile = mobileText.getText();
				String adress = addressText.getText();
				String uniID = uniIDText.getText();
				//System.out.println(userName);
				if(userName.trim().isEmpty() || email.trim().isEmpty() || pass.trim().isEmpty() || conPass.trim().isEmpty() || mobile.trim().isEmpty() || adress.trim().isEmpty() || uniID.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please fill all the fields");
				}
				else {

					String insertQuery = "INSERT INTO `registered`"
							+ "(`name`, `password`, `email`, `number`, `address`, `uniID`,`dob`) "
							+ " VALUES ('" + userName + "','" + pass + "','" + email + "','" + mobile + "','" + adress
							+ "','" + uniID + "','" + conPass + "') ";

					Database db = new Database();
					db.insertRegister(insertQuery);
					dispose();

					new LoginPage();
				}

				
			}
			
		});
		
		
		
		setVisible(true);
	}
	

}