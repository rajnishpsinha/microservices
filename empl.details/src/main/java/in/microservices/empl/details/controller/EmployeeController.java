package in.microservices.empl.details.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.microservices.empl.details.model.EmplDetails;

@RestController
@RequestMapping("/empl")
public class EmployeeController {

	@GetMapping("/empId")
	public EmplDetails getTestMessage() {
		
	

		 return new EmplDetails("Ajeeth", "Manager",901,11);

	}

}
