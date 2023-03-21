<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <%@ include는 두 개의 jsp가 하나의 Servlet으로 만들어진 후, 하나의 html을 만든다. --%>
	<%@ include file="nav.jsp" %>
	<hr>
	<h2>Body 부분</h2>
<h4> nav 에 있는 str은 <%= str %></h4>
</body>
</html>