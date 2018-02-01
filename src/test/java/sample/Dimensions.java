package sample;

import java.awt.Dimension;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class Dimensions extends Generator<Dimension> {
	public Dimensions() {
		super(Dimension.class);
	}

	@Override
	public Dimension generate(SourceOfRandomness r, GenerationStatus status) {
		return new Dimension(r.nextInt(), r.nextInt());
	}
}
