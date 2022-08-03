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
	    headerpanel.setBackground(new Color(93,130,250));
		headerpanel.setBounds(0, 0, 1000, 60);
		
	    JLabel headerTxt=new JLabel("Registration");
		headerTxt.setFont((new Font("Segoe UI", Font.BOLD, 30)));
		headerTxt.setForeground(Color.WHITE);
		headerpanel.add(headerTxt);
        add(headerpanel);
		
		//input panel
		JPanel inputPanel = new JPanel();
		inputPanel.setBackground(new Color(93,130,250));
		inputPanel.setBounds(0,60,1000,740);
		inputPanel.setLayout(null);
		add(inputPanel);
		
		//name field of input label
		
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setBounds(300,5,100,25);
        nameLabel.setFont(labelFont);
        nameLabel.setForeground(Color.WHITE);
		inputPanel.add(nameLabel);
		// name textfield
		JTextField nameText = new JTextField();
		nameText.setBounds(500,5,200,25);//(x,y,width,heihjt)
		nameText.setFont(labelFont);
		inputPanel.add(nameText);
		
		//email field of input label
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setBounds(300,50,100,25);
		emailLabel.setFont(labelFont);
		emailLabel.setForeground(Color.WHITE);
		inputPanel.add(emailLabel);
		
		//email text field
		JTextField emailTextField = new JTextField();
		emailTextField.setBounds(500,50,200,25);
		emailTextField.setFont(labelFont);
		inputPanel.add(emailTextField);
		
		//password field input label
		JLabel passwordLabel = new JLabel("Password ");
		passwordLabel.setBounds(300,100,100,25);
		passwordLabel.setFont(labelFont);
		passwordLabel.setForeground(Color.WHITE);
		inputPanel.add(passwordLabel);
		
		//password text field
		JTextField passwordTextField = new JTextField();
		passwordTextField.setBounds(500,100,200,25);
		passwordTextField.setFont(labelFont);
		
		inputPanel.add(passwordTextField);
		
		//confirm password field input label
		JLabel conPassLabel = new JLabel("Confirm Password");
		conPassLabel.setBounds(300,150,170,25);
		conPassLabel.setFont(labelFont);
		conPassLabel.setForeground(Color.WHITE);
		inputPanel.add(conPassLabel);
				
		//confirm password text field
	    JTextField consPassText = new JTextField();
		consPassText.setBounds(500,150,200,25);
		consPassText.setFont(labelFont);
		inputPanel.add(consPassText);
		
		//mobile number field of input label
		JLabel MobileNum = new JLabel("Mobile");
		MobileNum.setBounds(300,200,100,25);
		MobileNum.setFont(labelFont);
		MobileNum.setForeground(Color.WHITE);
		inputPanel.add(MobileNum);
		
		//mobile number text field
		JTextField mobileText= new JTextField();
		mobileText.setBounds(500,200,200,25);
		mobileText.setFont(labelFont);

		inputPanel.add(mobileText);
		
		//address field of input label
		JLabel addressField = new JLabel("Address");
		addressField.setBounds(300,250,100,25);
		addressField.setFont(labelFont);
		addressField.setForeground(Color.WHITE);
		inputPanel.add(addressField);
				
		//mobile number text field
		JTextField addressText= new JTextField();
		addressText.setBounds(500,250,200,25);
		addressText.setFont(labelFont);
		inputPanel.add(addressText);

		JLabel uniID = new JLabel("University ID");
		uniID.setBounds(300,300,100,25);
		uniID.setFont(labelFont);
		uniID.setForeground(Color.WHITE);
		inputPanel.add(uniID);
				
		//mobile number text field
		JTextField uniIDText= new JTextField();
		uniIDText.setBounds(500,300,200,25);
		uniIDText.setFont(labelFont);
		inputPanel.add(uniIDText);

		JLabel uniIDpp = new JLabel("*Contact Admission Office if you");
		uniIDpp.setBounds(710, 285, 500, 50);
		Font labelFont2=((new Font("Segoe UI",Font.CENTER_BASELINE,14)));
		uniIDpp.setFont(labelFont2);
		uniIDpp.setForeground(Color.WHITE);
		inputPanel.add(uniIDpp);

		JLabel uniIDpp2 = new JLabel("don't have University ID");
		uniIDpp2.setBounds(710, 300, 500, 50);
		uniIDpp2.setFont(labelFont2);
		uniIDpp2.setForeground(Color.WHITE);
		inputPanel.add(uniIDpp2);

		
		//Register BUtton
		JButton registerButton = new JButton("Register");
		registerButton.setBounds(550,350,100,60);
		registerButton.setBackground(new Color(219,143,160));
		registerButton.setFont(labelFont);
		registerButton.setForeground(Color.white);
		registerButton.setBorder(new LineBorder(new Color(93,130,250)));
		registerButton.setFocusable(false);
		inputPanel.add(registerButton);
		

		
		JButton loginButton = new JButton("Return to Login Page");
		loginButton.setBounds(450, 450, 300, 25);
		loginButton.setBackground(new Color(93,130,250));
		loginButton.setFont(labelFont);
		loginButton.setForeground(new Color(255,255,255));
		loginButton.setBorder(new LineBorder(new Color(93,130,250)));
		loginButton.setFocusable(false);
		inputPanel.add(loginButton);
		
		//Action Listener ( Login Button)
		loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				//new LoginForm();
			}
		});
		registerButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String userName= nameText.getText();
				String email= emailTextField.getText();
				String pass= passwordTextField.getText();
				String conPass= consPassText.getText();
				String mobile = mobileText.getText();
				String adress = addressText.getText();
				//System.out.println(userName);
				String insertQuesry = "INSERT INTO `register`"
						+ "(`name`, `password`, `email`, `number`, `address`)"
						+ " VALUES ('"+userName+"','"+pass+"','"+email+"','"+mobile+"','"+adress+"') ";
				
				//DbConnect db = new DbConnect();
				//db.insertRegister(insertQuesry);
				
			}
			
		});
		
		
		
		setVisible(true);
	}
	

}