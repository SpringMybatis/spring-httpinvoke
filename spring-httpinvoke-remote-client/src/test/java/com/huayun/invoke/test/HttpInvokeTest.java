package com.huayun.invoke.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.huayun.invoke.model.Role;
import com.huayun.invoke.model.User;
import com.huayun.invoke.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/META-INF/spring/applicationContext*.xml")
public class HttpInvokeTest {

	@Resource(name = "userService")
	private UserService userService = null;

	@Test
	public void test() throws InterruptedException {
		List<User> users = userService.getAllUsers();
		for (User user : users) {
			System.out.println(user.getUserName() + " " + user.getPassWord());
			for (Role role : user.getRoles()) {
				System.out.println(role.getName()+" "+role.getCode());
			}
		}

	}

}
