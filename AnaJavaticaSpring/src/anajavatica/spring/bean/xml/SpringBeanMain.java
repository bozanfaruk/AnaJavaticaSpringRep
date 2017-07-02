package anajavatica.spring.bean.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("javadoc")
public class SpringBeanMain {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = new ClassPathXmlApplicationContext("springBean.xml");
		PrototypeBean prototypeBeanWithConstructor = context.getBean("prototypeBeanWithConstructor",
				PrototypeBean.class);
		PrototypeBean prototypeBeanWithMethod = context.getBean("prototypeBeanWithMethod", PrototypeBean.class);
		prototypeBeanWithConstructor.log();
		prototypeBeanWithMethod.log();
		prototypeBeanWithConstructor = context.getBean("prototypeBeanWithConstructor", PrototypeBean.class);
		prototypeBeanWithMethod = context.getBean("prototypeBeanWithMethod", PrototypeBean.class);
		prototypeBeanWithConstructor.log();
		prototypeBeanWithConstructor.printNumberList();
		prototypeBeanWithConstructor.printNumberMap();
		prototypeBeanWithMethod.log();
		prototypeBeanWithMethod.printNumberList();
		prototypeBeanWithMethod.printNumberMap();
		SpringLogger springLogger = context.getBean("singletonBean", SpringSysOutLoggerImpl.class);
		System.out.println(springLogger);
		springLogger = context.getBean("singletonBean", SpringSysOutLoggerImpl.class);
		System.out.println(springLogger);
		((ClassPathXmlApplicationContext) context).close();
	}

}
