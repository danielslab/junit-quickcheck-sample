package sample;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.Fields;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class CounterProperties {
	@Property
	public void incrementing(@From(Fields.class) Counter c) {
		int count = c.count();
		assertEquals(count + 1, c.increment().count());
	}

	@Property
	public void decrementing(@From(Fields.class) Counter c) {
		int count = c.count();
		assertEquals(count - 1, c.decrement().count());
	}
	
	@Property
	public void testgen(@From(CounterGenerator.class) Counter c) {
		int count = c.count();
		System.out.println("count = " + count);
	}
}