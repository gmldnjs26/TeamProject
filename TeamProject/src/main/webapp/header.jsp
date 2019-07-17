<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="elfunc" uri="/WEB-INF/tlds/el-functions.tld"%>
<!DOCTYPE html>
<html>
<head>

<title>三木屋</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=0.65, minimum-scale=0.65, maximum-scale=1.2, user-scalable=yes">

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<META NAME="ROBOTS" CONTENT="NOINDEX">
<meta name="mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">

<meta property="og:image" content="common/img/thum.png" />
<meta property="og:url" content="#" />
<meta property="og:description" content="제일펫푸드 등 안내." />
<meta property="og:title" content="제일펫푸드" />
<meta name="description" content="제일펫푸드 등 안내.">
<meta name="naver-site-verification"
	content="56e96c78a98c07c1c539b5aeb64abb193e746ee4" />

<link rel="canonical" href="#" />
<link rel="shortcut icon" href="#" />
<link rel="stylesheet" media="all" href="common/css/slick.css">
<link rel="stylesheet" href="common/css/jquery.bxslider.css">
<link rel="stylesheet" media="all" href="common/css/reset.css">
<link rel="stylesheet" media="all" href="common/css/common.css">
<link rel="stylesheet" media="all" href="common/css/join.css">
<script src="common/js/jquery-1.11.3.min.js"></script>
<script src="common/js/jquery.placeholder.enhanced-1.5.js"></script>
<script src="common/js/jquery.easing.1.3.js"></script>
<script src="common/js/slick.min.js"></script>
<script src="common/js/jquery.bxslider.min.js"></script>
<script src="common/js/common.js"></script>
<script src="common/js/form.js"></script>
<script src="common/js/join.js?ver=9"></script>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>

<style>
.loading_area {
	position: fixed;
	width: 100%;
	height: 100%;
	z-index: 9999;
}

.loading_area #bg {
	background-color: #000;
	display: block;
	height: 100%;
	left: 0;
	opacity: 0.5;
	filter: alpha(opacity = 50);
	position: fixed;
	top: 0;
	width: 100%;
	z-index: 99999999;
}

.loading_area .loading_img {
	position: fixed;
	width: 100%;
	height: 6px;
	background: #00a4ae;
	left: 0%;
	top: 0%;
	z-index: 99999;
}

.loading_area .loading_img .bar {
	background: #88f8ff;
	width: 30%;
	border-radius: 3px;
	height: 6px;
	position: fixed;
	left: -30%;
	top: 0%;
}

.loading_area .loading_img.on .bar {
	left: 100%;
	top: 0%;
	transition: all 0.5s 0s ease-in-out;
}
</style>
</head>
<body>
		<div id="viewport" class="main">
			<!-- DLPO 배너 -->
			<!-- //DLPO 배너 -->

			<!-- 헤더 -->
			<div id="header">
				<div class="header_top">
					<div class="contains">
						<div class="right_menu">
							<ul class="top_menu">
								<li><a href="login_form.do">ログイン</a></li>
								<li><a href="join_form.do">新規会員登録</a></li>
								<li><a href="notice.do">よくある質問</a></li>
								<li><a href="#" class="active">KO</a></li>
								<li><a href="#">EN</a></li>
							</ul>
							<div class="top_search hide_mobile">
								<input id="searcht" name="searcht" value="" /><a
									href="javascript:headerSearch()"></a>
							</div>

						</div>
					</div>
				</div>
				<div class="header_bottom">
					<div class="gnb_box">
						<div class="contains">
							<h1 class="logo">
								<a href="index.jsp"> <img
									src="file/profile/sinfo/8bc4a711e24c688437b4163177a60cd8_IMG181120094759.png"
									alt="제일펫푸드" class="hide_mobile"> <img
									src="common/img/common/p.png" alt="제일펫푸드" class="show_mobile">
								</a>
							</h1>
							<a href="javascript:headerSearch()" id="btn_mobile_search"
								class="btn_gnb_search"> <img
								src="common/img/icon/header_search.png" alt="검색">
							</a> <a href="#" id="btn_mobile_gnb" class="btn_gnb"> <img
								src="common/img/icon/header_menu.png" alt="메뉴"> <img
								src="common/img/icon/header_menu_on.png" alt="메뉴" class="on">
							</a>
							<div class="gnb_search_area" id="ativesch">
								<input id="searchtm" name="searchtm" value="" /> <a href=""
									class="btn_gnb_search"> <img
									src="common/img/icon/header_search.png" alt="검색">
								</a> <a href="javascript:changeclass('close')" id="btn_mobile_gnb"
									class="btn_gnb"> <img src="common/img/icon/gnb_close2.png"
									alt="닫기">
								</a>
							</div>
							<div class="gnb_area">
								<div class="close_box gnb_right">
									<a href="#" class="btn_close"><img
										src="common/img/icon/gnb_close.png" alt="닫기"></a>
								</div>
								<div class="gnb_wrap gnb_right">
									<div class="gnb_top mobile">
										<h2 class="logo">
											<a href="index.php"><img
												src="file/profile/sinfo/8bc4a711e24c688437b4163177a60cd8_IMG181120094759.png"
												alt="제일펫푸드"></a>
										</h2>

										<div class="lang_select">
											<ul class="lang_menu">
												<li><a class="lang_kr active" href="index.php">KO<span
														class="arrow down"></span></a></li>
												<li><a class="lang_en" href="en/index.php">EN</a></li>
											</ul>
											<a class="lang_active" href="#">KO<span class="arrow"></span></a>
										</div>
										<script>
											//lang_select
											$(".header_bottom .lang_active")
													.click(
															function() {
																$(
																		".header_bottom .lang_menu")
																		.stop(
																				true,
																				true)
																		.animate(
																				{
																					top : -1
																				},
																				10);
																return false;
															});
											$(".header_bottom .lang_menu a.active")
													.click(
															function() {
																$(".header_bottom .lang_menu").stop(true,true).animate(
																				{top : -9999},10);
																return false;
															});
										</script>
									</div>

									<div class="gnb_scroll">
										<!-- 모바일 메뉴 -->
										<ul id="gnb">
											<li class="menu "><a href="company.do" class="btn_menu">三木屋について</a>
												<span class="icon"></span>
												<ul class="sub_menu" style="">
													<li><a href="company.do">三木屋とは</a></li>
													<li><a href="company.do">三木屋の歴史</a></li>
													<li><a href="company.do">志賀直哉と三木屋</a></li>
													<li><a href="company.do">三木屋のおもてなし</a></li>
													<!--  <li><a href="company/brand.php">브랜드</a></li>
                                                <li><a href="company/location.php">오시는 길</a></li> -->
												</ul></li>
											<li class="menu "><a href="roomList.do" class="btn_menu">お部屋</a>
												<span class="icon"></span>
												<ul class="sub_menu" style="">
													<li><a href="dogs/list_dry.php">特別室50号室</a></li>
													<li><a href="dogs/list_wet.php">特別室22号室</a></li>
													<li><a href="dogs/list_treats.php">和洋室</a></li>
													<li><a href="dogs/list_dry.php">次の間付き和室</a></li>
													<li><a href="dogs/list_wet.php">庭園側和室</a></li>
													<li><a href="dogs/list_treats.php">広め和室</a></li>
													<li><a href="dogs/list_dry.php">一般和室</a></li>
													<li><a href="dogs/list_wet.php">志賀直哉ゆかりの客室</a></li>
												</ul></li>
											<li class="menu "><a href="cats/list_dry.php"
												class="btn_menu">お食事</a></li>
											<li class="menu "><a href="cats/list_dry.php"
												class="btn_menu">温泉</a></li>
											<li class="menu "><a href="cats/list_dry.php"
												class="btn_menu">館内施設</a></li>
											<li class="menu "><a href="notice.do" class="btn_menu">よくある質問</a>
												<span class="icon"></span>
												<ul class="sub_menu" style="">
													<li><a href="notice.do">FAQ</a></li>
												</ul></li>
											<li class="menu "><a href="health/pet.php"
												class="btn_menu">交通案内</a> <span class="icon"></span>
												<ul class="sub_menu" style="">
													<li><a href="health/pet.php">MAP</a></li>
													<li><a href="health/material.php">移動手段</a></li>
												</ul></li>

										</ul>
										<!-- //모바일 메뉴 -->

									</div>

									<div class="gnb_bottom mobile">

										<div class="center_box_wrap">
											<div class="sns_menu">
												<a href="https://ko-kr.facebook.com/jeilpet/"
													target="_blink" class="btn_sns"><img
													src="../common/img/icon/ft_sns_f_m.png" alt="facebook"></a>

												<a href="https://www.instagram.com/idealrecipe/"
													target="_blink" class="btn_sns"><img
													src="../common/img/icon/ft_sns_k_m.png" alt="kakao"></a>
												<a href="https://blog.naver.com/jeilpet" target="_blink"
													class="btn_sns"><img
													src="../common/img/icon/ft_sns_b_m.png" alt="blog"></a>

											</div>
											<div class="center_box">
												<a href="company/location.php">CONTACT</a> <a
													href="center/faq.php">자주하는 질문</a>
											</div>
											<p class="copyright">Copyright ⓒ 2018 JEILPET.CO.LTD. All
												Right Reserved.</p>
										</div>
									</div>

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
	</header>