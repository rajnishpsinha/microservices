package in.microservices.empl.details.model;

public class EmployeeDetails {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	private String name;
	private String designation;

	public EmployeeDetails() {
	}

	public EmployeeDetails(String name, String designation) {
		this.name = name;
		this.designation = designation;
	}

}
