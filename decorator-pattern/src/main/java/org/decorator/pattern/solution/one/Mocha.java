package org.decorator.pattern.solution.one;

import java.math.BigDecimal;

public class Mocha extends Condiment {

	public Mocha(String description) {
		super(description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal cost() {
		// TODO Auto-generated method stub
		return BigDecimal.valueOf(5);
	}

}
