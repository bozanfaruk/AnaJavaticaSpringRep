package anajavatica.spring.bean.annotation.injection;

public class Honey {

	private String honeyName = "";

	public Honey(String honeyName) {
		this.honeyName = honeyName;
	}

	public String getHoneyName() {
		return honeyName;
	}

}
