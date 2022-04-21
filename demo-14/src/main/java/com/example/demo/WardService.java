package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface WardService {
	void updateWard(int id);

	List<Ward> getAll();

	void updateWardBeds(int n);
}
