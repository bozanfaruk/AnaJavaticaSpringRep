package anajavatica.spring.bean.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AnnotationConfig {

	@Bean(name = "prototypeBean", initMethod = "prototypeInit")
	@Scope(value = "prototype")
	public AnnotationBean createPrototypeBean() {
		return new AnnotationBean();
	}

	@Bean(name = "singletonBean", initMethod = "singletonInit")
	@Scope(value = "singleton")
	public AnnotationBean createSingletonBean() {
		return new AnnotationBean();
	}

}
