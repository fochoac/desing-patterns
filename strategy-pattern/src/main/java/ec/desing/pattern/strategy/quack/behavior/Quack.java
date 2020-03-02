package ec.desing.pattern.strategy.quack.behavior;

import ec.desing.pattern.strategy.enumeration.TypeSoundEnum;

public class Quack implements QuackBehavior {

	public TypeSoundEnum quack() {
		return TypeSoundEnum.IT_MAKE_QUACK;

	}

}
