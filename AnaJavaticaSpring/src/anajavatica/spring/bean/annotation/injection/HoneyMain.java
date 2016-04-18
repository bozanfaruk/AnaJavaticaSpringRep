package anajavatica.spring.bean.annotation.injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HoneyMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HoneyConfig.class, Bear.class);
		Bear bear = context.getBean("bear", Bear.class);
		bear.oldHoneyParty();
		bear.sweetHoneyParty();
		context.close();

	}

}
