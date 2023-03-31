package spring.test.beans;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class People implements BeanNameAware {
	@Override
	public void setBeanName(String name) {
		System.out.println("people.setBeanName(" + name + ")");
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
