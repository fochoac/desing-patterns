package org.decorator.pattern.solution.one;

import java.math.BigDecimal;

public class Expreso extends Beverage {

	public Expreso(String description) {
		super(description);
		
	}

	@Override
	public BigDecimal cost() {
		// TODO Auto-generated method stub
		return BigDecimal.valueOf(8).add(getTotalCostCondiments());
	}

}
