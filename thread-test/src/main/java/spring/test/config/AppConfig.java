package spring.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//开启切面支持
@EnableAspectJAutoProxy
@ComponentScan("spring.test")
public class AppConfig {

}
