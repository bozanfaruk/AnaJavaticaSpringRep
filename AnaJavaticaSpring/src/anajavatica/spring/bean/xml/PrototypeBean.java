package anajavatica.spring.bean.xml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrototypeBean {

	private SpringLogger springLogger = null;
	private String info = "";
	private List<Integer> numberList = new ArrayList<Integer>();
	private Map<String, Integer> numberMap = new HashMap<String, Integer>();

	public PrototypeBean() {
	}

	public PrototypeBean(SpringLogger springLogger, String info) {
		this.springLogger = springLogger;
		this.info = info;
	}

	public void initialize() {
		if (info.length() == 0)
			info = "default Info";
	}

	public void clear() {
		System.out.println(getInfo() + " clear...");
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public SpringLogger getSpringLogger() {
		return springLogger;
	}

	public void setSpringLogger(SpringLogger springLogger) {
		this.springLogger = springLogger;
	}

	public List<Integer> getNumberList() {
		return numberList;
	}

	public void setNumberList(List<Integer> numberList) {
		this.numberList = numberList;
	}

	public Map<String, Integer> getNumberMap() {
		return numberMap;
	}

	public void setNumberMap(Map<String, Integer> numberMap) {
		this.numberMap = numberMap;
	}

	public void log() {
		getSpringLogger().springLog("with logger: " + getSpringLogger() + " in: " + this + " with info " + getInfo());
	}

	public void printNumberList() {
		for (Integer i : getNumberList())
			System.out.println(i);
	}

	public void printNumberMap() {
		for (Integer i : getNumberMap().values())
			System.out.println(i);
	}
}
