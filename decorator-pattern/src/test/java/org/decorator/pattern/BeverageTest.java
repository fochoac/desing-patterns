package org.decorator.pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.decorator.pattern.solution.one.Beverage;
import org.decorator.pattern.solution.one.DarkRoast;
import org.decorator.pattern.solution.one.Decaf;
import org.decorator.pattern.solution.one.Expreso;
import org.decorator.pattern.solution.one.HouseBlend;
import org.junit.jupiter.api.Test;

class BeverageTest {

	private Beverage beverage;

	@Test
	public void testMakeHouseBlend() {
		beverage = new HouseBlend("HouseBlend");
		assertEquals(BigDecimal.valueOf(10), beverage.cost());
		assertEquals("HouseBlend", beverage.getDescription());
	}

	@Test
	public void testMakeDarkRoast() {
		beverage = new DarkRoast("DarkRoast");
		assertEquals(BigDecimal.valueOf(15), beverage.cost());
		assertEquals("DarkRoast", beverage.getDescription());
	}

	@Test
	public void testMakeDecaf() {
		beverage = new Decaf("Decaf");
		assertEquals(BigDecimal.valueOf(20), beverage.cost());
		assertEquals("Decaf", beverage.getDescription());
	}

	@Test
	public void testMakeExpreso() {
		beverage = new Expreso("Expreso");
		assertEquals(BigDecimal.valueOf(8), beverage.cost());
		assertEquals("Expreso", beverage.getDescription());
	}

}
