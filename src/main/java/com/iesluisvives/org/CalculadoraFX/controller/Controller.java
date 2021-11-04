package com.iesluisvives.org.CalculadoraFX.controller;

import com.iesluisvives.org.CalculadoraFX.model.CalculatorModel;
import javafx.scene.control.Label;

public class Controller {
	private final Label label;
	private int number;
	private int operator;
	private char operation;
	private boolean firstNumber;
	private boolean hasOperation;
	private boolean hasOperator;

	public Controller(Label label) {
		this.number = 0;
		this.operator = 0;
		this.label = label;
		this.operation = 0;
		this.firstNumber = true;
		this.hasOperator = true;
		this.hasOperation = false;
	}

	public void addNumber(int n) {
		if (firstNumber) {
			label.setText("" + n);
			firstNumber = false;
		} else
			label.setText(label.getText() + n);
		if (operation == 0) {
			this.number = this.number * 10 + n;
		}else {
			this.operator = this.operator * 10 + n;
			hasOperator = true;
		}
	}

	public void setOperation(char c) {
		if (c != operation){
			operation = c;
			if (!hasOperation)
				label.setText(label.getText() + " " + c + " ");
			else {
				label.setText(label.getText().substring(0, label.getText().length()-3) + " " + c + " ");
				this.operator = 0;
			}
			hasOperation = true;
		}
	}

	public void clearOperations() {
		this.number = 0;
		this.operator = 0;
		this.operation = 0;
		this.firstNumber = true;
		this.hasOperation = false;
		label.setText("");
	}

	public void operate() {
		CalculatorModel model = new CalculatorModel(this.number, this.operation, this.operator);
		if (!hasOperator)
			operator = number;
		if (operation == '+' || operation == '-' || operation == 'x' || operation == '/' || operation == '%')
			label.setText(label.getText() + " = " + model.operate());
		else
			label.setText(model.operate());
		this.number = 0;
		this.operation = 0;
		this.operator = 0;
		this.hasOperation = false;
		firstNumber = true;
	}
}
