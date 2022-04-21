package com.example.demo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Staff {
	@Id
	int sHid;
	String sName, sRole;
	int sAge;
	String sGender, sAddr, sEmailId, sPhone;
	Date doj;
	double salary;
	
	public Staff() {
		super();
	}
	public Staff(int sHid, String sName, String sRole, int sAge, String sGender, String sAddr, String sEmailId,
			String sPhone, Date doj, double salary) {
		super();
		this.sHid = sHid;
		this.sName = sName;
		this.sRole = sRole;
		this.sAge = sAge;
		this.sGender = sGender;
		this.sAddr = sAddr;
		this.sEmailId = sEmailId;
		this.sPhone = sPhone;
		this.doj = doj;
		this.salary = salary;
	}
	
	public int getsHid() {
		return sHid;
	}
	public void setsHid(int sHid) {
		this.sHid = sHid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsRole() {
		return sRole;
	}
	public void setsRole(String sRole) {
		this.sRole = sRole;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	public String getsGender() {
		return sGender;
	}
	public void setsGender(String sGender) {
		this.sGender = sGender;
	}
	public String getsAddr() {
		return sAddr;
	}
	public void setsAddr(String sAddr) {
		this.sAddr = sAddr;
	}
	public String getsEmailId() {
		return sEmailId;
	}
	public void setsEmailId(String sEmailId) {
		this.sEmailId = sEmailId;
	}
	public String getsPhone() {
		return sPhone;
	}
	public void setsPhone(String sPhone) {
		this.sPhone = sPhone;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Staff [sHid=" + sHid + ", sName=" + sName + ", sRole=" + sRole + ", sAge=" + sAge + ", sGender="
				+ sGender + ", sAddr=" + sAddr + ", sEmailId=" + sEmailId + ", sPhone=" + sPhone + ", doj=" + doj
				+ ", salary=" + salary + "]";
	}
	
}
