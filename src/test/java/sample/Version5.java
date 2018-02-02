package sample;

import java.util.UUID;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class Version5 extends Generator<UUID> {
	public Version5() {
		super(UUID.class);
	}

	@Override
	public UUID generate(SourceOfRandomness r, GenerationStatus status) {
		return new UUID(r.nextLong(), r.nextLong());
	}
}
