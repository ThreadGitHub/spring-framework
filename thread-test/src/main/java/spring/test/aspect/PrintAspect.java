package spring.test.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import spring.test.beans.Message;

import java.util.Arrays;

@Component
@Aspect
public class PrintAspect {
	private Logger log = LoggerFactory.getLogger(PrintAspect.class);

	@Pointcut("@annotation(spring.test.annotation.Print)")
	public void point() {
	}

	@Before("point()")
	public void beforePoint(JoinPoint joinPoint) {
		log.info("beforePoint...");
		Object[] args = joinPoint.getArgs();
		log.info("原始参数：" + Arrays.asList(args));
		((Message)args[0]).setMsg("AAA");
		log.info("修改后的参数：" + Arrays.asList(args));
	}
}
