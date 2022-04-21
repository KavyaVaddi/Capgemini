package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WardServiceImplementation implements WardService {

	@Autowired
	WardRepository wrepo;
	
	@Override
	public void updateWard(int id) {
		// TODO Auto-generated method stub
		Ward w = wrepo.getById(id);
		w.setTotalavailbeds((w.getTotalavailbeds()-1));
		wrepo.save(w);
	}

	@Override
	public List<Ward> getAll() {
		// TODO Auto-generated method stub
		return wrepo.findAll();
	}

	@Override
	public void updateWardBeds(int n) {
		// TODO Auto-generated method stub
		Ward w = wrepo.getById(n);
		w.setTotalavailbeds((w.getTotalavailbeds()+1));
		wrepo.save(w);
	}

}
