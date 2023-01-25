<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="common.MemberDTO" %>
<%@page import="common.MemberDAO" %>
<%@page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		MemberDAO dao=new MemberDAO();
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		
		MemberDTO MemberDTO=dao.getMemberDTO(id, pw);
		dao.close();
		
		if(MemberDTO.getId()!=null){
			session.setAttribute("SId", MemberDTO.getId());
			session.setAttribute("SName", MemberDTO.getName());
			System.out.print(MemberDTO.getId());
			response.sendRedirect("Page1.jsp");
		}else{
			request.getRequestDispatcher("Login.jsp?loginfail=1").forward(request, response);
		}
	%>
</body>
</html>