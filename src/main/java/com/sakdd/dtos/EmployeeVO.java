package com.sakdd.dtos;

import com.sakdd.models.Address;

public class EmployeeVO {
	private Integer employeeId;
	private String employeeName;
	private String gender;
	private String department;
	private Address homeAddress;
	private Address officeAddress;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	public EmployeeVO(Integer employeeId, String employeeName, String gender, String department, Address homeAddress,
			Address officeAddress) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.gender = gender;
		this.department = department;
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
	}

	@Override
	public String toString() {
		return "EmployeeVO [employeeId=" + employeeId + ", employeeName=" + employeeName + ", gender=" + gender
				+ ", department=" + department + ", homeAddress=" + homeAddress + ", officeAddress=" + officeAddress
				+ "]";
	}

	public EmployeeVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
