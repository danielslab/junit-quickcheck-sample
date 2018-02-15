package sample;

import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeThat;

import java.math.BigDecimal;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class CoordinateProperties {
	static int counter;
	@Property(trials = 250)
	public void northernHemisphere(@From(CoordinateGenerator.class) Coordinate c) {

		assumeThat(c.latitude(), greaterThan(BigDecimal.ZERO));

		assertTrue(c.inNorthernHemisphere());
		System.out.println(++counter + "/" + c);
	}
}
