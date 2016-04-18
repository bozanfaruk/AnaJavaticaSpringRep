package anajavatica.spring.bean.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {

	public static void main(String[] args) {

		// AnnotationConfigApplicationContext ctx = new
		// AnnotationConfigApplicationContext();
		// ctx.register(AnnotationDeveloper.class);
		// ctx.register(AnnotationConfigClass.class);
		// ctx.refresh();
		// AnnotationDeveloper developer = (AnnotationDeveloper)
		// ctx.getBean("DeveloperBean",
		// new Object[] { "Developer1", "Java" });
		// developer.sayHello();
		// ctx.close();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		AnnotationBean prototypeBean = context.getBean("prototypeBean", AnnotationBean.class);
		prototypeBean.sayHello();
		AnnotationBean prototypeBean2 = context.getBean("prototypeBean", AnnotationBean.class);
		prototypeBean2.sayHello();
		AnnotationBean singletonBean = context.getBean("singletonBean", AnnotationBean.class);
		singletonBean.sayHello();
		AnnotationBean singletonBean2 = context.getBean("singletonBean", AnnotationBean.class);
		singletonBean2.sayHello();
		context.close();

	}

}
