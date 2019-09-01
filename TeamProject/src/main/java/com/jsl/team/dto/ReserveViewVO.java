package com.jsl.team.dto;

import java.sql.Date;

public class ReserveViewVO {
	private int re_code;
	private String r_title; // 방테이블
	private String mber_id;
	private String nm_first; // 멤버테이블
	private String nm_last;
	private int num_people;
	private Date re_date;
	private Date check_in;
	private Date check_out;
	private int pay_price; // 결제 테이블
	private String pay_way; // 결제 테이블
	private int re_status; 
	
	
	public int getRe_code() {
		return re_code;
	}
	public void setRe_code(int re_code) {
		this.re_code = re_code;
	}
	public String getR_title() {
		return r_title;
	}
	public void setR_title(String r_title) {
		this.r_title = r_title;
	}
	public String getMber_id() {
		return mber_id;
	}
	public void setMber_id(String mber_id) {
		this.mber_id = mber_id;
	}
	public String getNm_first() {
		return nm_first;
	}
	public void setNm_first(String nm_first) {
		this.nm_first = nm_first;
	}
	public String getNm_last() {
		return nm_last;
	}
	public void setNm_last(String nm_last) {
		this.nm_last = nm_last;
	}
	public int getNum_people() {
		return num_people;
	}
	public void setNum_people(int num_people) {
		this.num_people = num_people;
	}
	public Date getRe_date() {
		return re_date;
	}
	public void setRe_date(Date re_date) {
		this.re_date = re_date;
	}
	public Date getCheck_in() {
		return check_in;
	}
	public void setCheck_in(Date check_in) {
		this.check_in = check_in;
	}
	public Date getCheck_out() {
		return check_out;
	}
	public void setCheck_out(Date check_out) {
		this.check_out = check_out;
	}
	public int getPay_price() {
		return pay_price;
	}
	public void setPay_price(int pay_price) {
		this.pay_price = pay_price;
	}
	public String getPay_way() {
		return pay_way;
	}
	public void setPay_way(String pay_way) {
		this.pay_way = pay_way;
	}
	public int getRe_status() {
		return re_status;
	}
	public void setRe_status(int re_status) {
		this.re_status = re_status;
	}
	
	
	
}
