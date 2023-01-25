<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		
		ResultSet did=dao.dupid(id);
		while(did.next()){
			request.getRequestDispatcher("Join.jsp?dupid=1").forward(request, response);
	    }
		ResultSet dname=dao.dupname(name);
		while(dname.next()){
			request.getRequestDispatcher("Join.jsp?dupname=1").forward(request, response);
	    }
		dao.register(id, pw, name, email);
		dao.close();
		response.sendRedirect("Login.jsp");
	%>
</body>
</html>