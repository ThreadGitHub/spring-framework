package spring.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.test.beans.User;
import spring.test.config.AppConfig;

public class SpringTestMain {
	public static Logger log = LoggerFactory.getLogger(SpringTestMain.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = applicationContext.getBean(User.class);
		user.sayHi();

		log.info("test, {}", 123);
		log.error("error");
		log.debug("debug");
	}
}
