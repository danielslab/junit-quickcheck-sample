package sample;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.primes.Primes;

public class PrimeFactors {
	public static List<BigInteger> of(BigInteger n) {
		List<Integer> primeFactors = Primes.primeFactors(n.intValue());
		List<BigInteger> resultList = new ArrayList<BigInteger>();
		for(Integer primeFactor : primeFactors) {
			resultList.add(BigInteger.valueOf(primeFactor.longValue()));
		}

		return resultList;
	}
}
