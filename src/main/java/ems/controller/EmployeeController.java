package com.Lab5.Springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Lab5.Springboot.dao.EmployeeRepo;
import com.Lab5.Springboot.model.Employee;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepo repo;
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employee employee) {
	repo.save(employee);
	return "Employee saved";
	}
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAll(){
		return repo.findAll();
	}
	
	@GetMapping("/getEmployee/{name}")
	public List<Employee> getEmployeeByDept(@PathVariable String employeeFirstName){
		return repo.findByName(employeeFirstName);
		
	}

}
