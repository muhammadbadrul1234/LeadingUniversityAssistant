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

    Demo() {
        super("Leading University");
        ImageIcon icon;
        icon = new ImageIcon(this.getClass().getResource("/image/logo.png"));
        this.setIconImage(icon.getImage());

        setSize(1000, 800);
        setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setLayout(null);


        //setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        img = new JLabel(new ImageIcon("fp.png"));

        jp = new JScrollPane(img);
       jp.setBounds(0, 200, 900, 700);
        jp.setViewportView(img);
        add(jp);
        setVisible(true);

    }
}
       