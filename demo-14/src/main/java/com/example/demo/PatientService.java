package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface PatientService {
	//Inpatient methods
	List<Inpatient> getInpatient();
	Inpatient getInpatientById(int id);
	public void addInpatient(Inpatient s);
	public void updateInpatient(Inpatient s, int id);
	public Inpatient deleteInpatientById(int id);
	InpatientBill getBillById(int id);
	void addInpatientBillDetails(InpatientBill s, int amt);
	List<InpatientBill> getInBillDetails();

	
	//Outpatient methods
	Outpatient getOutpatientById(int id);
	OutpatientBill getOutpatientBillById(int id);
	void addOutpatient(Outpatient s);
	void addOutpatientBillDetails(OutpatientBill s, Double amt);
	List<Outpatient> getOutpatient();
	List<OutpatientBill> getOutBillDetails();

}
