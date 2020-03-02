package ec.desing.pattern.strategy.duck;

import ec.desing.pattern.strategy.enumeration.TypeDuckEnum;
import ec.desing.pattern.strategy.fly.behavior.FlyNoWay;
import ec.desing.pattern.strategy.quack.behavior.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck() {
		super(DuckConfiguration.builder()
				.flyBehavior(new FlyNoWay())
				.quackBehavior(new Squeak())
				.typeDuck(TypeDuckEnum.RUBBER_DUCK).build());

	}

}
