package anajavatica.aop;

public aspect SecurityAspect {

	private Authenticator authenticator = new Authenticator();
	private Logger logger = new Logger();

	pointcut secureAccess() : execution(* MessageCommunicator.deliver(..));

	before() : secureAccess() {
		authenticator.authenticate();
	}

	after() : secureAccess() {
		logger.log("MessageCommunicator.deliver");
	}

}