import javax.swing.JFrame;
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
import java.lang.Object;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;
import javax.swing.plaf.ComboBoxUI;

public class ZFPAdministration extends JFrame {
    JScrollPane jp;
    JLabel img;
    ZFPAdministration(){
    super("Leading University");
        ImageIcon icon;
        icon = new ImageIcon(this.getClass().getResource("/image/logo.png"));
		this.setIconImage(icon.getImage());
		JComboBox Manage,Update,Database,Attendence,Fee,Utility,Exam;

        Font labelFont=((new Font("sans-serif",Font.TYPE1_FONT,16)));
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
    
         setSize(1250, 800);
        setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setLayout(null);
        img = new JLabel(new ImageIcon(this.getClass().getResource("/Front Image/1.png")));
        jp = new JScrollPane(img);
        jp.setBounds(00, 180, 1234, 580);
        jp.setForeground(Color.WHITE);
        jp.setViewportView(img);
        add(jp);

        add(inputpanel1);
        setVisible(true);
        // Resultbtn.addActionListener
}

}
