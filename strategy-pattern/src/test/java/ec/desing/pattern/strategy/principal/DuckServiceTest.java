package ec.desing.pattern.strategy.principal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.desing.pattern.strategy.duck.Duck;
import ec.desing.pattern.strategy.enumeration.FlyEnum;
import ec.desing.pattern.strategy.enumeration.TypeSoundEnum;
import ec.desing.pattern.strategy.fly.behavior.FlyWithRocket;

class DuckServiceTest {
	private static final Logger log = Logger.getLogger(DuckServiceTest.class.getName());
	private DuckService service;
	private Duck duck;

	@BeforeEach
	void setup() {

		service = new DuckService();
	}

	@AfterEach
	void print() {
		log.info(duck.toString());
	}

	@Test
	void testBuildMallarDuck() {
		duck = service.buildMallarDuck();
		assertEquals(FlyEnum.IT_CAN_FLY, duck.performFly());
		assertEquals(TypeSoundEnum.IT_MAKE_QUACK, duck.performQuack());

	}

	@Test
	void testBuildDecoyDuck() {
		duck = service.buildDecoyDuck();
		assertEquals(FlyEnum.IT_CAN_NOT_FLY, duck.performFly());
		assertEquals(TypeSoundEnum.IT_DONT_MAKE_ANY_SOUND, duck.performQuack());
	}

	@Test
	void testBuildRedheadDuck() {
		duck = service.buildRedheadDuck();
		assertEquals(FlyEnum.IT_CAN_FLY, duck.performFly());
		assertEquals(TypeSoundEnum.IT_MAKE_QUACK, duck.performQuack());
	}

	@Test
	void testBuildRubberDuck() {
		duck = service.buildRubberDuck();
		assertEquals(FlyEnum.IT_CAN_NOT_FLY, duck.performFly());
		assertEquals(TypeSoundEnum.IT_MAKE_SQUEAK, duck.performQuack());
		duck.getConfiguration().setFlyBehavior(new FlyWithRocket());
		assertEquals(FlyEnum.IT_CAN_FLY_WITH_ROCKET, duck.performFly());
	}

}
