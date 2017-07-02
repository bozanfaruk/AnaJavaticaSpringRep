package anajavatica.spring.bean.annotation;

@SuppressWarnings("javadoc")
public class AnnotationBean {

	public void sayHello() {
		System.out.println(this);
	}

	public void prototypeInit() {
		System.out.println("Prototype init...");
	}

	public void singletonInit() {
		System.out.println("Singleton init...");
	}

}
