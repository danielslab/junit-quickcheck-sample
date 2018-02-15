package sample;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.When;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class SameValuesProperties {
	@Property
	public void holds(@When(seed = -1L) int i) {
		System.out.println(i);
	}
}