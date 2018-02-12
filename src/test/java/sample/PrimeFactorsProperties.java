package sample;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeThat;

import java.math.BigInteger;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class PrimeFactorsProperties {
	@Property
	public void factorsPassPrimalityTest(BigInteger n) {
		assumeThat(n, greaterThan(ZERO));
		if(n.intValue() < 2) {
			// PrimeFactors.ofの引数に、2未満は無効な値
			return;
		}

		for (BigInteger each : PrimeFactors.of(n))
			assertTrue(each.isProbablePrime(1000));
	}

	@Property
	public void factorsMultiplyToOriginal(@InRange(min = "0", max = "2147483647") BigInteger n) {
		assumeThat(n, greaterThan(ZERO));
		if(n.intValue() < 2) {
			// PrimeFactors.ofの引数に、2未満は無効な値
			return;
		}

		BigInteger product = ONE;
		for (BigInteger each : PrimeFactors.of(n))
			product = product.multiply(each);

		assertEquals(n, product);
	}

	@Property
	public void factorizationsAreUnique(BigInteger m, BigInteger n) {
		if(m.intValue() < 2 || n.intValue() < 2) {
			// PrimeFactors.ofの引数に、2未満は無効な値
			return;
		}

		assumeThat(m, greaterThan(ZERO));
		assumeThat(n, greaterThan(ZERO));
		assumeThat(m, not(equalTo(n)));

		assertThat(PrimeFactors.of(m), not(equalTo(PrimeFactors.of(n))));
	}
}
