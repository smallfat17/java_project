package cn.wolfcode.crud.dao;

import java.util.List;

import cn.wolfcode.crud.domain.Product;

public interface IProductDAO {
	void save(Product p);

	void delete(Long id);

	void update(Product p);

	Product get(Long id);

	List<Product> list();
}
