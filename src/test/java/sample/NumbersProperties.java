package sample;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.junit.Assert.assertThat;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class NumbersProperties {
	@Property
	// Add @From(IntegralGenerator.class)
	public void nonNegativity(@From(IntegralGenerator.class) @NonNegative int i) {
		assertThat(i, greaterThanOrEqualTo(0));
	}
}