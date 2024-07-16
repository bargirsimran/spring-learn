package org.dnyanyog.controller;

import org.dnyanyog.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Autowired
	Student std;
	
	@GetMapping("/test")
	public Student test(){
		
		std.firstNmae="Simran";
		std.lastName="Bargir";
		std.mobile="9800000000";
		
		std.address.street="Gurudwara Colony";
		std.address.city="Pune";
		std.address.state="Maharashtra";
		std.address.country="India";
		
		std.batch.batchName="BE";
		std.batch.branchName="AIDS";
		std.batch.classTeacher="Supriya";
		
		std.batch.batchLocation.street="Nagar Road";
		std.batch.batchLocation.city="Pune";
		std.batch.batchLocation.state="Mh";
		std.batch.batchLocation.country="India";
		
		return std;
	}
}
