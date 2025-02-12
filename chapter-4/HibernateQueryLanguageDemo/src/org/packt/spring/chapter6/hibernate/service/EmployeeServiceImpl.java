package org.packt.spring.chapter6.hibernate.service;

import java.util.List;

import org.packt.spring.chapter6.hibernate.dao.EmployeeDao;
import org.packt.spring.chapter6.hibernate.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public List<Employee> getAllEmployees() {
		List<Employee> emList = employeeDao.getAllEmployees();
		return emList;
	}

	public void insertEmployee(Employee employee) {
		employeeDao.insertEmployee(employee);
	}

	public List<Employee> hqlUsingFromClause() {
		List<Employee> emList = employeeDao.hqlUsingFromClause();
		return emList;
	}

	public List<Employee> hqlUsingFromClauseFullyQualified() {
		List<Employee> emList = employeeDao.hqlUsingFromClauseFullyQualified();
		return emList;
	}

	public List<Employee> hqlUsingAsClause() {
		List<Employee> emList = employeeDao.hqlUsingAsClause();
		return emList;
	}

	public List<Employee> hqlUsingAsClauseOptional() {
		List<Employee> emList = employeeDao.hqlUsingAsClauseOptional();
		return emList;
	}

	public List<String> hqlUsingSelectClause() {
		return employeeDao.hqlUsingSelectClause();
	}

	public List<Employee> hqlUsingWhereClause() {
		return employeeDao.hqlUsingWhereClause();
	}
	
	public List<Employee> hqlUsingOrderByClause(){
		return employeeDao.hqlUsingOrderByClause();
	}
	
	public List<Employee> hqlUsingOrderByClauseForMore(){
		return employeeDao.hqlUsingOrderByClauseForMore();
	}
	
	public List<Long> hqlUsingGroupByClause(){
		return employeeDao.hqlUsingGroupByClause();
	}
	
	public List<Employee> hqlUsingNamedParameter(){
		return employeeDao.hqlUsingNamedParameter();
	}
	
	public void hqlUsingUpdate(){
		employeeDao.hqlUsingUpdate();
	}
	
	public void hqlUsingDelete(){
		employeeDao.hqlUsingDelete();
	}
	
	public List<Employee> hqlUsingPagination(){
		return employeeDao.hqlUsingPagination();
	}
}
