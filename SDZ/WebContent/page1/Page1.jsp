<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SDZ</title>
<link rel="shortcut icon" type="image/x-icon" href="image/sdzlogo.png">
	<script>
        function login(){
            var url = "Login.jsp";
            var name = "login";
            var option = "width = 300px, height = 300px, top = 100px, left = 1100px, location = no"
            window.open(url, name, option);
        }
	</script>
</head>
<body>
	<div style="display: flex; align-items: center; flex-direction: row-reverse;">
	<% if(session.getAttribute("SName")!=null) {%>
		<a href="Logout.jsp" style="right: 10px; text-decoration: none; color: black; font-size: 13px">로그아웃</a>
		<span style="margin-right: 10px;"><%out.print(session.getAttribute("SName"));%>님 환영합니다</span>
		
	<% }else{%>
		<a href="javascript:login()" style="text-decoration: none; color: black; font-size: 20px">로그인</a>
	<% }%>
	</div>
    <div style="display: grid; place-items: center;">
        <div style="display: flex; font-size: 100px;">
            <p style="color: green"><strong>S</strong></p>
            <p style="color: yellow"><strong>D</strong></p>
            <p style="color: blue"><strong>Z</strong></p>
        </div>
        <form action="" method="post" style="position: absolute; top: 300px; width: 30%; display: grid; place-items: center;">
            <input style="border-radius: 25px; width: 100%; height: 40px; font-size: large; padding-inline-start: 50px; padding-inline-end: 50px;" type="text" placeholder="SDZ 검색" name="searchWord">
            <img src="" alt="" style="height: 100%; left: 12px; position: absolute; top: 0;">
        </form>
    </div>
</body>
</html>