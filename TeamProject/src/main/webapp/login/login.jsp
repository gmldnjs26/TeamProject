<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<div id="container" class="contBg">
		<div class="login">
			<h2 class="loginTit">三木屋</h2>

			<div class="loginRow">
				<!-- 멤버십 회원 // -->
				<form name="loginForm" id="loginForm" method="post">
				<input type="hidden" id="url" name="url" value="">
				<div class="loginCol">
					<h2 class="loginTit2"></h2>
					<div class="loginBox">
						<div class="loginFm">
							<input type="text" class="ipt fw-full" placeholder="IDをご入力ください" title="IDをご入力ください" name="mber_id" id="mber_id" maxlength="20">
							<input type="password" class="ipt fw-full fmMg-1" placeholder="パスワードをご入力ください" title="パスワードをご入力ください" name="pw" id="pw" maxlength="20">
							<span class="chkFm fmMg-1"><input type="checkbox" class="chk" id="chkSaveId" name="chkSaveId" value="Y"><span class="act"></span><label for="chkSaveId" class="fc-3">ログイン状態を保持する</label></span>
							<span class="forgot"><a href="#" class="txtLine" onclick="fn_idpw_search();">ログインできない方</a></span>
							<a href="#" class="btn-1 btnLogin" onclick="fnLogin(); return false;">ログイン</a>
						</div>
					</div>
					<dl class="loginOpt">
						<dt>会員登録をしていらっしゃいませんか？</dt>
						<dd>会員登録して頂きますと、ポイントが貯まる他<br>様々なイベントにご参加になれます</dd>
						<dd class="btnOpt"><a href="join.do" class="btn-9 btnJoin">会員登録</a></dd>
					</dl>
				</div>
				</form>
				<!-- // 멤버십 회원 -->

				<!-- // 비회원 예약 조회 -->
			</div>
		</div>

	</div>
<script type="text/javascript">
	var COOKIEIDNAME = "AMBATEL_ID";
	function validation() {
		if(isEmpty("mber_id", "아이디를 입력해 주세요.")) {
			return false;
		}
		if(isEmpty("pw", "비밀번호를 입력해 주세요.")) {
			return false;
		}
		return true;
	}
	/*
	function validation2() {
		if(isEmpty("rsvt_no", "예약번호를 입력해 주세요.")) return false;
		if(isEmpty("mber_nm_last", "성을 입력해 주세요.")) return false;
		if(isEmpty("mber_nm_first", "이름을 입력해 주세요.")) return false;
			if(isNotPhone("telno1", "telno2", "telno3", "연락처를 입력해 주세요.")) {
				return false;
			}	
		if ($("#telno2").val().length < 3) {
			alert("연락처를 입력해 주세요.");
			$("#telno2").focus();
			return false;
		}
		if ($("#telno3").val().length < 4) {
			alert("연락처를 입력해 주세요.");
			$("#telno3").focus();
			return false;
		}

        if(isEmpty("email", "이메일을 입력해 주세요.")) {
            return false;
        }
        if(isEmpty("email_domain", "이메일 도메인을 입력해 주세요.")) {
			$("#email_domain_sel").focus();
			return false;
		}
		var validEmail = $("#email").val() + '@' + $("#email_domain").val();
		
        f(isEmpty("email_domain", "이메일 도메인을 입력해 주세요.")) {
            return false;
        }
        var email1 = $("#email").val().toLowerCase();
        var validEmail = '';
        if (email1.search("@") == -1) {
            validEmail = email1 + "@" + $("#email_domain").val();
        } else {
            validEmail = email1;
        }

		if (!fnChkEmailValid(validEmail)) {
			alert("올바른 이메일 주소를 입력하세요.");
			return false;
		}
		return true;
	}

	function fnGetId() {
		var id = fnGetCookie(COOKIEIDNAME);
		if (id == null || id == "") {
		} else {
			$("#chkSaveId").attr("checked", "checked");
			$("#mber_id").val(id);
		}
	}*/

	function fnLogin() {
		var expdate = new Date();
		if(!validation()) {
			return;
		}
		if ($("#chkSaveId").is(":checked") == true) {
			expdate.setTime(expdate.getTime() + 1000 * 3600 * 24 * 30);
			fnSetCookie(COOKIEIDNAME, $("#mber_id").val(), expdate);
		} else {
			fnClearCookie(COOKIEIDNAME);
		}
		AMB.loading.visible();
		$.post('/ko/members/loginJson.do',  $("#loginForm").serialize(), function(result) {
			if(result.commonResult.result == false) {
				if (result.commonResult.resultStr == "INACT") {
					if (result.nmin) {
						$("#inactFrm").find("input[name='nmin']").val(result.nmin);
					}
					if (result.mbnm) {
						$("#inactFrm").find("input[name='mbnm']").val(result.mbnm);
					}
					$("#inactFrm").find("input[name='mid']").val($("#mber_id").val());
					$("#inactFrm").attr("action", "inactiveInfo.do");
					$("#inactFrm").attr("method", 'post');		
					$("#inactFrm").submit();
				} else {
					AMB.loading.hidden();
					alert(result.commonResult.resultStr.replaceAll('<br>', '\r\n'));
					var str = result.commonResult.resultStr;
					if(str.indexOf("비밀번호 변경이 필요합니다.") > -1) {
						fn_pw_search();
					}
					if(str.indexOf("5회 이상 잘못") > -1) {
						fn_idpw_search();
					}					
					
				}
			} else {
				var url = "/ko/main.do";
				if($("#url").val() != "") {
					url = $("#url").val();
				}
				document.location.href = url;
			}
		}, 'json');
	}
	function fnLoginNonMember() {
		if(validation2()) {
			$.post("/ko/members/loginNonMemberJson.do", $("#loginNonMberForm").serialize(), function(result) {
				if(result.commonResult.result == false) alert(result.commonResult.resultStr);
				else $("#loginNonMberForm").attr("action", "/ko/booking/bookingDetail.do").submit();
			}, "json");
		}
	}

	$(document).ready(function() {
		$("#mber_id").fnSetMaxlength(20);
		$("#mber_id").fnKeyOnlyEngNum("아이디는 영문과 숫자만 입력 가능합니다.");
		$("#pw").fnSetMaxlength(20);
		
		$("#telno2").fnSetMaxlength(4);
		$("#telno3").fnSetMaxlength(4);
		$("#telno2").fnKeyOnlyNumber();
		$("#telno3").fnKeyOnlyNumber();

//		$("#email").fnSetMaxlength(30);
//		$("#email_domain").fnSetMaxlength(30);
//		$("#email").fnKeyNotKoreanEmail("이메일은 영문과 숫자만 입력 가능합니다.");
//		$("#email_domain").fnKeyNotKorean("이메일 도메인은 영문과 숫자만 입력 가능합니다.");
//		fnMakeEmailDomins($("#email_domain"), '', 'ko', true);

		$("#email").fnSetMaxlength(30);
		$("#email").fnKeyNotKorean("이메일은 영문과 숫자만 입력 가능합니다.");
		$("#email_domain").fnSetMaxlength(30);
		$("#email_domain").fnKeyNotKorean("이메일 도메인은 영문과 숫자만 입력 가능합니다.");
		fnMakeEmailDomins($("#email_domain_sel"), '', 'ko');
		
		$("#rsvt_no").fnKeyOnlyEngNum();

		
			
				$("#mber_nm_last").fnSetMaxlength(2);
				$("#mber_nm_first").fnSetMaxlength(5);
				$("#mber_nm_last").fnKeyOnlyKorean("한글만 입력 가능합니다.")
				$("#mber_nm_first").fnKeyOnlyKorean("한글만 입력 가능합니다.")
				$("#telno1").change(function() { $("#telno2").focus(); });
			
			
		

		$("#pw").keypress(function(e) {
			if(e.which == 13)
				fnLogin();
		});
		$('#mber_id').focus();
		fnGetId();
	});
	</script>

<%@ include file="../footer.jsp"%>