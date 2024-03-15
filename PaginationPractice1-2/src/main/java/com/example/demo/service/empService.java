package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.empRepo;

@Service
public class empService {
	
	@Autowired
	empRepo emprepo;
	
	public Employee saveEmp(Employee emp) {
		return emprepo.save(emp);
		
		
	}

	public List<Employee> GetAll(int pageNumber, int pageSize) {
	
		PageRequest pagable = PageRequest.of(pageNumber, pageSize);
		
		Page<Employee> page =emprepo.findAll(pagable);
		List<Employee> list=page.getContent();
		return list;
		
	}

	

	


}
