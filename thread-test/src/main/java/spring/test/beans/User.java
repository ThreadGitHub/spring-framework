package spring.test.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import spring.test.annotation.Print;

@Component
public class User {
	private Logger log = LoggerFactory.getLogger(User.class);
	private String name;

	static {
		System.out.println("user load class...");
	}

	@Print
	public void sayHi(Message message) {
		if (StringUtils.isEmpty(message.getMsg())) {
			log.info("default.hello !");
		} else {
			log.info(message.getMsg());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				'}';
	}
}
