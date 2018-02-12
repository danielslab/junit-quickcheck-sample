package sample;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.junit.Assume.assumeThat;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.When;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class SingleDigitProperties {
	@Property
	public void hold(@InRange(min = "0", max = "9") int digit) {
		// hope we get enough single digits
		assumeThat(digit, greaterThanOrEqualTo(0));
		assumeThat(digit, lessThanOrEqualTo(9));

		// ...
	}

	// DicardRatioExceededException raised.
	@Property
	public void hold2(@When(satisfies = "#_ >= 0 && #_ <= 10") int digit) {
		// hope we get enough single digits
		assumeThat(digit, greaterThanOrEqualTo(0));
		assumeThat(digit, lessThanOrEqualTo(10));

		// ...
	}
}
