package org.decorator.pattern.solution.one;

import lombok.Getter;
import lombok.Setter;

public abstract class Condiment implements Chargeable {

	@Getter
	@Setter
	private String description;

	public Condiment(String description) {
		this.description = description;
	}
}
