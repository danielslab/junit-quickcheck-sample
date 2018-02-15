package sample;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class PointsGenerator extends Generator<Point> {
	private static final Point ORIGIN = new Point();

	public PointsGenerator() {
		super(Point.class);
	}

	@Override
	public Point generate(SourceOfRandomness random, GenerationStatus status) {
		return new Point(random.nextInt(), random.nextInt());
	}

	@Override
	public List<Point> doShrink(SourceOfRandomness random, Point larger) {

		if (ORIGIN.equals(larger))
			return Collections.emptyList();

		List<Point> shrinks = new ArrayList<>();
		shrinks.add(new Point(0, larger.y));
		shrinks.add(new Point(larger.x, 0));
		shrinks.add(new Point(larger.x / 2, larger.y));
		shrinks.add(new Point(larger.x, larger.y / 2));
		return shrinks;
	}
}