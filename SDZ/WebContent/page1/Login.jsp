<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<form action="LoginAction.jsp" method="post">
		<input type="text" name="id" placeholder="아이디"><br>
		<input type="password" name="pw" placeholder="비밀번호"><br>
		<%
        String loginfail = request.getParameter("loginfail");
        if (loginfail !=null) {
            out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
    	%><br><%} %>
		<input type="submit" value="로그인">
	</form>
	<a href="Join.jsp" style="text-decoration: none; color: black;">회원가입</a>
</body>
</html>