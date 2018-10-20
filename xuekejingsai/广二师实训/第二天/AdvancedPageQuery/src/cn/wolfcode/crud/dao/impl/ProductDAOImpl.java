package cn.wolfcode.crud.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.wolfcode.crud.dao.IProductDAO;
import cn.wolfcode.crud.domain.Product;
import cn.wolfcode.crud.util.MyBatisUtil;

public class ProductDAOImpl implements IProductDAO {

	@Override
	public void save(Product p) {
		SqlSession session = MyBatisUtil.openSession();
		session.insert("cn.wolfcode.crud.mapper.ProductMapper.save", p);
		session.commit();
		session.close();
	}

	@Override
	public void delete(Long id) {
		SqlSession session = MyBatisUtil.openSession();
		session.delete("cn.wolfcode.crud.mapper.ProductMapper.delete", id);
		session.commit();
		session.close();
	}

	@Override
	public void update(Product p) {
		SqlSession session = MyBatisUtil.openSession();
		session.update("cn.wolfcode.crud.mapper.ProductMapper.update", p);
		session.commit();
		session.close();
	}

	@Override
	public Product get(Long id) {
		SqlSession session = MyBatisUtil.openSession();
		Product p = session.selectOne("cn.wolfcode.crud.mapper.ProductMapper.get", id);
		session.close();
		return p;
	}

	@Override
	public List<Product> list() {
		SqlSession session = MyBatisUtil.openSession();
		List<Product> list = session.selectList("cn.wolfcode.crud.mapper.ProductMapper.list");
		session.close();
		return list;
	}
}
