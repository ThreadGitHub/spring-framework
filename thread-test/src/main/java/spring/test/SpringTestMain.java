package spring.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.test.beans.Message;
import spring.test.beans.User;
import spring.test.config.AppConfig;

public class SpringTestMain {
	public static Logger log = LoggerFactory.getLogger(SpringTestMain.class);

	@Test
	public void loadClass() {
		System.out.println("123");
		System.out.println(User.class.getName());
		new User();
	}

	@Test
	public void classApplicationContext() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = applicationContext.getBean(User.class);
		user.sayHi(new Message("123"));
	}

	@Test
	public void xmlApplicationContext() {
		log.info("xml");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = applicationContext.getBean(User.class);
		System.out.println(user);
	}
}
