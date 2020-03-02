package org.decorator.pattern;

import org.decorator.pattern.solution.one.Beverage;
import org.decorator.pattern.solution.one.DarkRoast;

/**
 * Hello world!
 *
 */
public class App {

	public Beverage makeDarkRoast() {
		// TODO Auto-generated method stub
		return new DarkRoast("beautifull cafee dark roast");
	}
	public org.decorator.pattern.solution.two.Beverage makeDarkRoastTwo() {
		// TODO Auto-generated method stub
		return new org.decorator.pattern.solution.two.DarkRoast();
	}
}
