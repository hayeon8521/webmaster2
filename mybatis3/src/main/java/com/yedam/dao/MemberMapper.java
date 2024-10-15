package com.yedam.dao;

import java.util.List;

import com.yedam.vo.Member;

//인터페이스 기능정의
//구현클래스 기능실행
public interface MemberMapper {
	public List<Member> members();
	//인서트
	public int insertMember(Member member);
	//업데이트
	public int updateMember(Member member);
	//딜리트
	public int deleteMember(String memberid);
}
