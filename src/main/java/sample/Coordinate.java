package sample;

import java.math.BigDecimal;

public class Coordinate {
	private final BigDecimal latitude, longitude;

	public Coordinate(BigDecimal latitude, BigDecimal longitude) {
		// argument checks here...

		this.latitude = latitude;
		this.longitude = longitude;
	}

	public BigDecimal latitude() {
		return latitude;
	}

	public BigDecimal longitude() {
		return longitude;
	}

	public boolean inNorthernHemisphere() {
		return latitude.compareTo(BigDecimal.ZERO) > 0;
	}

	public String toString() {
		return latitude.toString() + "-" + longitude.toString();
	}
}