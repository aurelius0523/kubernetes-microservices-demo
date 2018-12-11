package com.aurelius.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public Employee getEmployee() {
	Employee emp = new Employee();
	emp.setName("kim");
	emp.setAge(28);

	return emp;
    }

    class Employee {
	private String name;
	private int age;

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

	public Employee() {

	}
    }
}
