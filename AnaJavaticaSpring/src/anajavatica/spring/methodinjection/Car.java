package anajavatica.spring.methodinjection;

import java.awt.Color;

@SuppressWarnings("javadoc")
public class Car {

	private Color carColor = null;

	public Color getCarColor() {
		return carColor;
	}

	public void setCarColor(Color carColor) {
		this.carColor = carColor;
	}

}
