package com.example.demo.StdSer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.StdRepo.stdRep;

@Service
public class stdSer {
	@Autowired
	stdRep stdrepo;
	
	public Student saveStd(Student std) {
		return stdrepo.save(std);
		
		
		
	}

}
