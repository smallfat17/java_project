package cn.wolfcode.crud.dao.impl;

import org.apache.ibatis.session.SqlSession;

import cn.wolfcode.crud.dao.IUserDAO;
import cn.wolfcode.crud.domain.User;
import cn.wolfcode.crud.util.MyBatisUtil;

public class UserDAOImpl implements IUserDAO {

	@Override
	public User selectByUsernameAndPassword(String username, String password) {
		SqlSession session = MyBatisUtil.openSession();
		User u = new User();
		u.setUsername(username);
		u.setPassword(password);
		User user = session.selectOne(
				"cn.wolfcode.crud.mapper.UserMapper.selectByUsernameAndPassword", u);
		session.close();
		return user;
	}

}
