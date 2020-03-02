package org.decorator.pattern.solution.one;

import java.math.BigDecimal;

public class HouseBlend extends Beverage {

	public HouseBlend(String description) {
		super(description);

	}

	@Override
	public BigDecimal cost() {

		return BigDecimal.valueOf(10).add(getTotalCostCondiments());
	}
}
