package com.example.springboot.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springboot.pojo.Party;

@Service
public class CCServiceImpl implements CCService {

	@Override
	public List<Party> getParties() {
		// TODO Auto-generated method stub
		return Arrays.asList(
				new Party("Anil", 20), 
				new Party("Anil1", 21),
				new Party("Anil2", 22),
				new Party("Anil3", 23), 
				new Party("Anil4", 24));
	}

}
