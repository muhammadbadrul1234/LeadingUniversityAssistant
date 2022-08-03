import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import javax.xml.crypto.Data;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class Admission extends JFrame {
    public Admission() {
        super("Admission");

        ImageIcon icon;
        icon = new ImageIcon(this.getClass().getResource("/image/logo.png"));
        this.setIconImage(icon.getImage());

        setSize(1000, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);

        Font labelFont = ((new Font("Segoe UI", Font.CENTER_BASELINE, 16)));
        JPanel headerpanel = new JPanel();
        //headerpanel.setBackground(new Color(93,130,250));
        headerpanel.setBounds(0, 0, 1000, 150);

        JLabel headerTxt = new JLabel("Welcome to Leading University Portal");
        headerTxt.setFont((new Font("Segoe UI", Font.BOLD, 30)));
        headerTxt.setForeground(Color.WHITE);
        JLabel imgLabel = new JLabel(new ImageIcon(this.getClass().getResource("/image/header.png")));

        headerpanel.add(imgLabel);
        add(headerpanel);

        JFrame f;
        JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,lab,lab1,lab2;
        JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
        JButton b,b1,b2,b3;
        JComboBox c1, c2;
        




        setVisible(true);
    }
}