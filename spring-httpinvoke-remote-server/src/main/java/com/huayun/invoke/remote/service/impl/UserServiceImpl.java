package com.huayun.invoke.remote.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.huayun.invoke.model.Role;
import com.huayun.invoke.model.User;
import com.huayun.invoke.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static Logger logger = Logger.getLogger(UserServiceImpl.class);

	public List<User> getAllUsers() {
		logger.info("invoke the first one");
		List<User> users = new LinkedList<User>();
		for (int i = 0; i < 2; i++) {
			User user = new User();
			user.setUserName("username " + i);
			user.setPassWord("passWord " + i);

			List<Role> roles = new LinkedList<Role>();

			Role admin = new Role();
			admin.setName("zhangsan");
			admin.setCode("admin");
			Role manager = new Role();
			manager.setCode("manager");
			manager.setName("lisi");

			roles.add(admin);
			roles.add(manager);

			user.setRoles(roles);

			users.add(user);
		}
		return users;
	}

}
