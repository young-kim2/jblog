<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
	prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<div id="container">
		<jsp:include page="/WEB-INF/views/includes/header.jsp" />
		<div id="wapper">
			<div id="content">
				<div id="site-introduction">
				<h1>회원 가입 성공</h1>
	<p class="jr-success">
		"감사합니다. 회원 가입 및 블로그가 성공적으로 만들어 졌습니다."
	</p>
	<p>
		<a href="<c:url value="/users/login"/>">로그인하기</a>
	</p>
	</div>
	</div>
	</div>
	</div>
</body>
</html>