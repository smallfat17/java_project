package cn.wolfcode.crud.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.wolfcode.crud.dao.IEmployeeDAO;
import cn.wolfcode.crud.domain.Employee;
import cn.wolfcode.crud.util.MyBatisUtil;

public class EmployeeDAOImpl implements IEmployeeDAO {

	@Override
	public void save(Employee employee) {
		SqlSession sqlSession = MyBatisUtil.openSqlSession();
		sqlSession.insert("cn.wolfcode.crud.mapper.EmloyeeMapper.save", employee);
		sqlSession.commit();
		sqlSession.close();
	}

	@Override
	public void delete(Long id) {
		SqlSession sqlSession = MyBatisUtil.openSqlSession();
		sqlSession.delete("cn.wolfcode.crud.mapper.EmloyeeMapper.delete", id);
		sqlSession.commit();
		sqlSession.close();

	}

	@Override
	public void update(Employee employee) {
		SqlSession sqlSession = MyBatisUtil.openSqlSession();
		sqlSession.update("cn.wolfcode.crud.mapper.EmloyeeMapper.update", employee);
		sqlSession.commit();
		sqlSession.close();
	}

	@Override
	public Employee get(Long id) {
		SqlSession sqlSession = MyBatisUtil.openSqlSession();
		Employee employee = sqlSession.selectOne("cn.wolfcode.crud.mapper.EmloyeeMapper.get", id);
		return employee;
	}

	@Override
	public List<Employee> listAll() {
		SqlSession sqlSession = MyBatisUtil.openSqlSession();
		List<Employee> list = sqlSession.selectList("cn.wolfcode.crud.mapper.EmloyeeMapper.listAll");
		return list;
	}

}
