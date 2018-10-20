package cn.wolfcode.crud.service;

import cn.wolfcode.crud.domain.User;

public interface IUserService {

	User selectByUsernameAndPassword(String username,String password);
}
