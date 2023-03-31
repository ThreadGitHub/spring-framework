package spring.test.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//@Component
@Aspect
public class UserAspect {
	@Pointcut("execution(* spring.test.beans.User.sayHi(..))")
	public void point(){

	}

	@Before(value = "point()")
	public void before() {
		System.out.println("user-before");
	}

	@After("point()")
	public void after() {
		System.out.println("user-after");
	}
}
