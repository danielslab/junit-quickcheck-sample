package sample;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

// Calling for a generator for values of a specific type via gen()
public class TrafficTrackerGenerator extends Generator<TrafficTracker> {
	public TrafficTrackerGenerator() {
		super(TrafficTracker.class);
	}

	@Override
	public TrafficTracker generate(SourceOfRandomness random, GenerationStatus status) {
		return new TrafficTracker(gen().constructor(Counter.class, int.class).generate(random, status));
	}
}