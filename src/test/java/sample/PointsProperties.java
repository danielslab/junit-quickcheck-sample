package sample;

import java.awt.Point;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class PointsProperties {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass");
	}

	@Property
	public void points(@From(PointsGenerator.class) Point p) {
		System.out.println(p);
	}
}
