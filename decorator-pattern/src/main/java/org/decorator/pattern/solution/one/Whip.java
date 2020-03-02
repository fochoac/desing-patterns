package org.decorator.pattern.solution.one;

import java.math.BigDecimal;

public class Whip extends Condiment {

	public Whip(String description) {
		super(description);
		
	}

	@Override
	public BigDecimal cost() {
		// TODO Auto-generated method stub
		return BigDecimal.valueOf(5);
	}
}
