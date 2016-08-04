package anajavatica.aop;

public aspect SecurityAspect {

	private Authenticator authenticator = new Authenticator();

	pointcut secureAccess() : execution(* MessageCommunicator.deliver(..));

	before() : secureAccess() {
		authenticator.authenticate();
	}

	after() : secureAccess() {
		authenticator.authenticate();
	}

}