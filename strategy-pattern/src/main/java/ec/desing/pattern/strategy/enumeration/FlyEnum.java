package ec.desing.pattern.strategy.enumeration;

import lombok.Getter;

public enum FlyEnum {

	IT_CAN_FLY("I CAN FLY AS A BIRD"),
	IT_CAN_NOT_FLY("I CAN NOT FLY. I AM NOT A BIRD"),
	IT_CAN_FLY_WITH_ROCKET("I CAN FLY WITH MY ROCKET AS A BIRD");

	@Getter
	private String action;

	private FlyEnum(String action) {
		this.action = action;
	}
}
