<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
 <%@ page import = "dto.UserDto, java.util.Arrays"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
1. isErrorPage 속성을 통해서 다른 페이지로부터 발생하는 error, exception을 일관된 UI로 보여주는 역할을 수행
 2. error page는 exception 내장 객체를 사용할 수 있다.
 --%>
 
 <h2>죄송합니다. 잠시 후, 다시 시도해 주세요.</h2>
 <hr>
 <h4><%= exception %></h4>
</body>
</html>