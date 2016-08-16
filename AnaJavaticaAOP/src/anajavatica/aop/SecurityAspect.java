package anajavatica.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SecurityAspect {

	@Before("execution(public void anajavatica.aop.ClassicCar.startEngine(..))")
	public void loggingBeforeClassicCarEngineStart() {
		checkSecurity("Checking security before classic car engine start...");
	}

	@After("execution(public void anajavatica.aop.ClassicCar.startEngine(..))")
	public void loggingAfterClassicCarEngineStart() {
		checkSecurity("Checking security after sport car engine start...");
	}

	@Before("execution(public void anajavatica.aop.SportCar.startEngine(..))")
	public void loggingBeforeSportCarEngineStart() {
		checkSecurity("Checking security before sport car engine start...");
	}

	@After("execution(public void anajavatica.aop.SportCar.startEngine(..))")
	public void loggingAfterSportCarEngineStart() {
		checkSecurity("Checking security after sport car engine start...");
	}

	private void checkSecurity(String loggingInfo) {
		System.out.println("Logging:".concat(loggingInfo));
	}

}
