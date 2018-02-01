package sample;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class SumProperties {
	@Property
	public void add(int a, int b) {
		assertEquals(a+b, Math.addExact(a, b));
	}
}