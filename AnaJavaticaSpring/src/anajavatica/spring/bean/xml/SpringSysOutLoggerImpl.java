package anajavatica.spring.bean.xml;

@SuppressWarnings("javadoc")
public class SpringSysOutLoggerImpl implements SpringLogger {

	@Override
	public void springLog(Object logObject) {
		System.out.println(logObject);
	}

}
