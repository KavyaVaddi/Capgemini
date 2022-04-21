package com.example.demo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class OutpatientBill {
	@Id
	int billNo;
	int outpHid;
	String outpName, doctName;
	Date date;
	double Amount;
	String disease;
	
	public OutpatientBill() {
		super();
	}
	public OutpatientBill(int billNo, int outpHid, String outpName, String doctName, Date date, double amount,
			String disease) {
		super();
		this.billNo = billNo;
		this.outpHid = outpHid;
		this.outpName = outpName;
		this.doctName = doctName;
		this.date = date;
		Amount = amount;
		this.disease = disease;
	}
	
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public int getOutpHid() {
		return outpHid;
	}
	public void setOutpHid(int outpHid) {
		this.outpHid = outpHid;
	}
	public String getOutpName() {
		return outpName;
	}
	public void setOutpName(String outpName) {
		this.outpName = outpName;
	}
	public String getDoctName() {
		return doctName;
	}
	public void setDoctName(String doctName) {
		this.doctName = doctName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	
	@Override
	public String toString() {
		return "OutpatientBill [billNo=" + billNo + ", outpHid=" + outpHid + ", outpName=" + outpName + ", doctName="
				+ doctName + ", date=" + date + ", Amount=" + Amount + ", disease=" + disease + "]";
	}
	
	
}
