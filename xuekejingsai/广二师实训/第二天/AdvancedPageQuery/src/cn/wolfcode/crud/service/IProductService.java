package cn.wolfcode.crud.service;

import java.util.List;

import cn.wolfcode.crud.domain.Product;

public interface IProductService {
	void save(Product p);

	void delete(Long id);

	void update(Product p);

	Product get(Long id);

	List<Product> list();
}
