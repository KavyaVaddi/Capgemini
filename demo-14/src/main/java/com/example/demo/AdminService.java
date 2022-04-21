package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface AdminService {

	public List<Staff> getStaffDetails();
	public List<Staff> getDetails(String JobRole);
	public Staff getByHospitalId(int id);
	public void addStaff(Staff s);
	public void updateStaff(Staff s, int id);
	public Staff deleteStaffById(int id);
	
}
