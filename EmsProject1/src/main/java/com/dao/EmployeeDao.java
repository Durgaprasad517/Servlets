package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.Employee;
import com.util.EmployeeUtil;


public class EmployeeDao {
	
	public void add(Employee employee) {
		String query = "INSERT  INTO EMP_TAB(NAME,SALARY,MOBILE,EMAIL)VALUES(?,?,?,?)";
		Connection connection = EmployeeUtil.geConnection();
		PreparedStatement preparedStatement = null;
		try {
		    preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,employee.getName());
			preparedStatement.setDouble(2,employee.getSalary());
			preparedStatement.setString(3,employee.getMobile());
			preparedStatement.setString(4,employee.getEmail());
		preparedStatement.executeUpdate();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			EmployeeUtil.close(connection,preparedStatement);
		}
	}
	public void update(Employee employee) {
		String query = "UPDATE EMP_TAB SET NAME = ?,SALARY = ?,MOBILE = ?,EMAIL = ? WHERE ID = ?";
		Connection  connection = EmployeeUtil.geConnection();
		PreparedStatement preparedStatement = null; 
		try {
          preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,employee.getName());
			preparedStatement.setDouble(2,employee.getSalary());
			preparedStatement.setString(3,employee.getMobile());
			preparedStatement.setString(4,employee.getEmail());
			preparedStatement.setInt(5, employee.getId());
		    preparedStatement.executeUpdate();	
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			EmployeeUtil.close(connection,preparedStatement);
		}
		
	}
	public void delete(int id) {
		String query = "DELETE FROM EMP_TAB WHERE ID = ?";
		Connection  connection = EmployeeUtil.geConnection();
		PreparedStatement preparedStatement = null;
		try {
			 preparedStatement = connection.prepareStatement(query);
		     preparedStatement.setInt(1, id);
		     preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			EmployeeUtil.close(connection, preparedStatement);
		}
		
	}
	public Employee findID(int id) {
		String query = "SELECT * FROM EMP_TAB WHERE ID = ?";
		Connection  connection = EmployeeUtil.geConnection();
		PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Employee employee = null;

		try {
			 preparedStatement = connection.prepareStatement(query);
			 preparedStatement.setInt(1,id);
			 resultSet = preparedStatement.executeQuery();
			 if(resultSet.next()) {
				 employee = new Employee();
				 employee.setId(resultSet.getInt("id"));
				 employee.setName(resultSet.getString("name"));
				 employee.setSalary(resultSet.getDouble("salary"));
				 employee.setMobile(resultSet.getNString("mobile"));
				 employee.setEmail(resultSet.getString("email"));
			 }
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			EmployeeUtil.close(connection, preparedStatement, resultSet);
		}
		return employee;
	}
	public List<Employee> findAll() {
		String query = "SELECT * FROM EMP_TAB";
		
		PreparedStatement preparedStatement = null;
		Connection  connection = EmployeeUtil.geConnection();
		ResultSet resultSet = null;
		List<Employee> employees = new ArrayList<>();
	    try {
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Employee employee = new Employee();
				employee.setId(resultSet.getInt("id"));
				 employee.setName(resultSet.getString("name"));
				 employee.setSalary(resultSet.getDouble("salary"));
				 employee.setMobile(resultSet.getNString("mobile"));
				 employee.setEmail(resultSet.getString("email"));
				 employees.add(employee);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			EmployeeUtil.close(connection, preparedStatement, resultSet);
		}
		return employees; 
	}
//	public static void main(String[] args) {
//		Employee employee = new Employee(0, "prasad", 50000, "6303855296", "prasad@gmail.com");
//		EmployeeDao dao = new EmployeeDao();
////		dao.update(employee);
////		List<Employee> employees = dao.findAll();
////		employees.forEach(System.out::println);
////		System.out.println(dao.findID(3));
//		dao.update(employee);
//		
//		
//		System.out.println("successfully inserted");
//		
//	}
	

}
