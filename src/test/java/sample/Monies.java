package sample;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class Monies {
	@Property
	public void hold(@From(MoneyGenerator.class) @SmallChange BigDecimal d) {
		System.out.println("d = " + d);
		assertEquals(2, d.scale());
		assertThat(d, allOf(greaterThanOrEqualTo(BigDecimal.ZERO), lessThanOrEqualTo(new BigDecimal("20"))));
	}
}
