package ec.desing.pattern.strategy.fly.behavior;

import ec.desing.pattern.strategy.enumeration.FlyEnum;

public class FlyNoWay implements FlyBehavior {
	public FlyEnum fly() {
		return FlyEnum.IT_CAN_NOT_FLY;

	}
}
