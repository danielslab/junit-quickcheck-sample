package sample;

import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

/**
	java.lang.AssertionError: Property primality falsified via shrinking: 226
	Shrunken args: [226]
	Original failure message: [156612514]
	Original args: [156612514]
	Seeds: [5706899483771193119]
 */
@RunWith(JUnitQuickcheck.class)
public class IntegerProperties {
	@Property(shrink = true)
	public void primality(@InRange(minInt = 2) int i) {
		assertTrue(String.valueOf(i), Integers.isPrime(i));
		System.out.println("i = " + i + ", isPrime(i) = " + Integers.isPrime(i));
	}
}