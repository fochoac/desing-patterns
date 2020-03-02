package org.decorator.pattern.solution.one;

import java.math.BigDecimal;

public class DarkRoast extends Beverage {

	public DarkRoast(String description) {
		super(description);

	}

	@Override
	public BigDecimal cost() {
		// TODO Auto-generated method stub
		return BigDecimal.valueOf(15).add(getTotalCostCondiments());
	}

}
