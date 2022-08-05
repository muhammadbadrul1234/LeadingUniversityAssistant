import javax.swing.JFrame;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

public class UpdateStudent extends JFrame {
    public UpdateStudent() {
        super("Update Student");

        ImageIcon icon;
        icon = new ImageIcon(this.getClass().getResource("/image/logo.png"));
        this.setIconImage(icon.getImage());

        setSize(1250, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);

        Font labelFont = ((new Font("Segoe UI", Font.CENTER_BASELINE, 16)));
        Font labelFont2 = ((new Font("Segoe UI", Font.ROMAN_BASELINE, 20)));
        Font labelFont3 = ((new Font("Segoe UI", Font.CENTER_BASELINE, 20)));
        JPanel headerpanel = new JPanel();
        //headerpanel.setBackground(new Color(93,130,250));
        headerpanel.setBounds(0, 0, 1250, 150);
        headerpanel.setBackground(new Color(69, 90, 100));
        JLabel imgLabel = new JLabel(new ImageIcon(this.getClass().getResource("/image/header.png")));

        headerpanel.add(imgLabel);
        add(headerpanel);

        JLabel Homebtn1 = new JLabel("Update Student Details");
        Homebtn1.setBounds(450, 190, 1000, 30);
        // Homebtn1.setBackground(new Color(255,255,255));
        Homebtn1.setFont(labelFont3);
        Homebtn1.setForeground(Color.WHITE);
        //Homebtn.setBorder(new LineBorder(new Color(69,90,100)));
        // Homebtn.setFocusable(false);

        JPanel inputpanel2 = new JPanel();
        inputpanel2.setBackground(new Color(69, 90, 100));
        inputpanel2.setBounds(0, 180, 1250, 50);
        inputpanel2.setLayout(null);
        add(Homebtn1);
        add(inputpanel2);

        JPanel inputpanel1 = new JPanel();
        //inputpanel1.setBackground(new Color(112,128,144));
        inputpanel1.setBounds(0, 150, 1000, 30);
        inputpanel1.setLayout(null);

        JFrame f;
        JLabel id, id1, id2, id3, id4, id5, id6, id7, id8, id9, id10, id11, id12, id15, lab, lab1, lab2;
        JTextField t, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14;
        JButton b, b1, b2;
        String id_emp;

        id8 = new JLabel("Update Student Details:");
        id8.setBounds(50, 10, 500, 50);
        id8.setFont(new Font("serif", Font.ITALIC, 40));
        id8.setForeground(Color.black);
        add(id8);

        id1 = new JLabel("Name");
        id1.setBounds(50, 170, 100, 30);
        id1.setFont(new Font("serif", Font.BOLD, 20));
       add(id1);

        t1 = new JTextField();
        t1.setBounds(200, 170, 150, 30);
        f.add(t1);

        id2 = new JLabel("Father's Name");
        id2.setBounds(400, 170, 200, 30);
        id2.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id2);

        t2 = new JTextField();
        t2.setBounds(600, 170, 150, 30);
        f.add(t2);

        id3 = new JLabel("Age");
        id3.setBounds(50, 220, 100, 30);
        id3.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id3);

        t3 = new JTextField();
        t3.setBounds(200, 220, 150, 30);
        f.add(t3);

        id4 = new JLabel("DOB (dd/mm/yyyy)");
        id4.setBounds(400, 220, 200, 30);
        id4.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id4);

        t4 = new JTextField();
        t4.setBounds(600, 220, 150, 30);
        f.add(t4);

        id5 = new JLabel("Address");
        id5.setBounds(50, 270, 100, 30);
        id5.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id5);

        t5 = new JTextField();
        t5.setBounds(200, 270, 150, 30);
        f.add(t5);

        id6 = new JLabel("Phone");
        id6.setBounds(400, 270, 100, 30);
        id6.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id6);

        t6 = new JTextField();
        t6.setBounds(600, 270, 150, 30);
        f.add(t6);

        id7 = new JLabel("Email Id");
        id7.setBounds(50, 320, 100, 30);
        id7.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id7);

        t7 = new JTextField();
        t7.setBounds(200, 320, 150, 30);
        f.add(t7);

        id9 = new JLabel("Class X(%)");
        id9.setBounds(400, 320, 130, 30);
        id9.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id9);

        t8 = new JTextField();
        t8.setBounds(600, 320, 150, 30);
        f.add(t8);

        id10 = new JLabel("Class XII(%)");
        id10.setBounds(50, 370, 130, 30);
        id10.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id10);

        t9 = new JTextField();
        t9.setBounds(200, 370, 150, 30);
        f.add(t9);

        id11 = new JLabel("Aadhar No");
        id11.setBounds(400, 370, 100, 30);
        id11.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id11);

        t10 = new JTextField();
        t10.setBounds(600, 370, 150, 30);
        f.add(t10);

        id12 = new JLabel("Roll No");
        id12.setBounds(50, 420, 150, 30);
        id12.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id12);

        t11 = new JTextField();
        t11.setBounds(200, 420, 150, 30);
        f.add(t11);

        lab = new JLabel("Course");
        lab.setBounds(400, 420, 150, 30);
        lab.setFont(new Font("serif", Font.BOLD, 20));
        f.add(lab);

        t13 = new JTextField();
        t13.setBounds(600, 420, 150, 30);
        f.add(t13);

        lab2 = new JLabel("Branch");
        lab2.setBounds(50, 470, 150, 30);
        lab2.setFont(new Font("serif", Font.BOLD, 20));
        f.add(lab2);

        t14 = new JTextField();
        t14.setBounds(200, 470, 150, 30);
        f.add(t14);

        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(250, 520, 150, 40);

        f.add(b);

        b1 = new JButton("Cancel");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450, 520, 150, 40);

        f.add(b1);

        // b.addActionListener(this);
        // b1.addActionListener(this);

        f.setVisible(true);

        // public void actionPerformed(ActionEvent ae){
        //     if(ae.getSource()==b){
        //         try{
        //             conn con = new conn();
        //             String str = "update student set name='"+t1.getText()+"',fathers_name='"+t2.getText()+"',age='"+t3.getText()+"', dob='"+t4.getText()+"',address='"+t5.getText()+"',phone='"+t6.getText()+"',email='"+t7.getText()+"',class_x='"+t8.getText()+"',class_xii='"+t9.getText()+"',aadhar='"+t10.getText()+"',course='"+t13.getText()+"',branch='"+t14.getText()+"' where rollno='"+t12.getText()+"'";
        //             con.s.executeUpdate(str);
        //             JOptionPane.showMessageDialog(null,"successfully updated");

        //         }catch(Exception e){
        //             System.out.println("The error is:"+e);
        //         }
        //     }
        //     if(ae.getSource()==b1){
        //         f.setVisible(false);
        //         new Project().setVisible(true);
        //     }
        //     if(ae.getSource() == b2){
        //         try{
        //             conn con = new conn();
        //             String str = "select * from student where rollno = '"+t12.getText()+"'";
        //             ResultSet rs = con.s.executeQuery(str);

        //             if(rs.next()){
        //                 f.setVisible(true);

        //                 t1.setText(rs.getString(1));
        //                 t2.setText(rs.getString(2));
        //                 t3.setText(rs.getString(3));
        //                 t4.setText(rs.getString(4));
        //                 t5.setText(rs.getString(5));
        //                 t6.setText(rs.getString(6));
        //                 t7.setText(rs.getString(7));
        //                 t8.setText(rs.getString(8));
        //                 t9.setText(rs.getString(9));
        //                 t10.setText(rs.getString(10));
        //                 t11.setText(rs.getString(11));
        //                 t13.setText(rs.getString(12));
        //                 t14.setText(rs.getString(13));
        //             }

        //         }catch(Exception ex){}

        //    //b2.addActionListener(this);

        // add(inputpanel1);
        setVisible(true);
    }
}

