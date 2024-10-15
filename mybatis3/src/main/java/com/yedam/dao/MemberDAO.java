package com.yedam.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;
import com.yedam.vo.Member;

//DAO 클래스 상속 받기 (임포트도 해야함 패키지가 다르니까)
public class MemberDAO extends DAO{
	//회원목록
	public List<Member> memberList(){
		List<Member> list = new ArrayList<>();
		getOpen();
		try {
			//jdbc 이용하면 이렇게 많은 작업을 해야 함
			//마이바티스는 초기 작업만 좀해놓으면 이후에 편해진다곤 함
			psmt =  conn.prepareStatement("select * from tbl_member");
			rs = psmt.executeQuery();
			while(rs.next()) {
				Member member = new Member();
				member.setMemberid(rs.getString("member_id"));
				member.setMemberid(rs.getString("member_id"));
				member.setMemberName(rs.getString("member_name"));
				member.setPhone(rs.getString("phone"));
				member.setResponsibility(rs.getString("responsibility"));
				list.add(member);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			getClass();
		}
		return list;
	}
}