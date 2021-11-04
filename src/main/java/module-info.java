module com.iesluisvives.org.demojavafx {
	requires javafx.controls;
	requires javafx.fxml;


	opens com.iesluisvives.org.CalculadoraFX to javafx.fxml;
	exports com.iesluisvives.org.CalculadoraFX;
}