package com.example.demo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class InpatientBill {
	@Id
	int billNo;
	int inpHid;
	String inpName, doctName;
	Date admittedDate, dischargedDate;
	double amount;
	
	public InpatientBill() {
		super();
	}
	public InpatientBill(int billNo, int inpHid, String inpName, String doctName, Date admittedDate,
			Date dischargedDate, double amount) {
		super();
		this.billNo = billNo;
		this.inpHid = inpHid;
		this.inpName = inpName;
		this.doctName = doctName;
		this.admittedDate = admittedDate;
		this.dischargedDate = dischargedDate;
		this.amount = amount;
	}

	public int getBillNo() {
		return billNo;
	}

	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}

	public int getInpHid() {
		return inpHid;
	}

	public void setInpHid(int inpHid) {
		this.inpHid = inpHid;
	}

	public String getInpName() {
		return inpName;
	}

	public void setInpName(String inpName) {
		this.inpName = inpName;
	}

	public String getDoctName() {
		return doctName;
	}

	public void setDoctName(String doctName) {
		this.doctName = doctName;
	}

	public Date getAdmittedDate() {
		return admittedDate;
	}

	public void setAdmittedDate(Date admittedDate) {
		this.admittedDate = admittedDate;
	}

	public Date getDischargedDate() {
		return dischargedDate;
	}

	public void setDischargedDate(Date dischargedDate) {
		this.dischargedDate = dischargedDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "InpatientBill [billNo=" + billNo + ", inpHid=" + inpHid + ", inpName=" + inpName + ", doctName="
				+ doctName + ", admittedDate=" + admittedDate + ", dischargedDate=" + dischargedDate + ", amount="
				+ amount + "]";
	}
	
	
}
