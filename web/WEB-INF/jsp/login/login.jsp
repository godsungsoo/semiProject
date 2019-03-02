<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="/js/jquery/jquery-3.3.1.js"></script>
<script src="/js/common/common.js"></script>
<meta charset="UTF-8">
<title>dogHouse</title>
</head>
<body>

<form id="form_loginForm">
	<label for="userId">아이디</label><input type="text" id="inp_userId" name="userId">
	<label for="userPwd">패스워드</label><input type="password" id="inp_userPwd" name="userPwd">
</form>
<button id="btn_submit" class="btn btn-default" >제출</button>

<script type="text/javascript">
(function(){
	
$( document ).ready(function(){
	fn_setEvent();
})

function fn_setEvent(){
	
	$("#btn_submit").on("click" , function(e){
		//form submit 방지
		e.preventDefault();
		//common.js serializeObject() jquery protoType 함수 ->form의 데이터를 name을 key로 Object화
		var data = JSON.stringify($("#form_loginForm").serializeObject());
		
		
		//ajax 데이터 보내기
		$.ajax({
            url:'/loginValid.do',
            type:'post',
            data: {"data" : data},
            success:function(data){
                var result = data.result;
                console.log(result);
            }
        })
		
	});
	
	
}




})();
</script>

</body>
</html>