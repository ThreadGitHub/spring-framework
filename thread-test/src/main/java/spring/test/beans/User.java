package spring.test.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
	private String name;

	@Autowired
	private People people;

	public void sayHi() {
		System.out.println("hello !");
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
				", people=" + people +
				'}';
	}
}
