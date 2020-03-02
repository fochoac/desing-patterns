package ec.desing.pattern.strategy.fly.behavior;

import ec.desing.pattern.strategy.enumeration.FlyEnum;

public class FlyWithRocket implements FlyBehavior {
	public FlyEnum fly() {
		return FlyEnum.IT_CAN_FLY_WITH_ROCKET;

	}
}
