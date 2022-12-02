package JFrame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	private static Connection con;
	static{
		// TODO Auto-generated constructor stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver ok");
			String url ="jdbc:mysql://localhost/db";
			String user="root";
			String pwd="";
			Connection con=DriverManager.getConnection(url, user, pwd);
			System.out.println("Connected");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return con;
	}

}
