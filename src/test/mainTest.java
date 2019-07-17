package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.UserService;

/**
*@类名 mainTest.java
*@作者 lvsir
*@版本 V1.0
*@描述
*/
public class mainTest {
	@Test
	public void test1() {
		ApplicationContext ac=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService service=ac.getBean("userservice", UserService.class);
		service.addUser();
		service.deleteUser();
	}
	
}
