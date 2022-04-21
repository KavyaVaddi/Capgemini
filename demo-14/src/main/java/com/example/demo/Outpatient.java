package com.example.demo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Outpatient {
	@Id
	int outpHid;
	String outpName;
	int outpAge;
	String outpAddr;
    Date outpDob;
    String outpGender, outpCity, outpState;
    Date regDate;
    
	public Outpatient() {
		super();
	}
	public Outpatient(int outpHid, String inpName, int inpAge, String inpAddr, Date inpDob, String inpGender,
			String inpCity, String inpState, Date date) {
		super();
		this.outpHid = outpHid;
		this.outpName = inpName;
		this.outpAge = inpAge;
		this.outpAddr = inpAddr;
		this.outpDob = inpDob;
		this.outpGender = inpGender;
		this.outpCity = inpCity;
		this.outpState = inpState;
		this.regDate = date;
	}
	
	public int getOutpHid() {
		return outpHid;
	}
	public void setOutpHid(int outpHid) {
		this.outpHid = outpHid;
	}
	public String getInpName() {
		return outpName;
	}
	public void setInpName(String inpName) {
		this.outpName = inpName;
	}
	public int getInpAge() {
		return outpAge;
	}
	public void setInpAge(int inpAge) {
		this.outpAge = inpAge;
	}
	public String getInpAddr() {
		return outpAddr;
	}
	public void setInpAddr(String inpAddr) {
		this.outpAddr = inpAddr;
	}
	public Date getInpDob() {
		return outpDob;
	}
	public void setInpDob(Date inpDob) {
		this.outpDob = inpDob;
	}
	public String getInpGender() {
		return outpGender;
	}
	public void setInpGender(String inpGender) {
		this.outpGender = inpGender;
	}
	public String getInpCity() {
		return outpCity;
	}
	public void setInpCity(String inpCity) {
		this.outpCity = inpCity;
	}
	public String getInpState() {
		return outpState;
	}
	public void setInpState(String inpState) {
		this.outpState = inpState;
	}
	public Date getDate() {
		return regDate;
	}
	public void setDate(Date date) {
		this.regDate = date;
	}
	
	@Override
	public String toString() {
		return "Outpatient [outpHid=" + outpHid + ", inpName=" + outpName + ", inpAge=" + outpAge + ", inpAddr=" + outpAddr
				+ ", inpDob=" + outpDob + ", inpGender=" + outpGender + ", inpCity=" + outpCity + ", inpState=" + outpState
				+ ", date=" + regDate + "]";
	}
    
}
