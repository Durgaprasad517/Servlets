package com.controllerlayer;

import java.io.IOException;
import java.util.List;

import com.dto.Employee;
import com.servicelayer.EmployeeSRV;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/findallemp")
public class Findallemp  extends HttpServlet{
	
          @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        	EmployeeSRV employeeSRV = new EmployeeSRV();
        	List<Employee> employees = employeeSRV.findAll();
        	req.setAttribute("hello", employees);
        	req.getRequestDispatcher("findallemp.jsp").forward(req, resp);
        } 
          
         @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           doGet(req, resp);
        }
      
}
