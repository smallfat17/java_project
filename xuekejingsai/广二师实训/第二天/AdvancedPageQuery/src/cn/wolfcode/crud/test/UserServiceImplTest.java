package cn.wolfcode.crud.test;

import org.junit.Test;

import cn.wolfcode.crud.domain.User;
import cn.wolfcode.crud.service.IUserService;
import cn.wolfcode.crud.service.impl.UserServiceImpl;

public class UserServiceImplTest {

	private IUserService service = new UserServiceImpl();
	@Test
	public void testSelectByUsernameAndPassword() {
		User u = service.selectByUsernameAndPassword("admin", "12342");
		System.out.println(u);
	}

}
