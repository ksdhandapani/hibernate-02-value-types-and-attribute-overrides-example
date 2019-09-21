package com.sakdd.models;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private Integer employeeId;
	@Column(name = "employee_name")
	private String employeeName;
	@Column(name = "gender")
	private String gender;
	@Column(name = "department")
	private String department;
	@Embedded
	@AttributeOverrides(value = { 
			@AttributeOverride(column = @Column(name="home_street_name"), name = "streetName"),
			@AttributeOverride(column = @Column(name="home_city"), name = "city"),
			@AttributeOverride(column = @Column(name="home_state"), name = "state"),
			@AttributeOverride(column = @Column(name="home_country"), name = "country")
			
	})
	private Address homeAddress;
	
	@Embedded
	@AttributeOverrides(value = { 
			@AttributeOverride(column = @Column(name="office_street_name"), name = "streetName"),
			@AttributeOverride(column = @Column(name="office_city"), name = "city"),
			@AttributeOverride(column = @Column(name="office_state"), name = "state"),
			@AttributeOverride(column = @Column(name="office_country"), name = "country")
			
	})
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

	public Employee(Integer employeeId, String employeeName, String gender, String department, Address homeAddress,
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
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", gender=" + gender
				+ ", department=" + department + ", homeAddress=" + homeAddress + ", officeAddress=" + officeAddress
				+ "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
