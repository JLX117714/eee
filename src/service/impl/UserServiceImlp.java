package service.impl;

import dao.UserDao;
import service.UserService;

/**
*@类名 UserServiceImlp.java
*@作者 lvsir
*@版本 V1.0
*@描述
*/
public class UserServiceImlp implements UserService {
	UserDao dao;
//设置注入
	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	
	//构造注入
//	public UserServiceImlp(UserDao dao) {
//	super();
//	this.dao = dao;
//}
	

	@Override
	public void addUser() {
		System.out.println("添加用户");

	}

	

	@Override
	public void deleteUser() {
		System.out.println("删除用户");

	}

}
