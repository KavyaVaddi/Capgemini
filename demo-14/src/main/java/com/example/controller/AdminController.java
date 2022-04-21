package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.AdminService;
import com.example.demo.Inpatient;
import com.example.demo.InpatientBill;
import com.example.demo.Outpatient;
import com.example.demo.OutpatientBill;
import com.example.demo.PatientService;
import com.example.demo.Staff;
import com.example.demo.Ward;
import com.example.demo.WardService;

@RestController
@RequestMapping("/hospitalAdmin")
public class AdminController {
	
	@Autowired
	AdminService service;
	
	@Autowired
	PatientService pservice;
	
	@Autowired
	WardService wservice;
	
	@GetMapping("/getStaffDetails")
	public List<Staff> getDetails(){
		return service.getStaffDetails();
	}
	
	@RequestMapping("/getStaff/{str}")
	public List<Staff> findOne(@PathVariable(value = "str") String str){
		List<Staff> list = service.getDetails(str);
		return list;
	}
	
	@RequestMapping("/getStaffByID/{id}")
	public ResponseEntity<Staff> getbyid(@PathVariable(value = "id") Integer id){
		Staff st = service.getByHospitalId(id);
		if(st != null) {
			return new ResponseEntity<> (st, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<> (null, HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/save")
	public ResponseEntity<Staff> saveStaffDetails(@RequestBody Staff s){
		service.addStaff(s);
		return new ResponseEntity<Staff> (s, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Staff> updateStaffDetails(@RequestBody Staff s){
		service.updateStaff(s, s.getsHid());
		return new ResponseEntity<Staff> (s, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Staff> deleteStaffDetails(@PathVariable(value = "id") Integer id){
		Staff s = service.deleteStaffById(id);
		return new ResponseEntity<Staff> (s, HttpStatus.OK);
	}
	
	@GetMapping("/getInpatientDetails")
	public List<Inpatient> getInDetails(){
		return pservice.getInpatient();
	}
	
	@GetMapping("/getInpatientBillDetails")
	public List<InpatientBill> getInBillDetails(){
		return pservice.getInBillDetails();
	}
	
	@GetMapping("/getOutpatientDetails")
	public List<Outpatient> getOutDetails(){
		return pservice.getOutpatient();
	}
	
	@GetMapping("/getOutpatientBillDetails")
	public List<OutpatientBill> getOutBillDetails(){
		return pservice.getOutBillDetails();
	}
	
	@GetMapping("/getWardDetails")
	public List<Ward> getWardDetails(){
		return wservice.getAll();
	}
	
}

