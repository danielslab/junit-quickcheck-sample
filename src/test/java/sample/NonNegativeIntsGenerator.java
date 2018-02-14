package sample;

import java.util.Arrays;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class NonNegativeIntsGenerator extends Generator<Integer> {
	public NonNegativeIntsGenerator() {
		super(Arrays.asList(Integer.class, int.class));
	}

	@Override
	public Integer generate(SourceOfRandomness random, GenerationStatus status) {
		return Math.abs(random.nextInt());
	}
}