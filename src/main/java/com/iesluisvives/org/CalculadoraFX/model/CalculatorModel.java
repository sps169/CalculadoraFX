package com.iesluisvives.org.CalculadoraFX.model;

public class CalculatorModel {
	private final int accumulator;
	private final char operation;
	private final int operator;

	public CalculatorModel(int accumulator, char operation, int operator) {
		this.accumulator = accumulator;
		this.operation = operation;
		this.operator = operator;
	}

	public String operate() {
		switch (operation) {
			case '+':
				return (accumulator + operator) + "";
			case '-':
				return (accumulator - operator) + "";
			case 'x':
				return (accumulator * operator) + "";
			case '/':
				if (operator != 0) {
					return (accumulator / operator) + "";
				}else {
					return "Infinity";
				}
			case '%':
				if (operator != 0) {
					return (accumulator % operator) + "";
				}else {
					return "Infinity";
				}
			default:
				return "Bruh";
		}
	}

}
