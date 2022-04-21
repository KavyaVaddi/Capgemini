package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Ward {

	@Id
	int wardid;
	String wardtype;
	int wardno;
	int totalavailbeds;
	
	public Ward() {
		super();
	}
	public Ward(int wardId, String wardType, int wardno, int totalavailbeds) {
		super();
		this.wardid = wardId;
		this.wardtype = wardType;
		this.wardno = wardno;
		this.totalavailbeds = totalavailbeds;
	}
	
	public int getWardId() {
		return wardid;
	}
	public void setWardId(int wardId) {
		this.wardid = wardId;
	}
	public String getWardType() {
		return wardtype;
	}
	public void setWardType(String wardType) {
		this.wardtype = wardType;
	}
	public int getWardno() {
		return wardno;
	}
	public void setWardno(int wardno) {
		this.wardno = wardno;
	}
	public int getTotalavailbeds() {
		return totalavailbeds;
	}
	public void setTotalavailbeds(int totalavailbeds) {
		this.totalavailbeds = totalavailbeds;
	}
	
	@Override
	public String toString() {
		return "Ward [wardId=" + wardid + ", wardType=" + wardtype + ", wardno=" + wardno + ", totalavailbeds="
				+ totalavailbeds + "]";
	}
	
}
