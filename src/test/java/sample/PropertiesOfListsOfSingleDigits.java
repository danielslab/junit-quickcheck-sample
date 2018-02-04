package sample;

import java.util.List;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class PropertiesOfListsOfSingleDigits {
	@Property
	public void hold(List<@InRange(min = "0", max = "9") Integer> digits) {
		System.out.println("digits = " + digits);
	}
}