package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	StaffRepository srepo;

	public List<Staff> getStaffDetails() {
		// TODO Auto-generated method stub
		List<Staff> list = srepo.findAll();
		return list;
	}
	
	@Override
	public List<Staff> getDetails(String JobRole) {
		// TODO Auto-generated method stub
		List<Staff> list = srepo.findAll();
		list = list.stream().filter(s -> s.getsRole().contains(JobRole)).collect(Collectors.toList());
		return list;
		
	}
	
	public Staff getByHospitalId(int id) {
		return srepo.getById(id);
	}

	@Override
	public void addStaff(Staff s) {
		// TODO Auto-generated method stub
		srepo.save(s);
	}

	@Override
	public void updateStaff(Staff s, int id) {
		// TODO Auto-generated method stub
		Staff st = new Staff();
		st.setDoj(s.getDoj());
		st.setsAddr(s.getsAddr());
		st.setsAge(s.getsAge());
		st.setSalary(s.getSalary());
		st.setsEmailId(s.getsEmailId());
		st.setsGender(s.getsGender());
		st.setsName(s.getsName());
		st.setsPhone(s.getsPhone());
		st.setsRole(s.getsRole());
		srepo.save(st);
	}

	@Override
	public Staff deleteStaffById(int id) {
		// TODO Auto-generated method stub
		Staff st = srepo.getById(id);
		srepo.deleteById(id);
		return st;
	}

	/*
	public String getbyId(String className, int id) {
		if(className == "Inpatient") {
			return irepo.getById(id).toString();
		}
		else if(className == "InpatientBill") {
			return ibrepo.getById(id).toString();
		}
		else if(className == "Outpatient") {
			return orepo.getById(id).toString();
		}
		else if(className == "OutpatientBill") {
			return obrepo.getById(id).toString();
		}
		else if(className == "Staff") {
			return srepo.getById(id).toString();
		}
		else if(className == "Ward") {
			return wrepo.getById(id).toString();
		}
		else {
			return null;
		}
	}*/

}
