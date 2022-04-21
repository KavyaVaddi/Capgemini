package com.example.demo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Inpatient {
	@Id
	int inphid;
	String inpname;
	int inpage;
	String inpaddr;
    Date inpdob;
    String inpgender, inpcity, inpstate;
    Date inpadmitteddate;
    String wardtype;
    int wardid;
    
	public Inpatient() {
		super();
	}
	public Inpatient(int inpHid, String inpName, int inpAge, String inpAddr, Date inpDob, String inpGender,
			String inpCity, String inpState, Date inpAdmittedDate, String wardType, int wardNo) {
		super();
		this.inphid = inpHid;
		this.inpname = inpName;
		this.inpage = inpAge;
		this.inpaddr = inpAddr;
		this.inpdob = inpDob;
		this.inpgender = inpGender;
		this.inpcity = inpCity;
		this.inpstate = inpState;
		this.inpadmitteddate = inpAdmittedDate;
		this.wardtype = wardType;
		this.wardid = wardNo;
	}
	
	public int getInpHid() {
		return inphid;
	}
	public void setInpHid(int inpHid) {
		this.inphid = inpHid;
	}
	public String getInpName() {
		return inpname;
	}
	public void setInpName(String inpName) {
		this.inpname = inpName;
	}
	public int getInpAge() {
		return inpage;
	}
	public void setInpAge(int inpAge) {
		this.inpage = inpAge;
	}
	public String getInpAddr() {
		return inpaddr;
	}
	public void setInpAddr(String inpAddr) {
		this.inpaddr = inpAddr;
	}
	public Date getInpDob() {
		return inpdob;
	}
	public void setInpDob(Date inpDob) {
		this.inpdob = inpDob;
	}
	public String getInpGender() {
		return inpgender;
	}
	public void setInpGender(String inpGender) {
		this.inpgender = inpGender;
	}
	public String getInpCity() {
		return inpcity;
	}
	public void setInpCity(String inpCity) {
		this.inpcity = inpCity;
	}
	public String getInpState() {
		return inpstate;
	}
	public void setInpState(String inpState) {
		this.inpstate = inpState;
	}
	public Date getInpDoAdmit() {
		return inpadmitteddate;
	}
	public void setInpDoAdmit(Date inpDoAdmit) {
		this.inpadmitteddate = inpDoAdmit;
	}
	public Date getInpAdmittedDate() {
		return inpadmitteddate;
	}
	public void setInpAdmittedDate(Date inpAdmittedDate) {
		this.inpadmitteddate = inpAdmittedDate;
	}
	public String getWardType() {
		return wardtype;
	}
	public void setWardType(String wardType) {
		this.wardtype = wardType;
	}
	public int getWardNo() {
		return wardid;
	}
	public void setWardNo(int wardNo) {
		this.wardid = wardNo;
	}
	
	@Override
	public String toString() {
		return "Inpatient [inpHid=" + inphid + ", inpName=" + inpname + ", inpAge=" + inpage + ", inpAddr=" + inpaddr
				+ ", inpDob=" + inpdob + ", inpGender=" + inpgender + ", inpCity=" + inpcity + ", inpState=" + inpstate
				+ ", inpAdmittedDate=" + inpadmitteddate + ", wardType=" + wardtype + ", wardNo=" + wardid + "]";
	}
	
	
}
