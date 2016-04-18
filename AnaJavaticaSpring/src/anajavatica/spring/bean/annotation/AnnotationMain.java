package anajavatica.spring.bean.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AnnotationDeveloper.class);
		ctx.register(AnnotationConfigClass.class);
		ctx.refresh();
		AnnotationDeveloper developer = (AnnotationDeveloper) ctx.getBean("DeveloperBean",
				new Object[] { "Developer1", "Java" });
		developer.sayHello();
		ctx.close();

	}

}
