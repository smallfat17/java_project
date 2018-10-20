package cn.wolfcode.crud.dao;

import cn.wolfcode.crud.domain.User;

public interface IUserDAO {

	/**
	 * 根据账号和密码查询用户信息
	 * @param username
	 * @param password
	 * @return 查询到的用户对象,根据这个数据是否为null判断是登录成功还是失败
	 */
	User selectByUsernameAndPassword(String username,String password);
}
