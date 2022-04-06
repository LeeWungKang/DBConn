package com.company.common;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DBConnTest")
public class DBConnTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	//내 어플리케이션 내의 파일경로  (xml 설정 값)
		ServletContext sc = getServletContext();
		String DBConnMsg = sc.getInitParameter("DBConn");
					System.out.println(DBConnMsg);
		
		DBConn instance = null;    //인터페이스 최상위 부모 생성자 (연결주체)
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		if(DBConnMsg.equals("Oracle")) {
					//오라클 연결 생성자 생성
					instance = oracleConn.getInstance();
		}else if (DBConnMsg.equals("Mysql")) {
					//mysql 연결 생성자 생성
					instance = mysqlConn.getInstance();
		}
		
		
		try {    //디비 연결후 작업을 넣는다.
			conn = instance.getConnection();
	
		
		
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			instance.close(conn, pstmt, rs);
		}
	
	}
}