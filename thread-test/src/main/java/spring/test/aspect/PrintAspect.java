package spring.test.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PrintAspect {
	@Pointcut("@annotation(spring.test.annotation.Print)")
	public void point() {}

	@Before("point()")
	public void beforePoint() {
		System.out.println("print注解嗷嗷嗷-before通知");
	}
}
