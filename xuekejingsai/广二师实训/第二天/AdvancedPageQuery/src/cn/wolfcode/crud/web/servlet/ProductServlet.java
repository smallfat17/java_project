package cn.wolfcode.crud.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.wolfcode.crud.domain.Product;
import cn.wolfcode.crud.service.IProductService;
import cn.wolfcode.crud.service.impl.ProductServiceImpl;
import cn.wolfcode.crud.util.StringUtils;

@WebServlet("/product")
public class ProductServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private IProductService service = new ProductServiceImpl();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String cmd = req.getParameter("cmd");
		if ("delete".equals(cmd)) {
			delete(req, resp);
		} else if ("input".equals(cmd)) {
			input(req, resp);
		} else if ("saveOrUpdate".equals(cmd)) {
			saveOrUpdate(req, resp);
		} else {
			list(req, resp);
		}
	}

	protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Product> list = service.list();
		req.setAttribute("list", list);
		req.getRequestDispatcher("/WEB-INF/views/product/list.jsp").forward(req, resp);
	}

	protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		if (StringUtils.hasLength(id)) {
			service.delete(Long.valueOf(id));
		}
		resp.sendRedirect("/product");
	}

	protected void input(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		if (StringUtils.hasLength(id)) {
			Product p = service.get(Long.valueOf(id));
			req.setAttribute("p", p);
		}

		req.getRequestDispatcher("/WEB-INF/views/product/input.jsp").forward(req, resp);
	}

	protected void saveOrUpdate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String productName = req.getParameter("productName");
		String salePrice = req.getParameter("salePrice");
		String dirId = req.getParameter("dirId");
		String supplier = req.getParameter("supplier");
		String brand = req.getParameter("brand");
		String cutoff = req.getParameter("cutoff");
		String costPrice = req.getParameter("costPrice");
		// 将数据封装到商品对象中
		Product p = new Product();
		p.setProductName(productName);
		p.setBrand(brand);
		p.setSupplier(supplier);
		if (StringUtils.hasLength(dirId)) {
			p.setDirId(Long.valueOf(dirId));
		}
		if (StringUtils.hasLength(cutoff)) {
			p.setCutoff(Double.valueOf(cutoff));
		}
		if (StringUtils.hasLength(salePrice)) {
			p.setSalePrice(Double.valueOf(salePrice));
		}
		if (StringUtils.hasLength(costPrice)) {
			p.setCostPrice(Double.valueOf(costPrice));
		}

		String id = req.getParameter("id");
		if (StringUtils.hasLength(id)) {
			p.setId(Long.valueOf(id));
			service.update(p);
		} else {
			service.save(p);
		}
		resp.sendRedirect("/product");
	}

}
