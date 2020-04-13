package main.java.ch.fhnw.module06.ab1;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ApplicationView extends VBox{
	Button button;
	
	public ApplicationView(Stage stage, PresentationModel pm) {
		stage.titleProperty().bindBidirectional(pm.getTitle());
		button = new Button("You shouldn't be able to see this");
		button.textProperty().bindBidirectional(pm.getButtonText());
		getChildren().add(button);
		setAlignment(Pos.CENTER);
	}
}
