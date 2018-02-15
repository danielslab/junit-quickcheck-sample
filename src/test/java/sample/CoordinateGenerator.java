package sample;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class CoordinateGenerator extends Generator<Coordinate> {

	public CoordinateGenerator() {
		super(Coordinate.class);
	}

	@Override
	public Coordinate generate(SourceOfRandomness random, GenerationStatus status) {

		return new Coordinate(BigDecimal.valueOf(random.nextDouble(-90, 90)).setScale(6, RoundingMode.CEILING),
				BigDecimal.valueOf(random.nextDouble(-180, 180)).setScale(6, RoundingMode.CEILING));
	}

}
