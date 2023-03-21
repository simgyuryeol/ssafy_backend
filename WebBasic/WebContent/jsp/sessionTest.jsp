<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String userId = (String) session.getAttribute("userId");
		int[] intArray = (int[]) session.getAttribute("intArray");
		List<String> strList = (List<String>) session.getAttribute("strList");
		
		List<?> strList2 = (List<?>) session.getAttribute("strList"); // Generic Wildcard
	%>
	
		<h2>intArray<%=intArray %></h2>
		<h2>userId = <%=userId %></h2>
		<h2>strList = <%=strList %></h2>
	
	<%
	if(intArray != null){
	
		for(int i : intArray){
%>
			<h4> <%= i %></h4>
<%			
		}
}
%>
	<%
	if(strList != null){
		for(String str : strList){
%>
			<h4> <%= str %></h4>
<%			
		}
	}
%>

	<%
	if(strList2 != null){
		for(Object str: strList2){
%>
			<h4> <%= (String) str %></h4>
<%			
		}
	}
%>

</body>
</html>