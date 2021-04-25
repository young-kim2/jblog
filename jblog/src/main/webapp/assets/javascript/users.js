function checkForm(frm) {
	console.log(frm);

	var username = frm.name.value.trim();
	var id = frm.id.value.trim();
	var password = frm.password.value.trim();
	var agree = frm.gender.value;
	var check=frm.check.value;

	//	TODO: 추가 검증
	if (username.length==0) {
		alert("이름을 입력해주세요.");
		frm.username.focus();
	}else if(check !="t"){
	   alert("아이디 중복 체크를 해주세요")
	
	} else if (password.length==0) {
		alert("패스워드를 입력해주세요.");
		frm.password.focus();
	} else if (agree != 'O') {
		alert("약관에 동의해 주세요.");
	} else {	//	검증 통과
		return true;	//	폼 전송
	}

	return false;	//	onsubmit 이벤트에서 true여야 전송
}
function checkid(idField, url) {
	console.log("id field:", idField.value);

	//	Ajax 호출
	if (idField.value.trim().length == 0) {
		alert("아이디를 입력해 주세요");
		return;
	}
	$.ajax({
		url: url,
		type: "GET",
		dataType: "json",
		data: {
			email: idField.value.trim()
		}, 
		success: function(result) {
			console.log("Result:", result);
			if(result.data==true){
				idField.form.check.value="f";
				alert("다른 아이디로 가입해 주세요.");
			}else{
				idField.form.check.value="t";
				alert("사용할 수 있는 아이디 입니다.");
			}
		},
		error: function(xhr, status, error) {
			console.error("Status:", status);
			console.error("Response:", xhr);
			console.error("Error:", error);
			idField.form.check.value="f";
		}	
	});
	}		