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

        JLabel id15=new JLabel();
        id15.setBounds(10,10,900,700);
        id15.setLayout(null);

        String course[] = {"B.Tech","BBA","BCA","Bsc","Msc","MBA","MCA","BA","BCom"};
        JComboBox c1 = new JComboBox(course);
        c1.setBackground(Color.WHITE);
        c1.setBounds(700,500,150,30);
        id15.add(c1);

       

       // add(inputpanel1);
        setVisible(true);

    }
}
       