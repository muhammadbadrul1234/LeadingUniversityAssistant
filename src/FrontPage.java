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
    public FrontPage() {
       super("Leading University");
        
        ImageIcon icon;
        icon = new ImageIcon(this.getClass().getResource("/image/logo.png"));
        this.setIconImage(icon.getImage());

        setSize(1000,800);
        setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setLayout(null);
        
        Font labelFont=((new Font("sans-serif",Font.BOLD,14)));
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
        
        JPanel inputpanel2=new JPanel();
		

        inputpanel2.setBounds(0, 180, 1000, 600);

		JLabel imgLabel2 = new JLabel(new ImageIcon(this.getClass().getResource("/uielement/Frontpage.png")));
		//inputpanel2.add(imgLabel2);
       // add(inputpanel2);

        


        



        add(inputpanel1);
        setVisible(true);






        /*
         * Action Listener of menu bar
         */
        Homebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//dispose();
				//new Homepage();
			}
		});
        
         


    }
}
