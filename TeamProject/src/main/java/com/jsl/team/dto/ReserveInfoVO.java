package com.jsl.team.dto;

import java.sql.Date;

public class ReserveInfoVO {
	private Date check_in;
	private Date check_out;
	private int r_price;
	private int r_code;
	private int m_price;
	private int m_code;
	private String pay_way;
	private int sum_price;
	private int num_people;
	private int tax_price;
	private int mileage;
	private int membership;
	private String r_title;
	private String m_title;
	private String mber_id;

	
	public String getMber_id() {
		return mber_id;
	}

	public void setMber_id(String mber_id) {
		this.mber_id = mber_id;
	}

	public int getMembership() {
		return membership;
	}

	public void setMembership(int membership) {
		this.membership = membership;
	}

	public String getR_title() {
		return r_title;
	}

	public void setR_title(String r_title) {
		this.r_title = r_title;
	}

	public String getM_title() {
		return m_title;
	}

	public void setM_title(String m_title) {
		this.m_title = m_title;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getR_code() {
		return r_code;
	}

	public void setR_code(int r_code) {
		this.r_code = r_code;
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

	public int getR_price() {
		return r_price;
	}

	public void setR_price(int r_price) {
		this.r_price = r_price;
	}

	public int getM_price() {
		return m_price;
	}

	public void setM_price(int m_price) {
		this.m_price = m_price;
	}

	public int getM_code() {
		return m_code;
	}

	public void setM_code(int m_code) {
		this.m_code = m_code;
	}

	public String getPay_way() {
		return pay_way;
	}

	public int getTax_price() {
		return tax_price;
	}

	public void setTax_price(int tax_price) {
		this.tax_price = tax_price;
	}

	public void setPay_way(String pay_way) {
		this.pay_way = pay_way;
	}

	public int getSum_price() {
		return sum_price;
	}

	public void setSum_price(int sum_price) {
		this.sum_price = sum_price;
	}

	public int getNum_people() {
		return num_people;
	}

	public void setNum_people(int num_people) {
		this.num_people = num_people;
	}

}
