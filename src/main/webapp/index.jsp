<%@page import="login_project.ds.JndiDs"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%=JndiDs.getConnection() %><br>
	<h2>실행 화면</h2>
	<c:if test="${id ne null}">
		<a href="logout">로그아웃</a><br>
	</c:if>
	<c:if test="${id eq null}">
	<a href="loginForm.html">로그인</a>
	</c:if>




</body>
</html>