package com.controllerlayer;

import java.io.IOException;

import com.dto.Employee;
import com.servicelayer.EmployeeSRV;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addemp1")
public class Addemployee extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeSRV employeeSRV = new EmployeeSRV();
		String name = req.getParameter("name");
		double salary = Double.parseDouble(req.getParameter("salary"));
		String mobile = req.getParameter("mobile");
		String email = req.getParameter("email");
		Employee employee = new Employee();
		employee.setName(name);
		employee.setSalary(salary);
		employee.setMobile(mobile);
		employee.setEmail(email);
		employeeSRV.add(employee);
    	req.getRequestDispatcher("/findallemp").forward(req, resp);


	}

}
