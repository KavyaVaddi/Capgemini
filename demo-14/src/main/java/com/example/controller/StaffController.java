package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.*;

@RestController
@RequestMapping("/hospitalStaff")
public class StaffController {
	
	@Autowired
	AdminService service;
	
	@RequestMapping("/getByID/{id}")
	public ResponseEntity<Staff> getbyid(@PathVariable(value = "id") Integer id){
		Staff st = service.getByHospitalId(id);
		if(st != null) {
			return new ResponseEntity<> (st, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<> (null, HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/update")
	public ResponseEntity<Staff> updateStaffDetails(@RequestBody Staff s){
		service.updateStaff(s, s.getsHid());
		return new ResponseEntity<Staff> (s, HttpStatus.OK);
	}

	
}
