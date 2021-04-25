<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
	prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- jQuery -->
<script src="<c:url value="/assets/javascript/jquery/jquery-3.6.0.js"/>"></script>
<!-- 스크립트 삽입 -->
<script src="<c:url value="/assets/javascript/users.js"/>"></script>
</head>
<body>
<div id="container">
		<jsp:include page="/WEB-INF/views/includes/header.jsp" />
		<div id="wapper">
			<div id="content">
				<div id="site-introduction">
				<form
		id="join-form"
		name="registerForm" 
		action="<c:url value="/users/join"/>"
		method="POST" onsubmit="return checkForm(this)">
		<input type="hidden" name="check" value="f">
		<input type="hidden" name="a" value="join">
		
		<label for="username">이름</label><br>
		<input name="username" type="text" ><br>
	
		
	
		<label for="id">아이디</label><br>
		<input type="text" name="id" >
		
		<!-- 이메일 체크 버튼 -->
		<input type="button" 
			value="id 중복 체크" 
			onclick="checkid(this.form.id, '<c:url value="/users/idcheck" />')" /><br>
			
		<label for="password">패스워드</label><br>
		<input name="password" type="password"><br>
		
		<label for="agree">약관동의</label><br>
		<input type="checkbox" name="agree" value="O" checked>서비스 약관에 동의합니다.</checkbox><br>
		<input type="submit" value="회원가입">
         
	</form>

				</div>
			</div>
		</div>
	
		</div>
</body>
</html>