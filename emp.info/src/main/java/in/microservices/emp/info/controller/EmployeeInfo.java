package in.microservices.emp.info.controller;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import in.microservices.emp.info.model.Departments;
import in.microservices.emp.info.model.EmplDetails;
import in.microservices.emp.info.model.EmployeeDetails;


@RestController
@RequestMapping("/emplDetails")
public class EmployeeInfo {
	
	@Autowired RestTemplate restTemplate;
	
	@GetMapping("/empInfo/{empId}")
	EmployeeDetails getEmpInfoById(@PathVariable int empId) throws MalformedURLException, URISyntaxException{
		
		
		
		URI empUrl=  new URI("localhost:8081/empl/empId");
		URI deptUrl= new URI("localhost:8083/department/department/901");
		
		EmplDetails emplDetails=restTemplate.getForObject("http://localhost:8081/empl/empId", EmplDetails.class);
		Departments departments=restTemplate.getForObject("http://localhost:8083/department/department/901", Departments.class);
		
		EmployeeDetails employeeDetails = new EmployeeDetails(
				emplDetails.getEmployeeId(),
				emplDetails.getName(),
				departments.getDepartmentName()			
				
				);
		
		
		
//		localhost:8082/emplDetails/empInfo/901
		
	//	EmployeeDetails employeeDetails  = new EmployeeDetails(901,"Ajeeth","Account");
		return employeeDetails;
	}

}
