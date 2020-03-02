package ec.desing.pattern.strategy.duck;

import ec.desing.pattern.strategy.enumeration.TypeDuckEnum;
import ec.desing.pattern.strategy.fly.behavior.FlyBehavior;
import ec.desing.pattern.strategy.fly.behavior.FlyWithWings;
import ec.desing.pattern.strategy.quack.behavior.Quack;
import ec.desing.pattern.strategy.quack.behavior.QuackBehavior;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DuckConfiguration {

	private FlyBehavior flyBehavior;

	private QuackBehavior quackBehavior;

	private TypeDuckEnum typeDuck;

	public DuckConfiguration() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
		typeDuck = TypeDuckEnum.GENERIC_DUCK;
	}

	public DuckConfiguration(FlyBehavior flyBehavior, QuackBehavior quackBehavior, TypeDuckEnum typeDuck) {
		super();
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
		this.typeDuck = typeDuck;
	}

}
