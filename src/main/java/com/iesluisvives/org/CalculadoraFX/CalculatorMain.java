package com.iesluisvives.org.CalculadoraFX;

import com.iesluisvives.org.CalculadoraFX.view.ViewMain;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculatorMain extends Application {
	@Override
	public void start(Stage stage) {
		Scene scene = new Scene(new ViewMain());
		stage.setTitle("Calculadora");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}