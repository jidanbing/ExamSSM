package com.zut.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Contract {

	private int id;							//����id
	private String c_no;					//��ͬ���
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date c_createtime;				//��ͬǩ������
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date c_taketime;				//��ͬ��Чʱ��
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date c_overtime;				//��ͬ����ʱ��
	private double c_rental;				//���
	private double c_cash;					//Ѻ��
	private String c_name;					//��ͬǩ����

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getC_no() {
		return c_no;
	}

	public void setC_no(String c_no) {
		this.c_no = c_no;
	}

	public Date getC_createtime() {
		return c_createtime;
	}

	public void setC_createtime(Date c_createtime) {
		this.c_createtime = c_createtime;
	}

	public Date getC_taketime() {
		return c_taketime;
	}

	public void setC_taketime(Date c_taketime) {
		this.c_taketime = c_taketime;
	}

	public Date getC_overtime() {
		return c_overtime;
	}

	public void setC_overtime(Date c_overtime) {
		this.c_overtime = c_overtime;
	}

	public double getC_rental() {
		return c_rental;
	}

	public void setC_rental(double c_rental) {
		this.c_rental = c_rental;
	}

	public double getC_cash() {
		return c_cash;
	}

	public void setC_cash(double c_cash) {
		this.c_cash = c_cash;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

}
