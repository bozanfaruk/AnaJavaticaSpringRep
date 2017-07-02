package anajavatica.spring.bean.annotation.injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@SuppressWarnings("javadoc")
public class HoneyConfig {

	@Bean(name = "sweetHoney")
	@Scope(value = "prototype")
	public Honey createHoney() {
		return new Honey("Sweet honey");
	}

	@Bean(name = "oldHoney")
	@Scope(value = "prototype")
	public Honey createHoney2() {
		return new Honey("Old honey");
	}

}
