<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%page errorPage="total-error.jsp" %>
<%
request.setCharacterEncoding("UTF-8");
int price=Integer.parselnt(request.getParameter("price"));
int count=Integer.parselnt(request.getparameter("count"));
int delivery=Integer.parselint(request.getParameter("delivery"));
%>
<%=price %>円x<%=count %>個+送料<%=delivery %>円=
<%=price*count+delivery %>円

</body>
</html>