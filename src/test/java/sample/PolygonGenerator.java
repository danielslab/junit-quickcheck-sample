package sample;

import java.awt.Polygon;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

// Using the SourceOfRandomness handed to the generator directly
public class PolygonGenerator extends Generator<Polygon> {
	public PolygonGenerator() {
		super(Polygon.class);
	}

	@Override
	public Polygon generate(SourceOfRandomness r, GenerationStatus status) {

		int numberOfPoints = Math.abs(r.nextInt()) % 100;

		int[] xs = new int[numberOfPoints];
		for (int i = 0; i < numberOfPoints; ++i)
			xs[i] = r.nextInt();

		int[] ys = new int[numberOfPoints];
		for (int i = 0; i < numberOfPoints; ++i)
			ys[i] = r.nextInt();

		return new Polygon(xs, ys, numberOfPoints);
	}
}