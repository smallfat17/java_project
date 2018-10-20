package cn.wolfcode.crud.test;

import java.util.List;

import org.junit.Test;

import cn.wolfcode.crud.domain.Product;
import cn.wolfcode.crud.service.IProductService;
import cn.wolfcode.crud.service.impl.ProductServiceImpl;

public class ProductServiceImplTest {

	private IProductService service = new ProductServiceImpl();

	@Test
	public void testSave() {
		Product p = new Product(null, "娃娃", 2L, 1000D, "娃娃厂", "娃娃牌", 0.1D, 10D);
		service.save(p);
	}

	@Test
	public void testDelete() {
		service.delete(1L);
	}

	@Test
	public void testUpdate() {
		Product p = new Product(21L, "新娃娃", 2L, 800D, "娃娃厂", "娃娃牌", 0.1D, 10D);
		service.update(p);
	}

	@Test
	public void testGet() {
		Product product = service.get(21L);
		System.out.println(product);
	}

	@Test
	public void testList() {
		List<Product> list = service.list();
		for (Product product : list) {
			System.out.println(product);
		}
	}

}
