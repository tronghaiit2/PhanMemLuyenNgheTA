package listenpractisesystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetScore {

	public static int[][] getHighScore() {
		int [][] sc = {{0,0,0},
				       {0,0,0},
				       {0,0,0}};
		ResultSet resultSet = null;
		try {
			Connection con = Database.getConnection();
			Statement stm = con.createStatement();
			for(int i = 0; i < 3 ; i++) {
				for(int j = 0 ; j < 3 ; j++) {
					String sql = "select * from score where level="+ (i+1) +" and lesson=" + (j+1);
					resultSet = stm.executeQuery(sql);
					while(resultSet.next()) {
						if(sc[i][j] < resultSet.getInt(4)) sc[i][j] = resultSet.getInt(4);
					}
				}
			}
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return sc;
	}
	
	public static long getTime() {
		ResultSet resultSet = null;
		long time = 0;
		try {
			Connection con = Database.getConnection();
			Statement stm = con.createStatement();
			String sql = "select * from score";
			resultSet = stm.executeQuery(sql);
			while(resultSet.next()) {
				time += resultSet.getInt(5);
			} 
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return time;
	}

	public static String[] getDate() {
		String[] date = new String[25];
		ResultSet resultSet = null;
		int count=1;
		try {
			Connection con = Database.getConnection();
			Statement stm = con.createStatement();
			String sql = "select * from score ";
			resultSet = stm.executeQuery(sql);
			resultSet.last();
			if(resultSet.next()) {
				date[0] = resultSet.getTime(6).toString();
			}
			while(count <= 10) {
				if(resultSet.previous() || resultSet.isFirst()) {
					 String a= resultSet.getDate(6).toString();
					 date[count] = resultSet.getTime(6).toString()+"\n"+a;
					 count++;
				}
				else break;
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static int[] getScore10times() {
		int[] score = new int[11];
		int count = 1;
		ResultSet resultSet = null;
		try {
			Connection con = Database.getConnection();
			Statement stm = con.createStatement();
			String sql = "select * from score";
			resultSet = stm.executeQuery(sql);
			resultSet.last();
			if(resultSet.next()) {
				score[0] = resultSet.getInt(4);
			}
			
			while(count<=10) {
				if(resultSet.previous() || resultSet.isFirst()) {
					score[count] = resultSet.getInt(4);
					count++;
			
				} 
				else break;
			}
			
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return score;
	}
	public static void main(String[] args) {
		getDate();
	}
}

