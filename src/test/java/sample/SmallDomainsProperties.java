package sample;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.ValuesOf;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

enum Ternary {
	YES, NO, MAYBE
}

@RunWith(JUnitQuickcheck.class)
public class SmallDomainsProperties {
	@Property
	public void hold(@ValuesOf boolean b, @ValuesOf Ternary t) {
		// Each verification will be with a different value for b and t.
		System.out.println(b + " " + t);
	}
}