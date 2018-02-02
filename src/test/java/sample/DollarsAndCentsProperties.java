package sample;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.Ctor;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class DollarsAndCentsProperties {
    @Property public void rounding(@From(Ctor.class) DollarsAndCents d) {
    	System.out.println(d);
    }
}
