package anajavatica.spring.bean.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SuppressWarnings("javadoc")
public class AnnotationConfigClass {

	@Bean(name = "DeveloperBean")
	public AnnotationDeveloper createDeveloper(String developerName, String developerLang) {
		return new AnnotationDeveloper(developerName, developerLang);
	}

}
