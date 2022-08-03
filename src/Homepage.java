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

public class Homepage extends JFrame {
    public Homepage() {
        super("Leading University");

        ImageIcon icon;
        icon = new ImageIcon(this.getClass().getResource("/image/logo.png"));
        this.setIconImage(icon.getImage());

        setSize(1000, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);

        Font labelFont = ((new Font("Segoe UI", Font.CENTER_BASELINE, 16)));
        JPanel headerpanel = new JPanel();
        headerpanel.setBackground(new Color(93, 130, 250));
        headerpanel.setBounds(0, 0, 1000, 60);

        JLabel headerTxt = new JLabel("Welcome to Leading University Portal");
        headerTxt.setFont((new Font("Segoe UI", Font.BOLD, 30)));
        headerTxt.setForeground(Color.WHITE);
        headerpanel.add(headerTxt);
        add(headerpanel);

    }
}

