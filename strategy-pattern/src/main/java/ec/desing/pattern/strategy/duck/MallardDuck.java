package ec.desing.pattern.strategy.duck;

import ec.desing.pattern.strategy.enumeration.TypeDuckEnum;
import ec.desing.pattern.strategy.fly.behavior.FlyWithWings;
import ec.desing.pattern.strategy.quack.behavior.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		super(DuckConfiguration.builder()
				.flyBehavior(new FlyWithWings())
				.quackBehavior(new Quack())
				.typeDuck(TypeDuckEnum.MALLAR_DUCK).build());
	}
}
