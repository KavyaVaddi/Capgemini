package com.example.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImplementation implements PatientService {

	@Autowired
	InpatientRepository irepo;
	
	@Autowired
	InpatientBillRepository ibrepo;
	
	@Autowired
	OutpatientRepository orepo;
	
	@Autowired
	OutpatientBillRepository obrepo;
	
	@Override
	public List<Inpatient> getInpatient() {
		// TODO Auto-generated method stub
		List<Inpatient> list = irepo.findAll();
		return list;
	}

	@Override
	public Inpatient getInpatientById(int id) {
		// TODO Auto-generated method stub
		return irepo.getById(id);
	}

	@Override
	public void addInpatient(Inpatient s) {
		// TODO Auto-generated method stub
		irepo.save(s);
	}

	@Override
	public void updateInpatient(Inpatient s, int id) {
		// TODO Auto-generated method stub
		Inpatient ip = new Inpatient();
		ip.setInpAddr(s.getInpAddr());
		ip.setInpAge(s.getInpAge());
		ip.setInpCity(s.getInpCity());
		ip.setInpDoAdmit(s.getInpDoAdmit());
		ip.setInpDob(s.getInpDob());
		ip.setInpGender(s.getInpGender());
		ip.setInpName(s.getInpName());
		ip.setInpState(s.getInpState());
	    irepo.save(ip);
	}

	@Override
	public Inpatient deleteInpatientById(int id) {
		// TODO Auto-generated method stub
		Inpatient ip = irepo.getById(id);
		irepo.deleteById(id);
		return ip;
	}

	@Override
	public List<InpatientBill> getInBillDetails() {
		// TODO Auto-generated method stub
		return ibrepo.findAll();
	}
	
	@Override
	public InpatientBill getBillById(int id) {
		// TODO Auto-generated method stub	
		return ibrepo.getById(id);
	}

	@Override
	public Outpatient getOutpatientById(int id) {
		// TODO Auto-generated method stub
		return orepo.getById(id);
	}

	@Override
	public OutpatientBill getOutpatientBillById(int id) {
		// TODO Auto-generated method stub
		return obrepo.getById(id);
	}

	@Override
	public void addInpatientBillDetails(InpatientBill s, int amt) {
		// TODO Auto-generated method stub
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
	    Date d1 = s.getAdmittedDate();
		Date d2 = s.getDischargedDate();
		//String d3 = dateformat.format(s.getAdmittedDate());
		//String d4= dateformat.format(s.getDischargedDate());
		//LocalDate localDate1 = LocalDate.parse(dateformat.format(s.getAdmittedDate()));
	   // LocalDate localDate2 = LocalDate.parse(dateformat.format(s.getDischargedDate()));
	    
	    long time_difference = d2.getTime() - d1.getTime();  
        
        // Calucalte time difference in days using TimeUnit class  
        long days_difference = TimeUnit.MILLISECONDS.toDays(time_difference) % 365;  

		// calculate difference
		//long days = Period.between(localDate1, localDate2).getDays();
		double amount = (days_difference * 10000) + amt;
        s.setAmount(amount);
		ibrepo.save(s);
	}

	@Override
	public void addOutpatient(Outpatient s) {
		// TODO Auto-generated method stub
		orepo.save(s);
	}

	@Override
	public void addOutpatientBillDetails(OutpatientBill s, Double amt) {
		// TODO Auto-generated method stub
		s.setAmount(amt);
		obrepo.save(s);
	}

	@Override
	public List<Outpatient> getOutpatient() {
		// TODO Auto-generated method stub
		return orepo.findAll();
	}

	@Override
	public List<OutpatientBill> getOutBillDetails() {
		// TODO Auto-generated method stub
		return obrepo.findAll();
	}

	
}
