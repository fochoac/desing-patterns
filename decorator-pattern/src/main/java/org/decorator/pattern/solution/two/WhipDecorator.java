package org.decorator.pattern.solution.two;

import java.math.BigDecimal;

public class WhipDecorator extends CondimentDecorator {
	private Beverage beverage;

	public WhipDecorator(Beverage beverage) {
		super.setDescription("Whip");
		this.beverage = beverage;

	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage + " with " + super.getDescription();
	}

	@Override
	public BigDecimal cost() {
		// TODO Auto-generated method stub
		return BigDecimal.valueOf(5).add(beverage.cost());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getDescription();
	}
}
