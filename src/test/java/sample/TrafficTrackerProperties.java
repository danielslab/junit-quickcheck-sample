package sample;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

// Calling for a generator for values of a specific type via gen()
@RunWith(JUnitQuickcheck.class)
public class TrafficTrackerProperties {
	@Property
	public void nonNegativity(@From(TrafficTrackerGenerator.class) TrafficTracker tt) {
		System.out.println(tt);
	}
}
