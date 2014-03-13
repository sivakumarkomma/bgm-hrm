package com.beans.leaveapp.employee.service;

import java.util.List;

import com.beans.common.security.users.model.Users;
import com.beans.leaveapp.employee.model.Employee;

public interface EmployeeService {
	public Employee create(Employee employee);
	public Employee delete(int id) throws EmployeeNotFound;
	
	public List<Employee> findAll();
	public Employee update(Employee employee) throws EmployeeNotFound;
	public Employee findById(int id) throws EmployeeNotFound;
	
	public Employee createEmployee(Employee employee, int employeeGradeId, int employeeTypeId, int departmentId, Users users);
}
