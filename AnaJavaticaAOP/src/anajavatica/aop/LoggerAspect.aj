package anajavatica.aop;

public aspect LoggerAspect {

	pointcut calculatorIntSum() : execution(* Calculator.sum(int, int));

	pointcut calculatorDoubleSum() : execution(* Calculator.sum(double, double));

	before() : calculatorIntSum() {
		log("Before sum of int");
	}

	after() : calculatorIntSum() {
		log("After sum of int");
	}

	before() : calculatorDoubleSum() {
		log("Before sum of double");
	}

	after() : calculatorDoubleSum() {
		log("After sum of double");
	}

	private void log(String loggingInfo) {
		System.out.println("Logging:".concat(loggingInfo));
	}

}
