package org.decorator.pattern.solution.two;

import java.math.BigDecimal;

import org.decorator.pattern.solution.two.enumeration.CoffeSizeEnum;

import lombok.Getter;
import lombok.Setter;

public abstract class Beverage {
	@Getter
	@Setter
	private String description;
	@Getter
	@Setter
	private CoffeSizeEnum coffeSize;

	public Beverage() {
		setCoffeSize(CoffeSizeEnum.IDEAL);
	}

	public abstract BigDecimal cost();

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "An " + getCoffeSize().name() + " " + getDescription();
	}
}
