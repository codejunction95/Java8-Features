package com.codejunction.employeehub;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();

		setEmployeesData(employeeList);

		Map<String, Long> genderList = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getAddress,
						Collectors.counting()));

		System.out.println(genderList);

	}

	private static void setEmployeesData(
			List<Employee> employeeList) {
		// id , name , age , bloofgroup , gender , department , address ,
		// year of joining , salary
		employeeList.add(new Employee(111, "Ram", 20, "A+", "male",
				"IT", "Delhi", 2012, 35000));

		employeeList.add(new Employee(112, "Shita", 32, "B+",
				"female", "HR", "Delhi", 2008, 55000));

		employeeList.add(new Employee(113, "shyam", 25, "AB+", "male",
				"IT", "Bengaluru", 2010, 25000));

		employeeList.add(new Employee(114, "Gita", 32, "O+", "female",
				"IT", "Delhi", 2014, 15000));

		employeeList.add(new Employee(115, "Karina", 27, "A-",
				"female", "Facility", "Bengaluru", 2012, 25000));

		employeeList.add(new Employee(116, "Shila", 32, "B-",
				"female", "IT", "Delhi", 2016, 35000));

		employeeList.add(new Employee(117, "Virat", 25, "AB-", "male",
				"IT", "Chennai", 2012, 25000));

		employeeList.add(new Employee(118, "Salman", 32, "O-", "male",
				"HR", "Bengaluru", 2012, 25000));

		employeeList.add(new Employee(119, "Preeti", 31, "A+",
				"female", "IT", "Delhi", 2018, 45000));

		employeeList.add(new Employee(120, "Anil", 32, "AB+", "male",
				"IT", "Chennai", 2019, 25000));

	}

}
