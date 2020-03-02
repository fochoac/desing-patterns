package ec.desing.pattern.strategy.enumeration;

import lombok.Getter;

public enum TypeDuckEnum {

	DECOY_DUCK(1, "I AM A DECOY DUCK"), GENERIC_DUCK(2, "I AM A DUCK"), MALLAR_DUCK(3, "I AM A MALLAR DUCK"),
	REDHEAD_DUCK(4, "I AM A REDHEAD DUCK"), RUBBER_DUCK(5, "I AM A RUBBER DUCK");

	@Getter
	private int typeDuck;
	@Getter
	private String descripcion;

	private TypeDuckEnum(int typeDuck, String descripcion) {
		this.typeDuck = typeDuck;
		this.descripcion = descripcion;
	}

}
