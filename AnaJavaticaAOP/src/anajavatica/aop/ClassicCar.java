package anajavatica.aop;

public class ClassicCar extends Car {

	@Override
	public void startEngine() {
		System.out.println("Classic car engine started...");
	}

	@Override
	public int getHP() {
		return 115;
	}

}
