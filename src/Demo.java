import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import javax.xml.crypto.Data;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class Demo extends JFrame {
    JScrollPane jp;
    JLabel img;

    /**
     * 
     */
    Demo() {
        super("Leading University");
        
        ImageIcon icon;
        icon = new ImageIcon(this.getClass().getResource("/image/logo.png"));
        this.setIconImage(icon.getImage());

        setSize(1250,800);
        setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
        setLayout(null);

        JMenuBar mb = new JMenuBar();
        mb.set
        JMenu master = new JMenu("Master");
        JMenuItem m1 = new JMenuItem("New Faculty");
        JMenuItem m2 = new JMenuItem("New Student Admission");
        master.setForeground(Color.BLUE);

        m1.setFont(new Font("monospaced",Font.BOLD,16));
        // ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon1.png"));
        // Image image1 = icon1.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        // m1.setIcon(new ImageIcon(image1));
        // m1.setMnemonic('A');
        // m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        m1.setBackground(Color.WHITE);
        
        m2.setFont(new Font("monospaced",Font.BOLD,16));
        // ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon2.png"));
        // Image image2 = icon2.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        // m2.setIcon(new ImageIcon(image2));
        m2.setMnemonic('B');
        //m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        m2.setBackground(Color.WHITE);
    
        
        //m1.addActionListener(this);
        //m2.addActionListener(this);

                master.add(m1);
                master.add(m2);
        
                mb.add(master);
                setJMenuBar(mb);
                         
        



       // add(inputpanel1);
        setVisible(true);

    }
}
       