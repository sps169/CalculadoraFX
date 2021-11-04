package com.iesluisvives.org.CalculadoraFX.view;

import com.iesluisvives.org.CalculadoraFX.controller.Controller;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class CalculatorButtons extends GridPane {
	public CalculatorButtons(Controller controller) {
		//numbers
		Button button0 = new Button("0");
		button0.setOnAction(actionEvent -> controller.addNumber(0));
		this.add(button0, 2, 4);
		Button button1 = new Button("1");
		button1.setOnAction(actionEvent -> controller.addNumber(1));
		this.add(button1, 1, 3);
		Button button2 = new Button("2");
		button2.setOnAction(actionEvent -> controller.addNumber(2));
		this.add(button2, 2, 3);
		Button button3 = new Button("3");
		button3.setOnAction(actionEvent -> controller.addNumber(3));
		this.add(button3, 3, 3);
		Button button4 = new Button("4");
		button4.setOnAction(actionEvent -> controller.addNumber(4));
		this.add(button4, 1, 2);
		Button button5 = new Button("5");
		button5.setOnAction(actionEvent -> controller.addNumber(5));
		this.add(button5, 2, 2);
		Button button6 = new Button("6");
		button6.setOnAction(actionEvent -> controller.addNumber(6));
		this.add(button6, 3, 2);
		Button button7 = new Button("7");
		button7.setOnAction(actionEvent -> controller.addNumber(7));
		this.add(button7, 1, 1);
		Button button8 = new Button("8");
		button8.setOnAction(actionEvent -> controller.addNumber(8));
		this.add(button8, 2, 1);
		Button button9 = new Button("9");
		button9.setOnAction(actionEvent -> controller.addNumber(9));
		this.add(button9, 3, 1);

		//operations
		Button buttonPlus = new Button("+");
		buttonPlus.setOnAction(actionEvent -> controller.setOperation('+'));
		this.add(buttonPlus, 4, 1);
		Button buttonMinus = new Button("-");
		buttonMinus.setOnAction(actionEvent -> controller.setOperation('-'));
		this.add(buttonMinus, 4, 2);
		Button buttonTimes = new Button("x");
		buttonTimes.setOnAction(actionEvent -> controller.setOperation('x'));
		this.add(buttonTimes, 4, 3);
		Button buttonDivide = new Button("/");
		buttonDivide.setOnAction(actionEvent -> controller.setOperation('/'));
		this.add(buttonDivide, 4, 4);
		Button buttonModule = new Button("%");
		buttonModule.setOnAction(actionEvent -> controller.setOperation('%'));
		this.add(buttonModule, 3, 4);
		Button buttonFullErase = new Button("C");
		buttonFullErase.setOnAction(actionEvent -> controller.clearOperations());
		this.add(buttonFullErase, 1, 4);
		Button buttonOperate = new Button("=");
		buttonOperate.setOnAction(actionEvent -> controller.operate());
		this.add(buttonOperate, 1, 5, 4, 1);
		this.getChildren().forEach(b -> ((Button)b).setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE));
		setHgrow(this, Priority.ALWAYS);
		setVgrow(this, Priority.ALWAYS);

	}
}
