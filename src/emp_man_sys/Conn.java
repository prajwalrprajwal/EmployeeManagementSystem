package emp_man_sys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Conn {
	Connection c;
	Statement s;
public Conn() throws Exception {
	
	
	
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagementsystem","root","root");
		 s =c.createStatement();
		 
		
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	
	
	
}
}
