<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
        <div id="content" class="sub pd_panel dogs_panel">
            <div class="wrapping">            
            	<!-- 서브타이틀 -->
                <div class="partner_top">
                    <!-- 상단 서브 배너 영역 ---------------------->
                    <div class="sub_visual">
						<img src="../../common/img/pd/dogs_bg_m.jpg" alt="" class="show_mobile"/>
					</div>

<!-- view페이지일경우, 브랜드에 따라 비쥬얼이미지가 달라져야합니다. (웹:배경이미지&컬러,모바일:이미지) -->
<!-- <div class="sub_visual" style="background-image:url(../../common/img/brand/bg.jpg); background-color:#fff">
	<img src="../../common/img/pd/dogs_bg_m.jpg" alt="모바일이미지" class="show_mobile"/>
</div>-->   
                    <!-- //상단 서브 배너 영역 ---------------------->  
                    
                   <div class="contains">
 						
                        <div class="show_mobile">
                            <p class="partner_title"><b></b></p>
                        </div>                                      
                    </div>                                        
				</div>

                <!-- //서브타이틀 -->   
                
                <div class="sub_wrap">
                	<div class="contains">      
                    	<div class="sub_title_box">
                    		<img src="common/img/room_view/1_sec1_title.png" alt=""/>                            
                        </div>
                        <div class="notice_wrap">
                        	<!-- 검색 -->
                            <script>
jQuery(function() {			
	
});
	function dogsearch(){

		f = document.searchfrm;
		f.action = searchUrl;
		f.method = 'GET';
		f.submit();
		
	}

	function brandval(){
		var brandval = '';
		 $('input:checkbox[name="brand_code"]').each(function() {
			  if(this.checked){//checked 처리된 항목의 값
					if(brandval == ''){
						brandval += this.value; 
					}else{
						brandval += ','+this.value;
					}
			  }
		 });
		$('#b_brand_code').val(brandval);		
		
	}

	function ageval(){
		var ageval = '';
		 $('input:checkbox[name="age_code"]').each(function() {
			  if(this.checked){//checked 처리된 항목의 값
					if(ageval == ''){
						ageval += this.value; 
					}else{
						ageval += ','+this.value;
					}
			  }
		 });
		$('#b_age').val(ageval);		
		
	}

	function sizeval(){
		var sizeval = '';
		 $('input:checkbox[name="size_code"]').each(function() {
			  if(this.checked){//checked 처리된 항목의 값
					if(sizeval == ''){
						sizeval += this.value; 
					}else{
						sizeval += ','+this.value;
					}
			  }
		 });
		$('#b_size').val(sizeval);		
		
	}
	function functionval(){
		var functionval = '';
		 $('input:checkbox[name="function_code"]').each(function() {
			  if(this.checked){//checked 처리된 항목의 값
					if(functionval == ''){
						functionval += this.value; 
					}else{
						functionval += ','+this.value;
					}
			  }
		 });
		$('#b_function').val(functionval);		
		
	}

	function newcheck(){
		location.href =  searchUrl;

	}
</script>
							
							<div class="record_group">
								<p>木造りの温かみと和の情緒あふれる<span>${totcount}</span>タイプの客室。</p>
							</div>      
                        	
                            <!-- 리스트-->
                            <div class="pd_area">
                            	<ul>
								<c:set var="num" value="${totcount - ((nowpage-1) * 10)}"/>
								<c:forEach var="room" items="${room}">
                            	   <li>
                                		<!-- <a href="../javascript:viewNotice('7182')"> -->
                                		<p class="img"><img src="upload/room/${room.rurl_off}" onmouseover="upload/room/${room.rurl_on}" onmouseout="upload/room/${room.rurl_off}" alt=""　class="viewphoto"/></p>
                                    	<p class="cate"><img src="upload/room/${room.rurl_title}" alt="" class="viewphoto"/></p>                                        
                                        <div class="btn-list-area">
										<a href="#" onclick="fncRoomReservation('R1'); return false;" class="btn-default">ご予約</a>
										<a href="/room/deluxe/businessDeluxe.do?roomCode=R1" class="btn-default">詳細</a>
										</div>
                                   </li>
                                 </c:forEach>   
                                   
                                    
                                </ul>
                            </div>   
                        </div>                    
                    </div>                    
                </div>
                
                

                
        	</div>
        </div>
        <!-- //컨텐츠 -->
<%@ include file="../footer.jsp" %>