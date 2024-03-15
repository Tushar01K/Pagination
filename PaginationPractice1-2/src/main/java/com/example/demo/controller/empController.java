package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.empService;

@RestController
public class empController {
	@Autowired
	empService empservice;

	@PostMapping("saveEmp")
	public Employee SaveEmp(@RequestBody Employee emp) {
		return empservice.saveEmp(emp);

	}

	@GetMapping("get")
	List<Employee> findAll(@RequestParam(value = "pageNumber", defaultValue = "0", required = false) int pageNumber,
			@RequestParam(value = "pageSize", defaultValue = "2", required = false) int pageSize) {
				List<Employee> List= empservice.GetAll(pageNumber,pageSize) ;
				return List;
		

	}
}
