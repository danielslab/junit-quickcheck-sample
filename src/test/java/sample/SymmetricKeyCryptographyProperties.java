package sample;

import static org.junit.Assert.assertEquals;

import java.security.Key;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

class Crypto {
	byte[] encrypt(byte[] plaintext, Key key) {
		return new byte[0];
	}

	byte[] decrypt(byte[] ciphertext, Key key) {
		return new byte[0];
	}
}

@RunWith(JUnitQuickcheck.class)
public class SymmetricKeyCryptographyProperties {
	@Property
	public void decryptReversesEncrypt(String plaintext, Key key) throws Exception {

		Crypto crypto = new Crypto();

		byte[] ciphertext = crypto.encrypt(plaintext.getBytes("US-ASCII"), key);

		assertEquals(plaintext, new String(crypto.decrypt(ciphertext, key)));
	}
}