package com.jsl.team.dto;

import java.sql.Date;


public class ReserveVO {
	private int re_code; // Primary Key(예약 코드)
	private String mber_id; // Member 참조키
	private Date check_in;
	private Date check_out;
	private int num_people; // 인원수
	private int r_code; // 방 코드
	private int m_code; // 식사 코드 추가안할시 0?
	private int pay_code; // 결제 코드
	private int re_status; // 예약 상태 1.입금대기 2.확정 3.취소신청(승인시 테이블에서 delete)
	private Date re_date;
	private String re_memo; // 예약시 메모
	public int getRe_code() {
		return re_code;
	}
	public void setRe_code(int re_code) {
		this.re_code = re_code;
	}
	public String getMber_id() {
		return mber_id;
	}
	public void setMber_id(String mber_id) {
		this.mber_id = mber_id;
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
	public int getNum_people() {
		return num_people;
	}
	public void setNum_people(int num_people) {
		this.num_people = num_people;
	}
	public int getR_code() {
		return r_code;
	}
	public void setR_code(int r_code) {
		this.r_code = r_code;
	}
	public int getM_code() {
		return m_code;
	}
	public void setM_code(int m_code) {
		this.m_code = m_code;
	}
	public int getPay_code() {
		return pay_code;
	}
	public void setPay_code(int pay_code) {
		this.pay_code = pay_code;
	}
	public int getRe_status() {
		return re_status;
	}
	public void setRe_status(int re_status) {
		this.re_status = re_status;
	}
	public Date getRe_date() {
		return re_date;
	}
	public void setRe_date(Date re_date) {
		this.re_date = re_date;
	}
	public String getRe_memo() {
		return re_memo;
	}
	public void setRe_memo(String re_memo) {
		this.re_memo = re_memo;
	}
	
	
}
