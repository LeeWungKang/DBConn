package com.company.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class oracleConn implements DBConn{
    //자기자신으로부터 인스턴스 객체 생성, 
	public static oracleConn Instance = new oracleConn();   //싱글톤 기법
	
	public static oracleConn getInstance () {
		if(Instance == null)
			Instance = new oracleConn();
		return Instance;
	}
	
	
	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn= DriverManager.getConnection(url,"system","1234");
		System.out.println("oraclesql DB연결 완료");
		return conn;
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
