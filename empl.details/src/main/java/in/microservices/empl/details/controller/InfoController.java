package in.microservices.empl.details.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.microservices.empl.details.model.EmployeeDetails;

@RestController
@RequestMapping("/empl")
public class InfoController {

	@GetMapping("/empId")
	public EmployeeDetails getTestMessage() {

		 return new EmployeeDetails("Ajeeth", "Manager");

	}

}
