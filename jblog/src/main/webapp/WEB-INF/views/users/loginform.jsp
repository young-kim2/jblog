<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="container">
		<jsp:include page="/WEB-INF/views/includes/header.jsp" />
		
		<div id="wapper">
			<div id="content">
				<div id="site-introduction">
				
				<form id="login-form" 
		name="loginform" 
		method="POST" 
		action="<c:url value="/users/login"/>">
		
		<label class="block-label" for="id"> 아이디 </label></br>
		<input id="id" name="id" type="text" value=""><br>

		<label class="block-label">패스워드</label><br>
		<input name="password" type="password" value=""><br>

		<input type="submit" value="로그인">
</form>
				
	
				
				
				
				</div>
				</div>
				</div>
				</div>
				
</body>
</html>