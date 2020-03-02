package ec.desing.pattern.strategy.quack.behavior;

import ec.desing.pattern.strategy.enumeration.TypeSoundEnum;

public class MuteQuack implements QuackBehavior {

	public TypeSoundEnum quack() {
		return TypeSoundEnum.IT_DONT_MAKE_ANY_SOUND;
	}

}
