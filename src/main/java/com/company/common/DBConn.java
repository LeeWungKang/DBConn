package com.company.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface DBConn {
//디비를 사용자의 디비프로그램에 맞게 쉽게 변경하게 해주는 인터페이스.
	
	//연결
	public Connection getConnection() throws ClassNotFoundException, SQLException;
	
		
	
	// 자원 연결 해제
	public void close ( Connection conn, PreparedStatement pstmt, ResultSet rs);
	
	public void close ( Connection conn, PreparedStatement pstmt);
	
	
}
