//package com.yedam.web;
//
//import java.io.IOException;
//import java.util.List;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.apache.ibatis.session.SqlSession;
//
//import com.yedam.common.DataSource;
//import com.yedam.dao.MemberMapper;
//import com.yedam.vo.Member;
//
//@WebServlet("/MemberListServlet")
//public class MemberListServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//
//    public MemberListServlet() {
//        super();
//    }
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		SqlSession sqlSession = DataSource.getInstance().openSession(true);	//자동커밋
//		MemberMapper dao = sqlSession.getMapper(MemberMapper.class);
//		List<Member> memberList = dao.members();
//		for(Member ml : memberList) {
//			System.out.println(ml.toString());
//		}
//	}
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
//	}
//
//}
