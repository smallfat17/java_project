package cn.wolfcode.crud.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.wolfcode.crud.domain.User;
import cn.wolfcode.crud.service.IUserService;
import cn.wolfcode.crud.service.impl.UserServiceImpl;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private IUserService service = new UserServiceImpl();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		User u = service.selectByUsernameAndPassword(username, password);
		if(u==null){
			//登录失败,回到登录页面
			resp.sendRedirect("/login.jsp");
		}else{
			//登录成功
			//将用户信息添加到session中
			req.getSession().setAttribute("USER_IN_SESSION", u);
			//跳转到主页面
			resp.sendRedirect("/product");
		}
	}
}
