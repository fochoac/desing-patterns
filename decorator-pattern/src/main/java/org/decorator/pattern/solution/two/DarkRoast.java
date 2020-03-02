package org.decorator.pattern.solution.two;

import java.math.BigDecimal;

public class DarkRoast extends Beverage {

	public DarkRoast() {

		this.setDescription("Dark Roast coffe");

	}

	@Override
	public BigDecimal cost() {
		// TODO Auto-generated method stub
		return BigDecimal.valueOf(15);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "An " + getCoffeSize().name() + " " + getDescription();
	}
}
