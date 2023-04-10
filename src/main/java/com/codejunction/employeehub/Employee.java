package com.codejunction.employeehub;

public class Employee {

	int id;

	String name;

	int age;
	
	String bloodGroup;

	String gender;

	String department;
	
	String address;

	int yearOfJoining;

	int salary;

	
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, int age, String bloodGroup,
			String gender, String department, String address,
			int yearOfJoining, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.bloodGroup = bloodGroup;
		this.gender = gender;
		this.department = department;
		this.address = address;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	

}
