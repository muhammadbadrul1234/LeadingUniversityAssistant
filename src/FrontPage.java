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

public class FrontPage extends JFrame {
    JScrollPane jp;
    JLabel img;
    FrontPage() {
        super("Leading University");
        ImageIcon icon;
        icon = new ImageIcon(this.getClass().getResource("/image/logo.png"));
        this.setIconImage(icon.getImage());

         Font labelFont=((new Font("sans-serif",Font.PLAIN,16)));
	    JPanel headerpanel=new JPanel();
	    //headerpanel.setBackground(new Color(93,130,250));
        headerpanel.setBounds(0, 0, 1250, 150);
        headerpanel.setBackground(new Color(69,90,100));
		
	    
	    JLabel headerTxt=new JLabel("Welcome to Leading University Portal");
		headerTxt.setFont((new Font("Segoe UI", Font.PLAIN, 30)));
		headerTxt.setForeground(Color.WHITE);
		JLabel imgLabel = new JLabel(new ImageIcon(this.getClass().getResource("/image/header.png")));
		
		headerpanel.add(imgLabel);
        add(headerpanel);
        JPanel inputpanel1=new JPanel();
	    inputpanel1.setBackground(new Color(69,90,100));
        inputpanel1.setBounds(0, 150, 1250, 30);
		inputpanel1.setLayout(null);
    
        JButton Resultbtn=new JButton("Login");
	    Resultbtn.setBounds(950,0,70,30);
	    Resultbtn.setBackground(new Color(69,90,100));
	    Resultbtn.setFont(labelFont);
	    Resultbtn.setForeground(Color.WHITE);
	    Resultbtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Resultbtn.setFocusable(false);
        inputpanel1.add(Resultbtn);
        
        JButton Regbtn=new JButton("Register");
	    Regbtn.setBounds(1020,0,195,30);
	    Regbtn.setBackground(new Color(69,90,100));
	    Regbtn.setFont(labelFont);
	    Regbtn.setForeground(Color.WHITE);
	    Regbtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Regbtn.setFocusable(false);
        inputpanel1.add(Regbtn);
        
        setSize(1250, 800);
        setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setLayout(null);
        img = new JLabel(new ImageIcon("fp.png"));
        jp = new JScrollPane(img);
        jp.setBounds(00, 180, 1234, 580);
        jp.setForeground(Color.WHITE);
        jp.setViewportView(img);
        add(jp);

        add(inputpanel1);
        setVisible(true);
        Resultbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new LoginPage();
			}
		});

		Regbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Register();
			}
		});

    }
}