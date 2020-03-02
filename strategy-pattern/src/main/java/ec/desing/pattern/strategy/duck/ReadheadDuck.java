package ec.desing.pattern.strategy.duck;

import ec.desing.pattern.strategy.enumeration.TypeDuckEnum;
import ec.desing.pattern.strategy.fly.behavior.FlyWithWings;
import ec.desing.pattern.strategy.quack.behavior.Quack;

public class ReadheadDuck extends Duck {
	public ReadheadDuck() {
		super(DuckConfiguration.builder()
				.flyBehavior(new FlyWithWings())
				.quackBehavior(new Quack())
				.typeDuck(TypeDuckEnum.REDHEAD_DUCK).build());
	}
}
