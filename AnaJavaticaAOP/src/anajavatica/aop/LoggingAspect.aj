package anajavatica.aop;

public aspect LoggingAspect {

	private Logger logger = new Logger();

	pointcut calculatorIntSum() : execution(* Calculator.sum(int, int));

	pointcut calculatorDoubleSum() : execution(* Calculator.sum(double, double));

	before() : calculatorIntSum() {
		logger.log("Before sum of int");
	}

	after() : calculatorIntSum() {
		logger.log("After sum of int");
	}

	before() : calculatorDoubleSum() {
		logger.log("Before sum of double");
	}

	after() : calculatorDoubleSum() {
		logger.log("After sum of double");
	}

}
