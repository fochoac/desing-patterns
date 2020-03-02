package org.decorator.pattern.solution.two;

import java.math.BigDecimal;

public class Expreso extends Beverage {

	public Expreso() {
		setDescription("Expresso coffe");

	}

	@Override
	public BigDecimal cost() {
		// TODO Auto-generated method stub
		return BigDecimal.valueOf(8);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "An " + getCoffeSize().name() + " " + getDescription();
	}
}
