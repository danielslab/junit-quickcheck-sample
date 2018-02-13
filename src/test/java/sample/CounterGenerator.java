package sample;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class CounterGenerator extends Generator<Counter> {
	public CounterGenerator() {
        super(Counter.class);
    }

	@Override
	public Counter generate(SourceOfRandomness random, GenerationStatus status) {
		return new Counter(Math.abs(gen().type(int.class).generate(random, status)));
	}
}