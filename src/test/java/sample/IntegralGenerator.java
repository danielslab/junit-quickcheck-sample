package sample;

import java.util.Arrays;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class IntegralGenerator extends Generator<Integer> {
	private NonNegative nonNegative;

	public IntegralGenerator() {
		super(Arrays.asList(Integer.class, int.class));
	}

	@Override
	public Integer generate(SourceOfRandomness random, GenerationStatus status) {
		int value = random.nextInt();
		return nonNegative != null ? Math.abs(value) : value;
	}

	public void configure(NonNegative nonNegative) {
		this.nonNegative = nonNegative;
	}
}