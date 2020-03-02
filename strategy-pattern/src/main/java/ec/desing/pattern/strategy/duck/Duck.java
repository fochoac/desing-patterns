package ec.desing.pattern.strategy.duck;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import ec.desing.pattern.strategy.enumeration.FlyEnum;
import ec.desing.pattern.strategy.enumeration.TypeSoundEnum;
import lombok.Getter;
import lombok.Setter;

public class Duck {
	private static final String NEW_LINE = " \n";
	private final String DESCRIPTION = "\nHello, %s and I have the next properties:\n%s. \n Thanks for view, bye.";
	private static final String I_CAN_SWIM = "I CAN SWIM";
	@Setter
	@Getter
	private DuckConfiguration configuration;

	public Duck() {
		this.configuration = new DuckConfiguration();
	}

	public Duck(DuckConfiguration configuration) {
		this.configuration = configuration;
	}

	public void swim() {
		System.out.println(I_CAN_SWIM);
	}

	public void display() {
		System.out.println(configuration.getTypeDuck().getDescripcion());
	}

	public TypeSoundEnum performQuack() {
		return configuration.getQuackBehavior().quack();
	}

	public FlyEnum performFly() {
		return configuration.getFlyBehavior().fly();

	}

	protected List<String> getProperties() {
		return Arrays.asList(I_CAN_SWIM, performFly().getAction(), performQuack().getSound());
	}

	@Override
	public String toString() {

		return String
				.format(DESCRIPTION, configuration.getTypeDuck().getDescripcion(),
						getProperties().stream().map(s -> "- " + s).collect(Collectors.joining(NEW_LINE)))
				.toUpperCase();
	}

}
