package anajavatica.aop;

public class Main {

	public static void main(String[] args) {

		Car classicCar = new ClassicCar();
		Car sportCar = new SportCar();

		classicCar.startEngine();
		System.out.println("Classic car HP: " + classicCar.getHP());

		sportCar.startEngine();
		System.out.println("Sport car HP: " + sportCar.getHP());
	}

}