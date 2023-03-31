package spring.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//开启切面支持
@EnableAspectJAutoProxy
@ComponentScan("spring.test")
@Configuration
public class AppConfig {

}
