package cn.wolfcode.crud.service.impl;

import cn.wolfcode.crud.dao.IUserDAO;
import cn.wolfcode.crud.dao.impl.UserDAOImpl;
import cn.wolfcode.crud.domain.User;
import cn.wolfcode.crud.service.IUserService;

public class UserServiceImpl implements IUserService {

	private IUserDAO dao = new UserDAOImpl();
	@Override
	public User selectByUsernameAndPassword(String username, String password) {
		return dao.selectByUsernameAndPassword(username, password);
	}

}
