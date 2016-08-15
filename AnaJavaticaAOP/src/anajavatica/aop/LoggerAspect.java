package anajavatica.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggerAspect {

	@Before("execution(public int sum(..))")
	public void beforeCalculatorIntSum() {
		log("Before sum of int");
	}

	@After("execution(public int sum(..))")
	public void afterCalculatorIntSum() {
		log("After sum of int");
	}

	@Before("execution(public double sum(..))")
	public void beforeCalculatorDoubleSum() {
		log("Before sum of double");
	}

	@After("execution(public double sum(..))")
	public void afterCalculatorDoubleSum() {
		log("After sum of double");
	}

	private void log(String loggingInfo) {
		System.out.println("Logging:".concat(loggingInfo));
	}

}
