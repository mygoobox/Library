package datebase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DateBase {
	
	public static void main(String[] args)
	{
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:mysql://5684e8591edf0.sh.cdb.myqcloud.com:5364/library","root","wjnlzh36183616");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sql = "select studentID,password,name,gender,assessibility from Students";
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			//cursor
			while(rs.next())
			{
				int studentID = rs.getInt(1);
				String password = rs.getString(2);
				String name = rs.getString(3);
				System.out.println(studentID+","+password+","+name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
