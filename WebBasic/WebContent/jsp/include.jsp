<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- jsp:include 는 독립적인 servlet으로 각각 만들어진 후, 각각 html을 만들어 진다. --%>
	<jsp:include page="nav.jsp" flush="true"/>
	<hr>
	<h2>Body 부분</h2>
<h4> nav에 있는 str은 <%= str %></h4>
</body>
</html>