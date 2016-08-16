package anajavatica.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggerAspect {

	@Before("execution(public int anajavatica.aop.Car.getHP(..))")
	public void loggingBeforeHP() {
		log("Before HP info...");
	}

	@Before("execution(public * get*(..))")
	public void loggingBeforeAnyGet() {
		log("A Get method called...");
	}

	@Pointcut("execution(public * get*(..))")
	public void loggingPointcutAnyGet() {
	}

	private void log(String loggingInfo) {
		System.out.println("Logging:".concat(loggingInfo));
	}

}
