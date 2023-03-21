<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
1. jsp script element 3가지 요소
 --%>
 
 <%-- declaration  --%>
 <%!
 	//멤버 변수, method를 만들 수 잇음
 	String myMethod(){
	 	return "Hello";
 	}
 %>
 
 <%-- scripting 실행 block의 코드 --%>
 <%-- intArray의 항목을 ul 밑에 li 하나씩으로 처리 --%>
 <%--
<ul>
	<li>1</li><li>2</li><li>3</li><li>4</li>
</ul>
 --%>
 
 <%
 	int[] intArray = {1,2,3,4,5};
 %>
<ul>
<%
	for(int n : intArray){
%>
	<li><%= n %></li> <%-- expression --%>
<%
	}
%>
</ul>

<div><span><%= intArray.length %></span><span><%= this.myMethod() %></span></div>
</body>
</html>