package main.java.ch.fhnw.module06.ab1;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PresentationModel {
	private State state;
	private StringProperty buttonText;

	public PresentationModel() {
		buttonText = new SimpleStringProperty("Aus");
		state = State.OFF;
	}
	
	public StringProperty getButtonTextProperty() {
		return buttonText;
	}
	
	public void flipState() {
		switch (state) {
		case OFF:
			state = State.ON;
			buttonText.set("Ein");
			break;
			
		case ON:
			state = State.OFF;
			buttonText.set("Aus");
			break;
		}
	}

}
