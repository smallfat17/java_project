package cn.wolfcode.crud.service.impl;

import java.util.List;

import cn.wolfcode.crud.dao.IEmployeeDAO;
import cn.wolfcode.crud.dao.impl.EmployeeDAOImpl;
import cn.wolfcode.crud.domain.Employee;
import cn.wolfcode.crud.service.IEmployeeService;

public class EmployeeServiceImpl implements IEmployeeService {
     private IEmployeeDAO employeeDAO = new EmployeeDAOImpl();
     
	@Override
	public void delete(Long id) {
		employeeDAO.delete(id);
	}

	@Override
	public void saveOrUpdate(Employee employee) {
		Long id = employee.getId();
		if(id != null ){
			 employeeDAO.update(employee);
		}else{
			employeeDAO.save(employee);
		}
	}

	@Override
	public Employee get(Long id) {
		 
		return employeeDAO.get(id);
	}

	@Override
	public List<Employee> listAll() {
		return employeeDAO.listAll();
	}
}
