package ec.desing.pattern.strategy.duck;

import ec.desing.pattern.strategy.enumeration.TypeDuckEnum;
import ec.desing.pattern.strategy.fly.behavior.FlyNoWay;
import ec.desing.pattern.strategy.quack.behavior.MuteQuack;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		super(DuckConfiguration.builder().flyBehavior(new FlyNoWay()).quackBehavior(new MuteQuack())
				.typeDuck(TypeDuckEnum.DECOY_DUCK).build());

	}

}
