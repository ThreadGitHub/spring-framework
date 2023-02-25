package spring.test.processor;

import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

/**
 * bean的生命周期的扩展处理器 允许修改合并后的类定义对象
 */
@Component
public class MyMergeBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {
	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
		FileSystemResource fileSystemResource = (FileSystemResource) beanDefinition.getSource();
		System.out.println(fileSystemResource);
	}
}
