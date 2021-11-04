package com.iesluisvives.org.CalculadoraFX.view;

import com.iesluisvives.org.CalculadoraFX.controller.Controller;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class ViewMain extends VBox {
	public Label label;
	public GridPane buttons;
	public ViewMain() {
		this.label = new Label("");
		Controller controller = new Controller(this.label);
		this.buttons = new CalculatorButtons(controller);
		this.getChildren().add(this.label);
		this.getChildren().add(this.buttons);
	}
}
