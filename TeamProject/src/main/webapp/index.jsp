<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<div id="content" class="main">
	<div id="main_visual" class="main_visual">
		<div class="visual_slide">


			<!-- 이미지형 -->
			<div class="list_box slide_01" style="background-color: #fff">
				<!-- 배경컬러 데이터 밖이라 컬러값을 넣을 수가 없음 -->
				<a href="#" alt=""> <!-- 이미지형 --> <span
					class="img_box pc bg_cover"> <img
						src="file/banner/main/main_banner01.jpg" alt="" class="bg" /> <!--<span class="text" style="background-image:url(common/img/main/title.png)"></span>-->
				</span>
				<!-- 웹 --> <span class="img_box mobile bg_cover"> <img
						src="file/banner/main/main_banner01.jpg" alt="" class="bg" />
				</span>
				<!-- 모바일 -->

				</a>
			</div>

			<div class="list_box slide_01" style="background-color: #fff">
				<!-- 배경컬러 데이터 밖이라 컬러값을 넣을 수가 없음 -->
				<a href="#" alt=""> <!-- 이미지형 --> <span
					class="img_box pc bg_cover"> <img
						src="file/banner/main/main_banner02.jpg" alt="" class="bg" /> <!--<span class="text" style="background-image:url(common/img/main/title.png)"></span>-->
				</span>
				<!-- 웹 --> <span class="img_box mobile bg_cover"> <img
						src="file/banner/main/main_banner02.jpg" alt="" class="bg" />
				</span>
				<!-- 모바일 -->

				</a>
			</div>

			<div class="list_box slide_01" style="background-color: #fff">
				<!-- 배경컬러 데이터 밖이라 컬러값을 넣을 수가 없음 -->
				<a href="#" alt=""> <!-- 이미지형 --> <span
					class="img_box pc bg_cover"> <img
						src="file/banner/main/main_banner03.jpg" alt="" class="bg" /> <!--<span class="text" style="background-image:url(common/img/main/title.png)"></span>-->
				</span>
				<!-- 웹 --> <span class="img_box mobile bg_cover"> <img
						src="file/banner/main/main_banner03.jpg" alt="" class="bg" />
				</span>
				<!-- 모바일 -->

				</a>
			</div>

			<div class="list_box slide_01" style="background-color: #fff">
				<!-- 배경컬러 데이터 밖이라 컬러값을 넣을 수가 없음 -->
				<a href="#" alt=""> <!-- 이미지형 --> <span
					class="img_box pc bg_cover"> <img
						src="file/banner/main/main_banner04.jpg" alt="" class="bg" /> <!--<span class="text" style="background-image:url(common/img/main/title.png)"></span>-->
				</span>
				<!-- 웹 --> <span class="img_box mobile bg_cover"> <img
						src="file/banner/main/main_banner04.jpg" alt="" class="bg" />
				</span>
				<!-- 모바일 -->

				</a>
			</div>

			<div class="list_box slide_01" style="background-color: #fff">
				<!-- 배경컬러 데이터 밖이라 컬러값을 넣을 수가 없음 -->
				<a href="#" alt=""> <!-- 이미지형 --> <span
					class="img_box pc bg_cover"> <img
						src="file/banner/main/main_banner05.jpg" alt="" class="bg" /> <!--<span class="text" style="background-image:url(common/img/main/title.png)"></span>-->
				</span>
				<!-- 웹 --> <span class="img_box mobile bg_cover"> <img
						src="file/banner/main/main_banner05.jpg" alt="" class="bg" />
				</span>
				<!-- 모바일 -->

				</a>
			</div>


			<!-- 이미지형 -->
			<div class="list_box slide_01" style="background-color: #fff">
				<!-- 배경컬러 데이터 밖이라 컬러값을 넣을 수가 없음 -->
				<a href="#" alt=""> <!-- 이미지형 --> <span
					class="img_box pc bg_cover"> <img
						src="file/banner/main/main_banner06.jpg" alt="" class="bg" /> <!--<span class="text" style="background-image:url(common/img/main/title.png)"></span>-->
				</span>
				<!-- 웹 --> <span class="img_box mobile bg_cover"> <img
						src="file/banner/main/main_banner06.jpg" alt="" class="bg" />
				</span>
				<!-- 모바일 -->

				</a>
			</div>


		</div>
		<div class="slide_btn">
			<div class="btn_box">
				<a href="#" class="btn_slide prev">이전</a> <a href="#"
					class="btn_slide next">다음</a>
			</div>
		</div>

		<!--<a href="#" class="btn_page_down"><img src="img/icon/page_arrow_bottom.png" alt=""></a>-->
	</div>

	<!-- 제품 -->
	<div class="main_pd_slide">
		<div class="contains">
			<div class="table_box">
				<div class="table_td">
					<ul id="slider_top">
						<li><a href="#"><img src="common/img/main/sample.jpg"
								alt="" />
								<p class="text">01</p></a></li>
						<li><a href="#"><img src="common/img/main/sample.jpg"
								alt="" />
								<p class="text">02</p></a></li>
						<li><a href="#"><img src="common/img/main/sample.jpg"
								alt="" />
								<p class="text">03</p></a></li>

						<li><a href="#"><img src="common/img/main/sample.jpg"
								alt="" />
								<p class="text">04</p></a></li>
						<li><a href="#"><img src="common/img/main/sample.jpg"
								alt="" />
								<p class="text">05</p></a></li>
						<li><a href="#"><img src="common/img/main/sample.jpg"
								alt="" />
								<p class="text">06</p></a></li>
						<li><a href="#"><img src="common/img/main/sample.jpg"
								alt="" />
								<p class="text">07</p></a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<script>
		$(document).ready(function() {
			var body = $('body').width();
			if (body < 1200) {
				var slider_01 = $('#slider_top').bxSlider({
					auto : false,
					controls : false,
					pager : false,
					maxSlides : 1,
					moveSlides : 1,
					slideWidth : 1000,
					slideMargin : 0,
					pause : 2000,
					infiniteLoop : false
				});
				console.log('a');
			}
			if (body > 1200) {
				var slider_01 = $('#slider_top').bxSlider({
					auto : false,
					controls : false,
					pager : false,
					maxSlides : 4,
					moveSlides : 1,
					slideWidth : 200,
					slideMargin : 0,
					pause : 2000,
					autoHover : false,
					infiniteLoop : false
				});
				console.log('b');
			}
		});
	</script>
	<!-- 믿고먹일수있는 -->
	<div id="main_solution" class="main_solution main_panel">
		<div class="main_title">
			<p class="label">一つ</p>
			<p class="title font_ib">三木屋のおもてなし＜お部屋＞</p>
			<p class="desc">
				木造りの温かみと和の情緒 <br />あふれる数奇屋造りの客室。
			</p>
		</div>
		<div class="solution_area">
			<div class="contains">
				<div class="solution_list">
					<div class="list_box">
						<div class="solution_box">
							<a href="company/company.php" class="btn_menu"> <span
								class="over"> <img src="common/img/main/sample.jpg"
									alt="" class="bg_img"> <span class="label font_ib">メッセージ
										<br />メッセージ
								</span>
							</span>
							</a>
						</div>
					</div>
					<div class="list_box">
						<div class="solution_box">
							<a href="company/group.php" class="btn_menu"> <span
								class="over"> <img src="common/img/main/sample.jpg"
									alt="" class="bg_img"> <span class="label font_ib">メッセージ
										<br />メッセージ
								</span>

							</span>
							</a>
						</div>
					</div>
					<div class="list_box">
						<div class="solution_box">
							<a href="company/harim.php" class="btn_menu"> <span
								class="over"> <img src="common/img/main/sample.jpg"
									alt="" class="bg_img"> <span class="label font_ib">メッセージ<br />メッセージ
								</span>

							</span>
							</a>
						</div>
					</div>
					<div class="list_box">
						<div class="solution_box">
							<a href="center/faq.php" class="btn_menu"> </span>--> <span
								class="over"> <img src="common/img/main/sample.jpg"
									alt="" class="bg_img"> <span class="label font_ib">メッセージ
										<br />メッセージ
								</span>

							</span>
							</a>
						</div>
					</div>
				</div>
			</div>
			<div class="slide_btn">
				<div class="btn_box">
					<a href="#" class="btn_slide prev">前へ</a> <a href="#"
						class="btn_slide next">後へ</a>
				</div>
			</div>
		</div>
	</div>
	<!-- 브랜드 -->
	<script>
		function changebrnadtext(num) {
			if (num == '1') {
				$('#m1').attr('class', 'btn_tab active');
				$('#w1').attr('class', 'active');
				$('#m2').attr('class', 'btn_tab');
				$('#w2').attr('class', '');
				$('#m3').attr('class', 'btn_tab');
				$('#w3').attr('class', '');
				$('#m4').attr('class', 'btn_tab');
				$('#w4').attr('class', '');
				$('#m5').attr('class', 'btn_tab');
				$('#w5').attr('class', '');
				$('#m6').attr('class', 'btn_tab');
				$('#w6').attr('class', '');
				$('#m7').attr('class', 'btn_tab');
				$('#w7').attr('class', '');
				$('#m8').attr('class', 'btn_tab');
				$('#w8').attr('class', '');
				$('#bgcg').attr('class', 'main_brand_info brand_bg1');
				var text1 = '<p class="title font_ib">メッセージ<br class="hide_mobile"/>メッセージ<br/>メッセージ</p>';
				text1 += '<p>メッセージ</p>';
				$('#text1').html(text1);

			} else if (num == '2') {
				$('#m1').attr('class', 'btn_tab');
				$('#w1').attr('class', '');
				$('#m2').attr('class', 'btn_tab active');
				$('#w2').attr('class', 'active');
				$('#m3').attr('class', 'btn_tab');
				$('#w3').attr('class', '');
				$('#m4').attr('class', 'btn_tab');
				$('#w4').attr('class', '');
				$('#m5').attr('class', 'btn_tab');
				$('#w5').attr('class', '');
				$('#m6').attr('class', 'btn_tab');
				$('#w6').attr('class', '');
				$('#m7').attr('class', 'btn_tab');
				$('#w7').attr('class', '');
				$('#m8').attr('class', 'btn_tab');
				$('#w8').attr('class', '');
				$('#bgcg').attr('class', 'main_brand_info brand_bg2');
				var text1 = '<p class="title font_ib">メッセージ</p>';
				text1 += '<p>メッセージ</p>';
				$('#text1').html(text1);
			} else if (num == '3') {
				$('#m1').attr('class', 'btn_tab');
				$('#w1').attr('class', '');
				$('#m2').attr('class', 'btn_tab');
				$('#w2').attr('class', '');
				$('#m3').attr('class', 'btn_tab active');
				$('#w3').attr('class', 'active');
				$('#m4').attr('class', 'btn_tab');
				$('#w4').attr('class', '');
				$('#m5').attr('class', 'btn_tab');
				$('#w5').attr('class', '');
				$('#m6').attr('class', 'btn_tab');
				$('#w6').attr('class', '');
				$('#m7').attr('class', 'btn_tab');
				$('#w7').attr('class', '');
				$('#m8').attr('class', 'btn_tab');
				$('#w8').attr('class', '');
				$('#bgcg').attr('class', 'main_brand_info brand_bg3');
				var text1 = '<p class="title font_ib">メッセージ <br class="hide_mobile"/>メッセージ<br/>メッセージ</p>';
				text1 += '<p>メッセージ</p>';
				$('#text1').html(text1);
			} else if (num == '4') {
				$('#m1').attr('class', 'btn_tab');
				$('#w1').attr('class', '');
				$('#m2').attr('class', 'btn_tab');
				$('#w2').attr('class', '');
				$('#m3').attr('class', 'btn_tab');
				$('#w3').attr('class', '');
				$('#m4').attr('class', 'btn_tab active');
				$('#w4').attr('class', 'active');
				$('#m5').attr('class', 'btn_tab');
				$('#w5').attr('class', '');
				$('#m6').attr('class', 'btn_tab');
				$('#w6').attr('class', '');
				$('#m7').attr('class', 'btn_tab');
				$('#w7').attr('class', '');
				$('#m8').attr('class', 'btn_tab');
				$('#w8').attr('class', '');
				$('#bgcg').attr('class', 'main_brand_info brand_bg4');
				var text1 = '<p class="title font_ib">メッセージ 6</p>';
				text1 += '<p>メッセージ</p>';
				$('#text1').html(text1);
			} else if (num == '5') {
				$('#m1').attr('class', 'btn_tab');
				$('#w1').attr('class', '');
				$('#m2').attr('class', 'btn_tab');
				$('#w2').attr('class', '');
				$('#m3').attr('class', 'btn_tab');
				$('#w3').attr('class', '');
				$('#m4').attr('class', 'btn_tab');
				$('#w4').attr('class', '');
				$('#m5').attr('class', 'btn_tab active');
				$('#w5').attr('class', 'active');
				$('#m6').attr('class', 'btn_tab');
				$('#w6').attr('class', '');
				$('#m7').attr('class', 'btn_tab');
				$('#w7').attr('class', '');
				$('#m8').attr('class', 'btn_tab');
				$('#w8').attr('class', '');
				$('#bgcg').attr('class', 'main_brand_info brand_bg5');
				var text1 = '<p class="title font_ib">メッセージ<br class="hide_mobile" />メッセージ </p>';
				text1 += '<p>メッセージ</p>';
				$('#text1').html(text1);
			} else if (num == '6') {
				$('#m1').attr('class', 'btn_tab');
				$('#w1').attr('class', '');
				$('#m2').attr('class', 'btn_tab');
				$('#w2').attr('class', '');
				$('#m3').attr('class', 'btn_tab');
				$('#w3').attr('class', '');
				$('#m4').attr('class', 'btn_tab');
				$('#w4').attr('class', '');
				$('#m5').attr('class', 'btn_tab');
				$('#w5').attr('class', '');
				$('#m6').attr('class', 'btn_tab active');
				$('#w6').attr('class', 'active');
				$('#m7').attr('class', 'btn_tab');
				$('#w7').attr('class', '');
				$('#m8').attr('class', 'btn_tab');
				$('#w8').attr('class', '');
				$('#bgcg').attr('class', 'main_brand_info brand_bg6');
				var text1 = '<p class="title font_ib">メッセージ<br/>メッセージ</p>';
				text1 += '<p>メッセージ</p>';
				$('#text1').html(text1);
			} else if (num == '7') {
				$('#m1').attr('class', 'btn_tab');
				$('#w1').attr('class', '');
				$('#m2').attr('class', 'btn_tab');
				$('#w2').attr('class', '');
				$('#m3').attr('class', 'btn_tab');
				$('#w3').attr('class', '');
				$('#m4').attr('class', 'btn_tab');
				$('#w4').attr('class', '');
				$('#m5').attr('class', 'btn_tab');
				$('#w5').attr('class', '');
				$('#m6').attr('class', 'btn_tab');
				$('#w6').attr('class', '');
				$('#m7').attr('class', 'btn_tab active');
				$('#w7').attr('class', 'active');
				$('#m8').attr('class', 'btn_tab');
				$('#w8').attr('class', '');
				$('#bgcg').attr('class', 'main_brand_info brand_bg7');
				var text1 = '<p class="title font_ib">メッセージ <br class="hide_mobile" /> メッセージ</p>';
				text1 += '<p>メッセージ </p>';
				$('#text1').html(text1);
			} else {
				$('#m1').attr('class', 'btn_tab active');
				$('#w1').attr('class', 'active');
				$('#m2').attr('class', 'btn_tab');
				$('#w2').attr('class', '');
				$('#m3').attr('class', 'btn_tab');
				$('#w3').attr('class', '');
				$('#m4').attr('class', 'btn_tab');
				$('#w4').attr('class', '');
				$('#m5').attr('class', 'btn_tab');
				$('#w5').attr('class', '');
				$('#m6').attr('class', 'btn_tab');
				$('#w6').attr('class', '');
				$('#m7').attr('class', 'btn_tab');
				$('#w7').attr('class', '');
				$('#m8').attr('class', 'btn_tab');
				$('#w8').attr('class', '');
			}
		}
	</script>
	<div class="main_brand_wrap">
		<div class="main_title">
			<p class="label">二つ</p>
			<p class="title font_ib">sample</p>
			<p class="desc">
				sample <br />sample
			</p>
		</div>

		<div class="lnb_tab_box show_mobile">
			<div class="lnb_tab_wrap">
				<div class="lnb_tab_menu">
					<a href="javascript:changebrnadtext('1')" id="m1"
						class="btn_tab active">sample</a>
					<!-- 클릭하면, actvie가 활성화되고 -->
					<a href="javascript:changebrnadtext('2')" id="m2" class="btn_tab">sample</a>
					<a href="javascript:changebrnadtext('3')" id="m3" class="btn_tab">sample</a>
					<a href="javascript:changebrnadtext('4')" id="m4" class="btn_tab">sample</a>
					<a href="javascript:changebrnadtext('5')" id="m5" class="btn_tab">sample</a>
					<a href="javascript:changebrnadtext('6')" id="m6" class="btn_tab">sample</a>
					<a href="javascript:changebrnadtext('7')" id="m7" class="btn_tab">sample</a>
				</div>
			</div>
		</div>

		<div id="bgcg" class="main_brand_info brand_bg1">
			<!-- bg1 ~ 7 숫자 변경되도록 -->
			<div class="contains">
				<div class="right_text_box">
					<div class="main_brand_tab hide_mobile">
						<a href="javascript:changebrnadtext('1')" id="w1" class="active">sample</a>
						<a href="javascript:changebrnadtext('2')" id="w2">sample</a> <a
							href="javascript:changebrnadtext('3')" id="w3">sample</a> <a
							href="javascript:changebrnadtext('4')" id="w4">sample</a> <a
							href="javascript:changebrnadtext('5')" id="w5">sample</a> <a
							href="javascript:changebrnadtext('6')" id="w6">sample</a> <a
							href="javascript:changebrnadtext('7')" id="w7">sample</a>
					</div>
					<div class="info_text" id="text1">
						<p class="title font_ib">
							sample<br class="hide_mobile" />sample<br />sample
						</p>
						<p>sample</p>
					</div>
				</div>
			</div>
		</div>

	</div>
	<!-- 찾는이유 -->
	<div class="main_service main_panel">
		<div class="main_title">
			<p class="label">三つ</p>
			<p class="title font_ib">sample</p>
			<p class="desc">
				sample <br />sample
			</p>
		</div>
		<div class="service_area">
			<div class="contains">
				<div class="slide_box">
					<div class="service_slide">

						<div class="list_box">
							<div class="">
								<a href="#" class="btn_menu" target="blank" alt=""> <img
									src="file/banner/slide/sample.jpg" alt="" width="286"
									height="410" />
								</a>

							</div>
						</div>

						<div class="list_box">
							<div class="">
								<a href="#" class="btn_menu" target="blank" alt=""> <img
									src="file/banner/slide/sample.jpg" alt="" width="286"
									height="410" />
								</a>

							</div>
						</div>

						<div class="list_box">
							<div class="">
								<a href="#" class="btn_menu" target="blank" alt=""> <img
									src="file/banner/slide/sample.jpg" alt="" width="286"
									height="410" />
								</a>

							</div>
						</div>

						<div class="list_box">
							<div class="">
								<a href="#" class="btn_menu" target="blank" alt=""> <img
									src="file/banner/slide/sample.jpg" alt="" width="286"
									height="410" />
								</a>

							</div>
						</div>

					</div>
				</div>
			</div>
			<div class="slide_btn">
				<div class="btn_box">
					<a href="#" class="btn_slide prev">前へ</a> <a href="#"
						class="btn_slide next">後ろへ</a>
				</div>
			</div>
		</div>
	</div>
	<!-- 소식 -->
	<script>
		$(function() {
			$('#faq').hide();

		});
		function viewNotice(board_idx, board_type, page, num) {

			if (board_type == 'THUM_NTC_0') {
				location.href = "./center/notice_view.php?board_idx="
						+ board_idx + "&board_type=" + board_type;
			} else if (board_type == 'FAQ') {
				location.href = "./center/faq.php?board_idx=" + board_idx
						+ "&board_type=" + board_type;
			}
		}
		function changeNotice(stat) {
			if (stat == 'A') {
				$('#noti').show();
				$('#faq').hide();
				$('#bnoti').attr('class', 'tab active');
				$('#bfaq').attr('class', 'tab');
			} else if (stat == 'B') {
				$('#noti').hide();
				$('#faq').show();
				$('#bnoti').attr('class', 'tab');
				$('#bfaq').attr('class', 'tab active');
			}
		}
	</script>
	<div class="main_panel main_bbs_wrap">
		<div class="contains">
			<div class="left_bbs">
				<div class="sub_title_box">
					<p class="title font_ib">
						sample <br />sample
					</p>
				</div>
				<div class="bbs_bottom">
					<div class="tab_menu_wrap">
						<div class="tab_menu">
							<a href="javascript:changeNotice('A')" id="bnoti"
								class="tab active"><span class="tit">お知らせ</span><span
								class="icon">▼</span></a> <a href="javascript:changeNotice('B')"
								id="bfaq" class="tab"><span class="tit">FAQ</span><span
								class="icon">▼</span></a>
						</div>
					</div>
					<div class="bbs_table" id="noti">
						<ul>
							<li><a href="javascript:;"
								onClick="viewNotice('7087','THUM_NTC_0', '','');"
								class="btn_menu"> <span>【施設工事に伴う休館について 6月2日～6月30日】</span></a> <span
								class="date">2019/04/01</span></li>
						</ul>
						<a href="center/notice.php" class="btn btn_line">一覧</a>
					</div>
					<div class="bbs_table" id="faq">
						<ul>
							<li><a href="javascript:;"
								onClick="viewNotice('7089','FAQ', '','');" class="btn_menu">
									<span>部屋食は可能ですか？</span>
							</a> <span class="date">2018.10.05</span></li>
						</ul>
						<a href="center/faq.php" class="btn btn_line">一覧</a>
					</div>
				</div>
			</div>

			<div class="right_banner">
				<div class="slider_01">
					<ul id="slider1">

						<li><a href="#" target="blank"> <img
								src="file/banner/side/sample.jpg" alt="" />

						</a></li>

					</ul>
				</div>

				<div class="slider_02">
					<ul id="slider2">

						<li><a href="#" target="blank"> <img
								src="file/banner/side2/sample.jpg" alt="" />

						</a></li>
					</ul>
				</div>
			</div>

		</div>
	</div>

	<script>
		$('#slider1').bxSlider({
			//mode: 'fade',
			autoControls : true,
			pause : 2000
		});
		$('#slider2').bxSlider({
			//mode: 'fade',
			autoControls : true,
			pause : 2000
		});

		$(document).ready(function() {
			var body = $('body').width();
			if (body < 1200) {
				var slider_03 = $('#slider_top').bxSlider({
					auto : true,
					controls : true,
					pager : true,
					maxSlides : 1,
					moveSlides : 1,
					slideWidth : 1000,
					slideMargin : 0,
					pause : 2000,
				// autoHover:true,
				});
				console.log('a');
			}
			if (body > 1200) {
				var slider_03 = $('#slider_top').bxSlider({
					auto : true,
					controls : true,
					pager : true,
					maxSlides : 4,
					moveSlides : 1,
					slideWidth : 200,
					slideMargin : 0,
					pause : 2000,
					autoHover : true,
				});
				console.log('b');
			}
		});
	</script>

	<!-- sns -->
	<div class="main_panel main_sns">
		<div class="sub_title_box">
			<p class="title font_ib">MIKIYA SNS</p>
		</div>
		<div class="contains">
			<div class="sns_area">
				<!-- sns_card -->

				<div class="sns_card">
					<a href="#" target="_blink" class="btn_menu">
						<p class="thum">
							<img src="file/board/sns/sample.jpg" alt="">
						</p>

						<div class="sns_text">
							<p class="sns_top">
								<span class="subject">メッセージ</span> <span class="icon"><img
									src="../common/img/icon/sample.jpg" alt="" /></span>
							</p>
							<p class="line"></p>
							<span class="date">2019/02/28</span>
							<div class="tag_wrap">
								<p>#タグ</p>
								<p># タグ</p>
								<p># タグ</p>

							</div>
						</div>
					</a>


				</div>
				<div class="sns_card">
					<a href="https://www.instagram.com/p/BuaUSQjnl6H/" target="_blink"
						class="btn_menu">
						<p class="thum">
							<img src="file/board/sns/sample.jpg" alt="message">
						</p>

						<div class="sns_text">
							<p class="sns_top">
								<span class="subject">メッセージ</span> <span class="icon"><img
									src="../common/img/icon/sample.jpg" alt="" /></span>
							</p>
							<p class="line"></p>
							<span class="date">2019/02/28</span>
							<div class="tag_wrap">
								<p>#タグ</p>
								<p># タグ</p>
								<p># タグ</p>

							</div>
						</div>
					</a>


				</div>
				<div class="sns_card">
					<a href="#" target="_blink" class="btn_menu">
						<p class="thum">
							<img src="file/board/sns/sample.jpg" alt="">
						</p>

						<div class="sns_text">
							<p class="sns_top">
								<span class="subject">メッセージ</span> <span class="icon"><img
									src="../common/img/icon/sample.jpg" alt="" /></span>
							</p>
							<p class="line"></p>
							<span class="date">2019/02/28</span>
							<div class="tag_wrap">
								<p>#タグ</p>
								<p>#タグ</p>
								<p>#タグ</p>

							</div>
						</div>
					</a>


				</div>
				<div class="sns_card">
					<a href="#" target="_blink" class="btn_menu">
						<p class="thum">
							<img src="file/board/sns/sample.jpg" alt="">
						</p>

						<div class="sns_text">
							<p class="sns_top">
								<span class="subject">メッセージ</span> <span class="icon"><img
									src="../common/img/icon/sample.jpg" alt="" /></span>
							</p>
							<p class="line"></p>
							<span class="date">2019/02/28</span>
							<div class="tag_wrap">
								<p>#タグ</p>

							</div>
						</div>
					</a>


				</div>

			</div>
		</div>

		<div class="btn_wrap">
			<a href="center/sns.php" class="btn btn_grayline">一覧</a>
		</div>
	</div>
	<!-- //sns -->

</div>
</body>
<%@ include file="footer.jsp"%>