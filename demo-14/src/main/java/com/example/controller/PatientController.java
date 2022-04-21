package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Inpatient;
import com.example.demo.InpatientBill;
import com.example.demo.Outpatient;
import com.example.demo.OutpatientBill;
import com.example.demo.PatientService;
import com.example.demo.Ward;
import com.example.demo.WardService;

@RestController
@RequestMapping("/hospitalPatient")
public class PatientController {
	@Autowired
	PatientService service;
	
	@Autowired
	WardService service1;
	
	@RequestMapping("/getPatientByID/{id}")
	public ResponseEntity<Inpatient> getbyid(@PathVariable(value = "id") Integer id){
		Inpatient st = service.getInpatientById(id);
		if(st != null) {
			return new ResponseEntity<> (st, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<> (null, HttpStatus.NOT_FOUND);
		}
	}	
	
	@RequestMapping("/getBillByID/{id}")
	public ResponseEntity<InpatientBill> getbillbyid(@PathVariable(value = "id") Integer id){
		InpatientBill st = service.getBillById(id);
		if(st != null) {
			return new ResponseEntity<> (st, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<> (null, HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/inpatientregistration")
	public ResponseEntity<Inpatient> savePatientDetails(@RequestBody Inpatient s){
		List<Ward> list = service1.getAll();
		for(Ward w : list) {
			if(w.getWardType().equalsIgnoreCase(s.getWardType())) {
				int n = w.getWardId();
				service1.updateWard(n);
			}
		}
		service.addInpatient(s);
		return new ResponseEntity<Inpatient> (s, HttpStatus.OK);
	}
	
	@PostMapping("/outpatientregistration")
	public ResponseEntity<Outpatient> saveOutPatientDetails(@RequestBody Outpatient s){
		service.addOutpatient(s);
		return new ResponseEntity<Outpatient> (s, HttpStatus.OK);
	}
	
	@PostMapping("/addInBillDetails/{amt}")
	public ResponseEntity<InpatientBill> addInpatientBillDetails(@RequestBody InpatientBill s, @PathVariable(value = "amt") Integer amt){
		Inpatient inp = service.getInpatientById(s.getInpHid());
		List<Ward> list = service1.getAll();
		for(Ward w : list) {
			if(w.getWardType().equalsIgnoreCase(inp.getWardType())) {
				int n = w.getWardId();
				service1.updateWardBeds(n);
			}
		}
		service.addInpatientBillDetails(s, amt);
		return new ResponseEntity<InpatientBill> (s, HttpStatus.OK);
	}
	
	@PostMapping("/addOutBillDetails/{amt}")
	public ResponseEntity<OutpatientBill> addOutpatientBillDetails(@RequestBody OutpatientBill s, @PathVariable(value = "amt") Double amt){
		service.addOutpatientBillDetails(s, amt);
		return new ResponseEntity<OutpatientBill> (s, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Inpatient> updateInpatientDetails(@RequestBody Inpatient s){
		service.updateInpatient(s, s.getInpHid());
		return new ResponseEntity<Inpatient> (s, HttpStatus.OK);
	}

	
	@RequestMapping("/getByID/{id}")
	public ResponseEntity<Outpatient> getpatientbyid(@PathVariable(value = "id") Integer id){
		Outpatient st = service.getOutpatientById(id);
		if(st != null) {
			return new ResponseEntity<> (st, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<> (null, HttpStatus.NOT_FOUND);
		}
	}	
	
	@RequestMapping("/getOutBillByID/{id}")
	public ResponseEntity<OutpatientBill> getpatientbillbyid(@PathVariable(value = "id") Integer id){
		OutpatientBill st = service.getOutpatientBillById(id);
		if(st != null) {
			return new ResponseEntity<> (st, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<> (null, HttpStatus.NOT_FOUND);
		}
	}
	
	
}
