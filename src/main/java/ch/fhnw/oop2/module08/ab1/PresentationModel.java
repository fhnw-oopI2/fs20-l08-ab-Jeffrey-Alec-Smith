package main.java.ch.fhnw.module06.ab1;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PresentationModel {
	private StringProperty title;
	private StringProperty buttonText;
	
	public PresentationModel() {
		title = new SimpleStringProperty("This is the new title");
		buttonText = new SimpleStringProperty("I'm a button");
	}
	
	public StringProperty getTitle() {
		return title;
	}
	
	public StringProperty getButtonText() {
		return buttonText;
	}
	
}
