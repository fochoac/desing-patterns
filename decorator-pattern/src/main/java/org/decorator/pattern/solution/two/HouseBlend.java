package org.decorator.pattern.solution.two;

import java.math.BigDecimal;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		setDescription("House Blend");

	}

	@Override
	public BigDecimal cost() {

		return BigDecimal.valueOf(10);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "An " + getCoffeSize().name() + " " + getDescription();
	}
}
