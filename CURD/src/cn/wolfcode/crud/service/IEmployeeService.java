package cn.wolfcode.crud.service;

import java.util.List;

import cn.wolfcode.crud.domain.Employee;

public interface IEmployeeService {


	 
     /**
      * 删除数据
      * @param id
      */
     void delete(Long id );
     
     /**
      * 修改数据 包含主键id
      * @param employee
      */
     void saveOrUpdate (Employee employee);
     
     /**
      * 获取单条记录
      * @param id
      * @return
      */
     Employee get(Long id);
     
     /** 获取所有数据
      * @return
      */
     List<Employee> listAll();
}
