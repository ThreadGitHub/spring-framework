package spring.test.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
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
	public void beforePoint(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		System.out.println(args);
		System.out.println("print注解Before通知---before通知");
	}

//	@Around("point()")
//	public void aroundPoint(ProceedingJoinPoint joinPoint) throws Throwable {
//		System.out.println("print注解环绕通知---Around之前");
//		joinPoint.proceed();
//		System.out.println("print注解环绕通知---Around之后");
//	}
}
