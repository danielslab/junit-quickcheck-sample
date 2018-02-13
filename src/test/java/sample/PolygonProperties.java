package sample;

import java.awt.Polygon;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

// Using the SourceOfRandomness handed to the generator directly
@RunWith(JUnitQuickcheck.class)
public class PolygonProperties {
	@Property
	public void nonNegativity(@From(PolygonGenerator.class) Polygon p) {
		System.out.println(p.getBounds());
	}
}
