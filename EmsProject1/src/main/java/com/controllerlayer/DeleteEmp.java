package com.controllerlayer;

import java.io.IOException;
import java.net.http.HttpClient;

import com.servicelayer.EmployeeSRV;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/deleteEmpById")
public class DeleteEmp extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		EmployeeSRV employeeSRV = new EmployeeSRV();
		employeeSRV.deleteById(id);
		req.getRequestDispatcher("/findallemp").forward(req, resp);

	}

}
