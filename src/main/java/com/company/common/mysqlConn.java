package com.company.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class mysqlConn implements DBConn {

	 //자기자신으로부터 인스턴스 객체 생성, 
		public static mysqlConn Instance = new mysqlConn();   //싱글톤 기법
		
		public static mysqlConn getInstance () {
			if(Instance == null)
				Instance = new mysqlConn();
			return Instance;
		}
	
	
	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3307/db";
		Connection conn= DriverManager.getConnection(url,"root","1234");
		System.out.println("mysql DB연결 완료");
		return null;
	}
	
	
	
	@Override
	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {e.printStackTrace();	}
		}
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {e.printStackTrace();	}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {e.printStackTrace();	}
		}
	}

	@Override
	public void close(Connection conn, PreparedStatement pstmt) {
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {e.printStackTrace();	}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {e.printStackTrace();	}
		}
	}

	
	
	
}
