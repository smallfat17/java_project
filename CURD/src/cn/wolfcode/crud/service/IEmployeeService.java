package cn.wolfcode.crud.service;

import java.util.List;

import cn.wolfcode.crud.domain.Employee;

public interface IEmployeeService {


	 
     /**
      * ɾ������
      * @param id
      */
     void delete(Long id );
     
     /**
      * �޸����� ��������id
      * @param employee
      */
     void saveOrUpdate (Employee employee);
     
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
