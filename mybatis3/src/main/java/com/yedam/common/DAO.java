package com.yedam.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//DB 연결 기능만 따로 뺴서 여기에 만들려고함
//여기에 bookdao 연결 메소드 빼오고
//bookdao에 상속해버림
public class DAO {

	//다른 패키지에서 사용가능하게 퍼블릭으로 변경
	public PreparedStatement psmt;
	public ResultSet rs;
	public Connection conn = null;	//임포트 해야 사용 가능

	public void getOpen() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			//DB 연결
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"java",
					"1234"
					);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getClose() {
		if(conn != null) {
			try {
				//연결 끈기
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
