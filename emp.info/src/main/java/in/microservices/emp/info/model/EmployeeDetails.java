package in.microservices.emp.info.model;

public class EmployeeDetails {
	private int employeeId;
	private String employeeName;
	private String departmentName;
	
	public EmployeeDetails(){}
	
	public EmployeeDetails(int employeeId, String employeeName, String departmentName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.departmentName = departmentName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
