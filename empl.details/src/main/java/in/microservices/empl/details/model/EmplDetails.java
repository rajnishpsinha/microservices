package in.microservices.empl.details.model;

public class EmplDetails {
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
	private int employeeId;
	private int departId;

	public EmplDetails() {
	}

	public EmplDetails(String name, String designation, int employeeId, int departId) {
		this.name = name;
		this.designation = designation;
		this.employeeId= employeeId;
		this.departId=departId;
	}

	public int getDepartId() {
		return departId;
	}

	public void setDepartId(int departId) {
		this.departId = departId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

}
