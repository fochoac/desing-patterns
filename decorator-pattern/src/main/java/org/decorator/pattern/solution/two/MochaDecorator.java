package org.decorator.pattern.solution.two;

import java.math.BigDecimal;

public class MochaDecorator extends CondimentDecorator {
	private Beverage beverage;

	public MochaDecorator(Beverage beverage) {
		super.setDescription("Mocha");
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.toString() + " with " + super.getDescription();
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
