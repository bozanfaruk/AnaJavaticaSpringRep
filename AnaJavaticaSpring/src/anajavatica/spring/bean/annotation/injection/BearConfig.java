package anajavatica.spring.bean.annotation.injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BearConfig {

	@Bean(name = "bear")
	public Bear createBear() {
		return new Bear();
	}

}
