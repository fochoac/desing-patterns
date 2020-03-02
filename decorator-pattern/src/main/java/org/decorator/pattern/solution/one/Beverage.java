package org.decorator.pattern.solution.one;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public abstract class Beverage implements Chargeable {
	@Getter
	@Setter
	private String description;
	@Getter
	@Setter
	protected List<Condiment> condiments;

	public Beverage(String description) {
		this.condiments = new ArrayList<>();
		this.description = description;
	}

	public void addCondiment(Condiment condiment) {
		this.condiments.add(condiment);

	}

	public BigDecimal getTotalCostCondiments() {

		return condiments.stream().map(Condiment::cost).reduce(BigDecimal.ZERO, BigDecimal::add);
	}
}
