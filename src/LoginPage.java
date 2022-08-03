import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import javax.xml.crypto.Data;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame {
    public LoginPage() {
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
	    headerpanel.setBounds(0,0,1000,60);
	    
	    JLabel headerTxt=new JLabel("Welcome to Leading University Portal");
		headerTxt.setFont((new Font("Segoe UI", Font.BOLD, 30)));
		headerTxt.setForeground(Color.WHITE);
		headerpanel.add(headerTxt);
		add(headerpanel);
	
        JPanel inputpanel1=new JPanel();
        JLabel images = new JLabel(new ImageIcon("lu.png"));
        inputpanel1.setBounds(0, 60, 350, 700);
	    inputpanel1.setLayout(null);
		add(inputpanel1);

		add(images);
	    
	    JPanel inputpanel=new JPanel();
	    inputpanel.setBackground(new Color(93,130,250));
	    inputpanel.setBounds(350,60,640,700);
	    inputpanel.setLayout(null);
		add(inputpanel);

        JLabel namelabel=new JLabel("UserName ");
	    namelabel.setBounds(80,250,100,25);
		namelabel.setFont(labelFont);
		namelabel.setForeground(Color.WHITE);
		inputpanel.add(namelabel);

	    
	    JTextField nameTxt=new JTextField();
	    nameTxt.setBounds(200,250,200,25);
	    nameTxt.setFont(labelFont);
		inputpanel.add(nameTxt);
	    
	    JLabel passlabel=new JLabel("Password ");
	    passlabel.setBounds(80,290,100,25);
		passlabel.setFont(labelFont);
		passlabel.setForeground(Color.WHITE);
		inputpanel.add(passlabel);
	    
	    JTextField passTxt=new JTextField();
	    passTxt.setBounds(200,290,200,25);
	    passTxt.setFont(labelFont);
		inputpanel.add(passTxt);
	    
	    JButton loginBtn=new JButton("Login");
	    loginBtn.setBounds(300,320,100,30);
	    loginBtn.setBackground(new Color(93,161,217));
	    loginBtn.setFont(labelFont);
	    loginBtn.setForeground(Color.WHITE);
	    loginBtn.setBorder(new LineBorder(new Color(93,130,250)));
	    loginBtn.setFocusable(false);
		inputpanel.add(loginBtn);

		JButton registerLink = new JButton("Don't have an account?");
		registerLink.setBounds(210, 380, 250, 30);
        registerLink.setForeground(Color.WHITE);
	    registerLink.setBackground(new Color(93,130,250));
	   	registerLink.setFont(labelFont);
	    registerLink.setForeground(Color.WHITE);
	    registerLink.setBorder(new LineBorder(new Color(93,130,250)));
	    registerLink.setFocusable(false);
		inputpanel.add(registerLink);
		loginBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String userName = nameTxt.getText();
	            String pass = passTxt.getText();
	            Database db = new Database();
				//String queryLogin = "SELECT * FROM `registered`";
				Database db1 = new Database();
	            String queryLogin = "SELECT * FROM `registered`";
				if(db1.Login(queryLogin, userName, pass)) {
					JOptionPane.showMessageDialog(null, "Login Successful");
					dispose();
					new HomePage();
				}
				else {
					JOptionPane.showMessageDialog(null, "Login Failed");
				}
			}
		});
		registerLink.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Register();
			}
		});
		setVisible(true);
    }
    
}
