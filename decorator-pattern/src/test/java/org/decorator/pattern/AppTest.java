package org.decorator.pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.logging.Logger;

import org.decorator.pattern.solution.one.Beverage;
import org.decorator.pattern.solution.one.Condiment;
import org.decorator.pattern.solution.one.Mocha;
import org.decorator.pattern.solution.one.Whip;
import org.decorator.pattern.solution.two.MochaDecorator;
import org.decorator.pattern.solution.two.WhipDecorator;
import org.decorator.pattern.solution.two.enumeration.CoffeSizeEnum;
import org.junit.jupiter.api.Test;

class AppTest {

	private App app;

	@Test
	void testMakeDarkRoastWithMochaAndWhip() {
		app = new App();
		Beverage darkRoast = app.makeDarkRoast();
		Condiment mocha = new Mocha("add mocha");
		Condiment whip = new Whip("add whip");
		darkRoast.addCondiment(mocha);
		darkRoast.addCondiment(whip);
		assertEquals(BigDecimal.valueOf(15 + 5 + 5), darkRoast.cost());
	}

	@Test
	void testMakeDarkRoastWithMochaAndWhipDecorator() {
		app = new App();
		org.decorator.pattern.solution.two.Beverage darkRoast = app.makeDarkRoastTwo();
		darkRoast.setCoffeSize(CoffeSizeEnum.BIG);
		darkRoast = new MochaDecorator(darkRoast);
		darkRoast = new WhipDecorator(darkRoast);
		Logger.getLogger(AppTest.class.getName()).info(darkRoast.getDescription());
		assertEquals(BigDecimal.valueOf(15 + 5 + 5), darkRoast.cost());
	}

}
