import java.sql.*;
import javax.swing.*;
import java.awt.*;

public class Database {
    private Connection con;
	private Statement st;
	private ResultSet rs;
	private int flag = 0;
	public Database() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			st = con.createStatement();
			//System.out.println("Connected to DB");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	public void Login(String queryLogin, String userName, String pass) {
		try {
			rs = st.executeQuery(queryLogin);
			while(rs.next()) {
				String tableUserName = rs.getString(2);
				String tablePass = rs.getString(3);
				if(userName.equals(tableUserName) && pass.equals(tablePass)) {
					flag =1;
					break;
				}
			}
			if(flag==0) {
				JOptionPane.showMessageDialog(null, "Invalid paswword or username!!");
			}
			else {
				LoginPage.dispose();
				new Homepage();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
	public void insertRegister(String insertQuesry) {
				try {
					st.executeUpdate(insertQuesry);
					JOptionPane.showMessageDialog(null, "You have successfully registered!");
				} 
				
				catch (Exception e) {
					
					JOptionPane.showMessageDialog(null, "Registration Not Completed");
				}
		
	}

    
}
