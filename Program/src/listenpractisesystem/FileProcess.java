package listenpractisesystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

public class FileProcess {
	
	static int numByte;
	static int time;
	
	public static  byte[] readCharacter() throws SQLException {
		byte[] bytes = null;
		ResultSet resultSet = null;
		try {			
			int ID_file = Level.ID*100 + Lesson.ID*10 + ListenPractise.count;
			String t = String.valueOf(ID_file);
			Connection con = Database.getConnection();
			Statement stm = con.createStatement();
			String sql = "select * from sound where id=" + t;
			resultSet = stm.executeQuery(sql);
			if(resultSet.next()) {
				FileInputStream fin = new FileInputStream(resultSet.getString(4));
				bytes = new byte[200];
				numByte = fin.read(bytes);
				fin.close();
			}
			con.close();
		} catch(Exception e) {
		  e.printStackTrace();
		}
		return bytes;
	}
	
	public static String resultSet() {
		ResultSet resultset = null;
		String s = null;
		try {	
			int ID_file = Level.ID*100 + Lesson.ID*10 + ListenPractise.count;
			String t = String.valueOf(ID_file);
			Connection con = Database.getConnection();
			Statement stm = con.createStatement();
			String sql = "select * from sound where id=" + t;
			resultset = stm.executeQuery(sql);
			if(resultset.next()) {
				s = resultset.getString(4);
			}
			con.close();
		} catch(Exception e) {
		  e.printStackTrace();
		}
		return s;
	}

	public static void writeScore () {
		BufferedWriter bw = null;
		FileWriter fw = null;
		File file;
		PrintWriter pw = null;
		try {
			file = new File("D:\\Eclipse\\Score\\Score.txt");
			String f = String.valueOf(Result.score);
				
			if(!file.exists()) file.createNewFile();
			fw = new FileWriter(file.getAbsoluteFile(),true);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			pw.println(f + "\t"+ getTime());
				
		} catch(Exception e) {
		  e.printStackTrace();
		}
		finally {
			try {
				if(pw!=null) pw.close();
				if(bw!=null) bw.close();
				if(fw!=null) bw.close();
			} catch(Exception e) {
			  e.printStackTrace();
			}
		}
	}
	
	public static String getTime() {
		String s = LocalDateTime.now().toString();
		return s;
	}	
}
