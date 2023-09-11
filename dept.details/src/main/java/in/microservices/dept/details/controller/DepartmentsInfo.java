package in.microservices.dept.details.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.microservices.dept.details.model.Departments;

@RestController
@RequestMapping("/department")
public class DepartmentsInfo {
	
	@GetMapping("/department/{empId}")
	public Departments getDepartmentByEmpId(@PathVariable int empId){
		
		Departments department1 = new Departments(11,"Accounts");
		return  department1; 
	}
	
	

}
