package anajavatica.spring.methodinjection;

import java.awt.Color;
import java.util.Random;

public abstract class CarFactory {

	private Random randomGenerator = new Random();

	public Car generateCar() {
		return new Car();
	}

	public abstract Car generateCarByInjection();

	public void produceCar() {
		Car newCar = generateCar();
		newCar.setCarColor(new Color(randomGenerator.nextInt(256), randomGenerator.nextInt(256), randomGenerator.nextInt(256)));
		System.out.println("Car produced with color: " + newCar.getCarColor().getRed() + " " + newCar.getCarColor().getGreen() + " "
				+ newCar.getCarColor().getBlue());
	}

	public void produceCarByInjection() {
		Car newCar = generateCarByInjection();
		newCar.setCarColor(new Color(randomGenerator.nextInt(256), randomGenerator.nextInt(256), randomGenerator.nextInt(256)));
		System.out.println("Car produced with injection with color: " + newCar.getCarColor().getRed() + " " + newCar.getCarColor().getGreen() + " "
				+ newCar.getCarColor().getBlue());
	}

}
