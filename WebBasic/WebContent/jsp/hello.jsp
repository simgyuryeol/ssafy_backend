<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import = "dto.UserDto, java.util.Arrays"%>
  <%@ page errorPage = "errorPage.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
1. import
2. getParameter() 주의!!! request.getParameter()와 request.getAttribute() 반드시 구별
 --%>
 
<%
	UserDto userDto = new UserDto();
	int[] intArray = {1,2,3,4,5};
%>

<div><%=Arrays.toString(intArray) %></div>
<div><%= request.getParameter("param") %></div>
<div><%= intArray[5] %></div>
</body>
</html>