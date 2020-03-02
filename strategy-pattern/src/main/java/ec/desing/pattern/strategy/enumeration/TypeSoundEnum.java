package ec.desing.pattern.strategy.enumeration;

import lombok.Getter;

public enum TypeSoundEnum {

	IT_MAKE_QUACK("I SAY QUACK"), IT_MAKE_SQUEAK("I CAN SQUEAK"), IT_DONT_MAKE_ANY_SOUND("I DON'T MAKE ANY SOUND");

	@Getter
	private String sound;

	private TypeSoundEnum(String sound) {
		this.sound = sound;
	}

}
