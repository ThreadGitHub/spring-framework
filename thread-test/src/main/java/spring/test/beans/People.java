package spring.test.beans;

import org.springframework.stereotype.Component;

@Component
public class People {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "People{" +
				"name='" + name + '\'' +
				'}';
	}
}
