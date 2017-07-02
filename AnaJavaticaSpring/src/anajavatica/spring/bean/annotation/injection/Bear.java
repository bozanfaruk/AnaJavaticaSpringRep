package anajavatica.spring.bean.annotation.injection;

import org.springframework.beans.factory.annotation.Autowired;

@SuppressWarnings("javadoc")
public class Bear {

	@Autowired
	private Honey sweetHoney = null;

	@Autowired
	private Honey oldHoney = null;

	public void sweetHoneyParty() {
		System.out.println("I' m eating ".concat(sweetHoney.getHoneyName()));
	}

	public void oldHoneyParty() {
		System.out.println("I' m eating ".concat(oldHoney.getHoneyName()));
	}

}
