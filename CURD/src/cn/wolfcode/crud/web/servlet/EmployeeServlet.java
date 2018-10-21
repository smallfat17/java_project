package cn.wolfcode.crud.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.wolfcode.crud.domain.Employee;
import cn.wolfcode.crud.service.IEmployeeService;
import cn.wolfcode.crud.service.impl.EmployeeServiceImpl;

public class EmployeeServlet extends HttpServlet {

	IEmployeeService employeeService = new EmployeeServiceImpl();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse arg1) throws ServletException, IOException {
		 req.setCharacterEncoding("utf-8");
		List<Employee> listAll = employeeService.listAll();
		req.setAttribute("list", listAll);
		String cmd = req.getParameter("cmd");

		if ("input".equals(cmd)) {
			input(req, arg1);
		} else if ("saveOrUpdate".equals(cmd)) {
			saveOrUpdate(req, arg1);
		} else if ("delete".equals(cmd)) {
			delete(req, arg1);
		} else {
			// 请求转发
			req.getRequestDispatcher("/WEB-INF/list.jsp").forward(req, arg1);
		}
	}

	private void input(HttpServletRequest req, HttpServletResponse arg1) throws ServletException, IOException {
		String idStr = req.getParameter("id");
		if (isLength(idStr)) {
			Long id = Long.valueOf(idStr);
			Employee employee = employeeService.get(id);
			req.setAttribute("emp", employee);
		}
		// 请求转发
		req.getRequestDispatcher("/WEB-INF/input.jsp").forward(req, arg1);
	}

	private void saveOrUpdate(HttpServletRequest req, HttpServletResponse arg1) throws ServletException, IOException {
		
		String idStr = req.getParameter("id");
		String name = req.getParameter("name");
		 System.out.println(name);
		String pwd = req.getParameter("pwd");
		String email = req.getParameter("email");
		String ageStr = req.getParameter("age");
		Long id = null;
		Integer age = null;
		if (isLength(idStr)) {
			id = Long.valueOf(idStr);
		}
		if (isLength(ageStr)) {
			age = Integer.valueOf(ageStr);
		}
		Employee employee = new Employee(id, name, pwd, email, age);
		employeeService.saveOrUpdate(employee);
		arg1.sendRedirect("/emp");
	}

	private boolean isLength(String str) {
		return str != null && str.trim().length() != 0;
	}

	private void delete(HttpServletRequest req, HttpServletResponse arg1) throws ServletException, IOException {
		String idStr = req.getParameter("id");
		Long id = null;
		if (isLength(idStr)) {
			id = Long.valueOf(idStr);
		}
		employeeService.delete(id);
		arg1.sendRedirect("/emp");
	}

}
