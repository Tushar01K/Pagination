package com.example.demoStdController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.StdSer.stdSer;

@RestController
public class Controller {
	@Autowired
	stdSer stdser;
	
	@PostMapping("astudent")
	public Student saveStd(@RequestBody Student std) {
		return stdser.saveStd(std);
		
		
		
	}

}
