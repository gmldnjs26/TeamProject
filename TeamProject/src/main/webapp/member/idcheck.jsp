<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="padding:12px; text-align:center;">
		<h2>중복확인 체크검사</h2>
		<form action="idCheck.do" method="post" name="insertForm">
				<p>아이디 : <input type="text" name="mber_id" value="${mber_id}">
				<input type="submit" value="중복확인"></p>
			
			<c:if test="${result == 1 }">
				<script>
					opener.document.insertForm.mber_id.value="";
				</script>
				${mber_id} 사용할 수 없습니다
				
					
			</c:if>
			<c:if test="${result == -1 }">
				${mber_id} 사용가능 합니다
				<input type="button" value="사용" onClick="idok('${mber_id}')">
			</c:if>
		</form>
		<script>
			function idok(mber_id) {
				opener.insertForm.mber_id.value = document.insertForm.mber_id.value;
				opener.insertForm.reid.value = document.insertForm.mber_id.value;
				window.close();
			}
		</script>
	</div>
		
		

</body>
</html>















