<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Demo JSP</title>
</head>
<body>
<H1> Hello World </H1>
<%!
public int add(int a, int b){
return a+ b;
}
%>
<%
int i = 2;
int j = 4;
%>

<h3><%= add(i,j) %></h3>
<%for(int index = 0; index < 5; index++){ %>
	<h1><%= index %></h1>
<% } %>

</body>
</html>