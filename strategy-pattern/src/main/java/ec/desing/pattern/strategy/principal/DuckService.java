package ec.desing.pattern.strategy.principal;

import ec.desing.pattern.strategy.duck.DecoyDuck;
import ec.desing.pattern.strategy.duck.Duck;
import ec.desing.pattern.strategy.duck.MallardDuck;
import ec.desing.pattern.strategy.duck.ReadheadDuck;
import ec.desing.pattern.strategy.duck.RubberDuck;

/**
 * Hello world!
 *
 */
public class DuckService {

	public Duck buildMallarDuck() {

		return new MallardDuck();
	}

	public Duck buildDecoyDuck() {
		return new DecoyDuck();
	}

	public Duck buildRedheadDuck() {
		return new ReadheadDuck();
	}

	public Duck buildRubberDuck() {
		return new RubberDuck();
	}
}
