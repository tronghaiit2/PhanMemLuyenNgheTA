package listenpractisesystem;

import java.sql.Connection;
import java.sql.DriverManager;
public class Database {
	public static Connection getConnection() {
		Connection con=null;
		try {
			
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/btl","root","1a2s3d4f5g");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}