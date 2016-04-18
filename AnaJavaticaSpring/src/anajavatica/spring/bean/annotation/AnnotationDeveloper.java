package anajavatica.spring.bean.annotation;

public class AnnotationDeveloper {

	private String developerName = "";
	private String developerLang = "";

	public AnnotationDeveloper() {
	}

	public AnnotationDeveloper(String developerName, String developerLang) {
		this.developerName = developerName;
		this.developerLang = developerLang;
	}

	public String getDeveloperName() {
		return developerName;
	}

	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}

	public String getDeveloperLang() {
		return developerLang;
	}

	public void setDeveloperLang(String developerLang) {
		this.developerLang = developerLang;
	}

	public void sayHello() {
		System.out.println("I' am ".concat(getDeveloperName()).concat(" and writing ").concat(getDeveloperLang()));
	}

}
