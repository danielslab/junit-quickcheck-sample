package sample;

import java.util.UUID;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class IdentificationProperties {
    @Property public void shouldHold(@From(Version5.class) UUID u) {
    	System.out.println(u);
    }
}