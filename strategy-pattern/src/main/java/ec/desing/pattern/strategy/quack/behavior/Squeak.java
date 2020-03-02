package ec.desing.pattern.strategy.quack.behavior;

import ec.desing.pattern.strategy.enumeration.TypeSoundEnum;

public class Squeak implements QuackBehavior {

	public TypeSoundEnum quack() {
		return TypeSoundEnum.IT_MAKE_SQUEAK;

	}
}
