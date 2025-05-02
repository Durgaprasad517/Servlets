package com.controllerlayer;

import java.io.IOException;

import com.dto.Employee;
import com.servicelayer.EmployeeSRV;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/updateemp")
public class UpdateEmp extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		EmployeeSRV employeeSRV = new EmployeeSRV();
		Employee employee = employeeSRV.findbyId(id);
		req.setAttribute("hai", employee);
		req.getRequestDispatcher("updateEmp.jsp").forward(req, resp);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeSRV employeeSRV = new EmployeeSRV();
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		double salary = Double.parseDouble(req.getParameter("salary"));
		String mobile = req.getParameter("mobile");
		String email = req.getParameter("email");
		Employee employee = new Employee();
		employee.setId(id);
		employee.setName(name);
		employee.setSalary(salary);
		employee.setMobile(mobile);
		employee.setEmail(email);
		employeeSRV.update(employee);
    	req.getRequestDispatcher("/findallemp").forward(req, resp);


	}
	

}
