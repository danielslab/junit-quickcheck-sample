package sample;

import java.math.BigDecimal;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class SerializationProperties {
	@Property
	public void hold(@InRange(min = "0", max = "10") BigDecimal s) {
		System.out.println("s = " + s);
	}
}
