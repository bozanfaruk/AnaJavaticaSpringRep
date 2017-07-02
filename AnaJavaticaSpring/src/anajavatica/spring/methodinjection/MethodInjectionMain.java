package anajavatica.spring.methodinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("javadoc")
public class MethodInjectionMain {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = new ClassPathXmlApplicationContext("methodInjection.xml");
		CarFactory carFactory = context.getBean("carFactory", CarFactory.class);
		carFactory.produceCar();
		carFactory.produceCarByInjection();
		carFactory.produceCar();
		carFactory.produceCarByInjection();
		((ClassPathXmlApplicationContext) context).close();
	}

}
