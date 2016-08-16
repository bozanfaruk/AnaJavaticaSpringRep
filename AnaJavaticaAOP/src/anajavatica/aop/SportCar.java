package anajavatica.aop;

public class SportCar extends Car {

	@Override
	public void startEngine() {
		System.out.println("Sport car engine started...");
	}

	@Override
	public int getHP() {
		return 250;
	}

}
