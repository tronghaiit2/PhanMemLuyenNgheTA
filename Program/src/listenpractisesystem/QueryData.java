package listenpractisesystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryData {
	
	 public static String view() {
	    ResultSet resultSet = null;
	    String s = null;
	    	
	    try {
	    	Connection con = Database.getConnection();
	    		int ID_file = Level.ID*100 + Lesson.ID*10 + ListenPractise.count;
	    		String t = String.valueOf(ID_file);
	    	    Statement statement = (Statement) con.createStatement(); 
	    	    String sql = "select * from sound where id=" + t;
	    	    resultSet = statement.executeQuery(sql);
	    		if(resultSet.next()) s = resultSet.getString(2);	    	        
	    	    con.close();
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	    return s;
	 }
	 
	 public static int LengthOfSound() {
		ResultSet resultSet = null;
		int time = 0;
		try {
			Connection con = Database.getConnection();
			Statement stm = con.createStatement();
			String sql = "select * from sound where level=" + Level.ID + " and lesson=" + Lesson.ID;
			resultSet = stm.executeQuery(sql);
			while(resultSet.next()) {
			time += resultSet.getInt(3);
			}
			con.close();
		} catch(Exception e) {
		  e.printStackTrace();
		}		
		return time;
	}
}