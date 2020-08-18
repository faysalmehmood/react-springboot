package com.faysal.springboot.springboot.service;

import java.util.List;

import com.faysal.springboot.springboot.modal.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.faysal.springboot.springboot.dao.EmployeeDAO;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDao;

	@Transactional
	@Override
	public List<Employee> get() {
		return employeeDao.get();
	}

	@Transactional
	@Override
	public Employee get(int id) {
		return employeeDao.get(id);
	}

	@Transactional
	@Override
	public void save(Employee employee) {
		employeeDao.save(employee);
		
	}

	@Transactional
	@Override
	public void delete(int id) {
		employeeDao.delete(id);
		
	}

}
