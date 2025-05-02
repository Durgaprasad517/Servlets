package com.servicelayer;

import java.util.List;

import com.dao.EmployeeDao;
import com.dto.Employee;

public class EmployeeSRV {
	
	private EmployeeDao dao = new EmployeeDao();
	
	public void add(Employee employee) {
		dao.add(employee);
	}
	public void update(Employee employee) {
		dao.update(employee);
	}
	public void deleteById(int id) {
		dao.delete(id);
	}
	public Employee findbyId(int id) {
		return dao.findID(id);
		
	}
	public List<Employee> findAll() {
		return dao.findAll();
	}

}
