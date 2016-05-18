package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class sqltest {
	public static void main(String[] args){
		Connection conn = null;
		try{
			//Class.forName("org.h2.Driver");
			String strConnect = "jdbc:sqlserver://ybl49nyf62.database.windows.net:1433;databaseName=BallGame;user=matsuzhi;password=AshnYuk2;";
			conn = DriverManager.getConnection(strConnect);

			String SQL = "SELECT userId FROM T001_ユーザーマスター";
			PreparedStatement pStmt = conn.prepareStatement(SQL);

			ResultSet rs = pStmt.executeQuery();

			while(rs.next()){
				String id = rs.getString("userId");
				System.out.println(id);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			if(conn!=null){
				try{
					conn.close();
				}
				catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	}
}
