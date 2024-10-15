package com.yedam.common;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.yedam.dao.MemberMapper;
import com.yedam.vo.Member;

public class AppTest {
	public static void main(String[] args) {
		//기존 jdbc 방식
//		MemberDAO dao = new MemberDAO();
//		List<Member> result = dao.memberList(); 
//		for(Member member : result) {
//			System.out.println(member.toString());
//		}
		
		//마이바티스 방식
		//true 넣으면 오토커밋됨
		//SqlSession sqlSession = DataSource.getInstance().openSession(true);
		SqlSession sqlSession = DataSource.getInstance().openSession();
		MemberMapper dao = sqlSession.getMapper(MemberMapper.class);
		
		//등록
//		Member mbr = new Member();
//		mbr.setMemberid("test88");
//		mbr.setMemberName("연습88");
//		mbr.setPhone("010-888-8888");
//		mbr.setPassword("888");
//		
//		if(dao.insertMember(mbr) == 1) {
//			sqlSession.commit();
//		}
				
		//업데이트
//		Member mbr1 = new Member();
//		mbr1.setMemberid("test99");
//		mbr1.setMemberName("연습99");
//		mbr1.setPhone("010-7777-7777");
//		mbr1.setPassword("7788");
//		if(dao.updateMember(mbr1) == 1) {
//			sqlSession.commit();
//		}
		
		// 삭제
		Member mbr2 = new Member();
		mbr2.setMemberid("test99");
		if(dao.deleteMember(mbr2.getMemberid()) == 1) {
			sqlSession.commit();                                                                                                  
		}		
		
		List<Member> result = dao.members();
		for(Member member : result) {
			System.out.println(member.toString());
		}
		
	}
}
