package org.decorator.pattern.solution.one;

import java.math.BigDecimal;

public class Decaf extends Beverage {

	public Decaf(String description) {
		super(description);

	}

	@Override
	public BigDecimal cost() {
		// TODO Auto-generated method stub
		return BigDecimal.valueOf(20).add(getTotalCostCondiments());
	}

}
