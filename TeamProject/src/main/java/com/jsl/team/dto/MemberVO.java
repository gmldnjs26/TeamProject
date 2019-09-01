package com.jsl.team.dto;

public class MemberVO {

	private String nm_last; // 한자 이름
	private String nm_first;
	
	private String nm_last_yomi; // 요미가나 이름
	private String nm_first_yomi;

	private String sexdstn_code; // M0541 남자 M0542 여자
	private String mber_id; // 아이디 primary 키 예정
	private String pw; // 패스워드
	private String reside_country_code2; // 국적 
	
	private int brthdy_yy; // 년 
	private int brthdy_mt; // 월 
	private int brthdy_de; // 일 
	private String telno; //  전화 번호 다 합친거 
	
	private String email;
	private String email_domain;
	
	private String zip1; // 우편번호
	private String adres1;
	private String adres2;
	
	private String email_recptn_yn; // 동의 정보
	private String sms_recptn_yn;
	private String dm_recptn_yn;
	
	private int grade; // 회원 등급 default = 1 로 주자
	
	private String m_comment; // 회원에대한 관리자의 간단한 코멘트(어떤 성향의 고객인지)
	private int reserve_num; // 예약하신 횟수
	private int reserve_sum; // 이때 까지 예약하신 총금액
	private int mileage; // 마일리지 

	public String getM_comment() {
		return m_comment;
	}

	public void setM_comment(String m_comment) {
		this.m_comment = m_comment;
	}

	public int getReserve_num() {
		return reserve_num;
	}

	public void setReserve_num(int reserve_num) {
		this.reserve_num = reserve_num;
	}

	public int getReserve_sum() {
		return reserve_sum;
	}

	public void setReserve_sum(int reserve_sum) {
		this.reserve_sum = reserve_sum;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String getNm_last() {
		return nm_last;
	}

	public void setNm_last(String nm_last) {
		this.nm_last = nm_last;
	}

	public String getNm_first() {
		return nm_first;
	}

	public void setNm_first(String nm_first) {
		this.nm_first = nm_first;
	}

	public String getNm_last_yomi() {
		return nm_last_yomi;
	}

	public void setNm_last_yomi(String nm_last_yomi) {
		this.nm_last_yomi = nm_last_yomi;
	}

	public String getNm_first_yomi() {
		return nm_first_yomi;
	}

	public void setNm_first_yomi(String nm_first_yomi) {
		this.nm_first_yomi = nm_first_yomi;
	}

	public String getSexdstn_code() {
		return sexdstn_code;
	}

	public void setSexdstn_code(String sexdstn_code) {
		this.sexdstn_code = sexdstn_code;
	}

	public String getMber_id() {
		return mber_id;
	}

	public void setMber_id(String mber_id) {
		this.mber_id = mber_id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getReside_country_code2() {
		return reside_country_code2;
	}

	public void setReside_country_code2(String reside_country_code2) {
		this.reside_country_code2 = reside_country_code2;
	}

	public int getBrthdy_yy() {
		return brthdy_yy;
	}

	public void setBrthdy_yy(int brthdy_yy) {
		this.brthdy_yy = brthdy_yy;
	}

	public int getBrthdy_mt() {
		return brthdy_mt;
	}

	public void setBrthdy_mt(int brthdy_mt) {
		this.brthdy_mt = brthdy_mt;
	}

	public int getBrthdy_de() {
		return brthdy_de;
	}

	public void setBrthdy_de(int brthdy_de) {
		this.brthdy_de = brthdy_de;
	}

	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail_domain() {
		return email_domain;
	}

	public void setEmail_domain(String email_domain) {
		this.email_domain = email_domain;
	}

	public String getZip1() {
		return zip1;
	}

	public void setZip1(String zip1) {
		this.zip1 = zip1;
	}

	public String getAdres1() {
		return adres1;
	}

	public void setAdres1(String adres1) {
		this.adres1 = adres1;
	}

	public String getAdres2() {
		return adres2;
	}

	public void setAdres2(String adres2) {
		this.adres2 = adres2;
	}

	public String getEmail_recptn_yn() {
		return email_recptn_yn;
	}

	public void setEmail_recptn_yn(String email_recptn_yn) {
		this.email_recptn_yn = email_recptn_yn;
	}

	public String getSms_recptn_yn() {
		return sms_recptn_yn;
	}

	public void setSms_recptn_yn(String sms_recptn_yn) {
		this.sms_recptn_yn = sms_recptn_yn;
	}

	public String getDm_recptn_yn() {
		return dm_recptn_yn;
	}

	public void setDm_recptn_yn(String dm_recptn_yn) {
		this.dm_recptn_yn = dm_recptn_yn;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	
}
