package spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.test.beans.User;
import spring.test.config.AppConfig;

public class SpringTestMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = applicationContext.getBean(User.class);
		user.sayHi();
	}
}
