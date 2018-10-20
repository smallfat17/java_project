package cn.wolfcode.crud.service.impl;

import java.util.List;

import cn.wolfcode.crud.dao.IProductDAO;
import cn.wolfcode.crud.dao.impl.ProductDAOImpl;
import cn.wolfcode.crud.domain.Product;
import cn.wolfcode.crud.service.IProductService;

public class ProductServiceImpl implements IProductService {

	private IProductDAO dao = new ProductDAOImpl();

	@Override
	public void save(Product p) {
		dao.save(p);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override
	public void update(Product p) {
		dao.update(p);
	}

	@Override
	public Product get(Long id) {
		return dao.get(id);
	}

	@Override
	public List<Product> list() {
		return dao.list();
	}

}
