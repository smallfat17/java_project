package cn.wolfcode.crud.dao;

import java.util.List;

import cn.wolfcode.crud.domain.Employee;

public interface IEmployeeDAO {

	/**
	 * �������� û��id
	 * @param employee
	 */
     void save(Employee employee);
     /**
      * ɾ������
      * @param id
      */
     void delete(Long id );
     
     /**
      * �޸����� ��������id
      * @param employee
      */
     void  update (Employee employee);
     
     /**
      * ��ȡ������¼
      * @param id
      * @return
      */
     Employee get(Long id);
     
     /** ��ȡ��������
      * @return
      */
     List<Employee> listAll();
     
     
}
