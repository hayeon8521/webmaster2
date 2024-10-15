//package com.yedam.web;
//
//import java.io.IOException;
//import java.io.PrintWriter;
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
//// 서블릿 실행하기 위한 url
//// 응답정보를 전송
////HttpServlet 이걸 상속받아서 쓰는걸 모두 서블릿이라고함
////http 프로토콜을 데이터 전송 수신
////httpservlet 상속 기능 구현.
//@WebServlet("/MemberAddServlet")
//public class MemberAddServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	
//    public MemberAddServlet() {
//    }
//    
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		//자바 => 데이터의 입출력 : 스트림
//		//response 응답관련 객체이고 이여기 많은 정보를 담을수 있음
//		response.setContentType("text/html;charset=utf-8");
//		PrintWriter out = response.getWriter();
//		out.print("<h3>여기는 웹브라우저</h3>");
//		out.print("<h3>응답정보를 처리하는 객체 : response</h3>");
//		out.print("<a href='index.html'>첫페이지로 이동</a>");
//		
//		// out 은 웹브라우저라고 생각하면됨
//	}
//	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		request.setCharacterEncoding("utf-8");
//		//doGet(request, response);
//		//4개의 파라메터 받아옴
//		//request 여기에 모든 정보가 담겨있음
//		String id = request.getParameter("mid");
//		String name = request.getParameter("mname");
//		String pass = request.getParameter("pass");
//		String phone = request.getParameter("phone");
//		
//		Member member = new Member();
//		member.setMemberid(id);
//		member.setMemberName(name);
//		member.setPassword(pass);
//		member.setPhone(phone);
//		System.out.println();
//		//SqlSession sqlSession = DataSource.getInstance().openSession();
//		SqlSession sqlSession = DataSource.getInstance().openSession(true);	//자동커밋
//		MemberMapper dao = sqlSession.getMapper(MemberMapper.class);
//		
//		try {
//			if(dao.insertMember(member)==1) {
//				response.getWriter().print("OK");
//			}
//		} catch (Exception e) {
//			response.getWriter().print("NG");
//		}
//		
//	}
//
//}
