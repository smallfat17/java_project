package cn.wolfcode.crud.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import cn.wolfcode.crud.dao.IEmployeeDAO;
import cn.wolfcode.crud.dao.impl.EmployeeDAOImpl;
import cn.wolfcode.crud.domain.Employee;

public class EmployeeDAOTest {

	IEmployeeDAO employeeDAO = new EmployeeDAOImpl();

	@Test
	public void testSave() {
		Employee employee = new Employee(null, "郭美美", "123", "guo@163.com", 18);
		employeeDAO.save(employee);
	}

	@Test
	public void testDelete() {
		employeeDAO.delete(20L);
	}

	@Test
	public void testUpdate() {
		Employee employee = new Employee();
		employee.setId(2L);
		employee.setName("赵小二");
		employeeDAO.update(employee);
	}

	@Test
	public void testGet() {
		Employee employee = employeeDAO.get(1L);
		System.out.println(employee);
	}

	@Test
	public void testListAll() {
	      List<Employee> list = employeeDAO.listAll();
	      for (Employee employee : list) {
			 System.out.println(employee);
		  }
	}

}
