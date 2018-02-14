package sample;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class CounterMakeGenerator extends Generator<Counter> {
	public CounterMakeGenerator() {
		super(Counter.class);
	}

	@Override
	public Counter generate(SourceOfRandomness random, GenerationStatus status) {
		return new Counter(gen().make(NonNegativeIntsGenerator.class).generate(random, status));
	}
}