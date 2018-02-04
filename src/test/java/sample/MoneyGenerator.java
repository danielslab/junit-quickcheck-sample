package sample;

import java.math.BigDecimal;
import java.util.Arrays;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.generator.Precision;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class MoneyGenerator extends Generator<BigDecimal> {
	private InRange inRange;
	private Precision precision;

	public MoneyGenerator() {
		super(Arrays.asList(BigDecimal.class));
	}

	@Override
	public BigDecimal generate(SourceOfRandomness random, GenerationStatus status) {
		BigDecimal generatedValue = new BigDecimal(Math.abs(random.nextInt() % (Integer.valueOf(inRange.max())+1)));
		generatedValue = generatedValue.setScale(precision.scale());
		return generatedValue;
	}

	public void configure(InRange inRange) {
		System.out.println("congigure-inRange");
		this.inRange = inRange;
	}

	public void configure(Precision precision) {
		System.out.println("congigure-precision");
		this.precision = precision;
	}
}