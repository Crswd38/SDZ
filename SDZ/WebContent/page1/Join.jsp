<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join</title>
</head>
<body>
	<form action="JoinAction.jsp" method="post" style="display: flex;">
		<input type="text" name="id" placeholder="아이디" required><br>
		<%
        String dupid = request.getParameter("dupid");
        if (dupid !=null) {
            out.println("중복된 아이디입니다.");
    	%><br><%} %>
		<input type="password" name="pw" placeholder="비밀번호" required><br>
		<input type="text" name="name" placeholder="닉네임" required><br>
		<%
		String dupname = request.getParameter("dupname");
		if (dupname !=null) {
		    out.println("중복된 닉네임입니다.");
	    %><br><%} %>
		<input type="email" name="email" placeholder="이메일" required><br>
		<input type="submit" value="회원가입">
	</form>
	<a href="Login.jsp" style="text-decoration: none; color: black;">로그인</a>
</body>
</html>