<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/test.css">

<title>Insert title here</title>
</head>
<body>
	HelloWorld!!!!!!<br>
	<img src="${pageContext.request.contextPath}/resources/img/spring.png"><br><br>
	<span class="test">반갑습니다!!!123!!!456!!!</span>
	<br>
	<%@ include file="sub/test2.jsp" %>
</body>
</html>