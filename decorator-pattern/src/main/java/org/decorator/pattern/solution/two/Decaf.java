package org.decorator.pattern.solution.two;

import java.math.BigDecimal;

public class Decaf extends Beverage {

	public Decaf() {
		setDescription("Decaf coffe");

	}

	@Override
	public BigDecimal cost() {
		// TODO Auto-generated method stub
		return BigDecimal.valueOf(20);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "An " + getCoffeSize().name() + " " + getDescription();
	}
}
