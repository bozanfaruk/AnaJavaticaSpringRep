package anajavatica.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggerAspect {

	@Before("execution(public int anajavatica.aop.Car.getHP(..))")
	public void loggingBeforeHP() {
		log("Before HP info...");
	}

	private void log(String loggingInfo) {
		System.out.println("Logging:".concat(loggingInfo));
	}

}
