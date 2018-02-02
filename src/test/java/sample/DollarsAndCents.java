package sample;

import java.math.BigDecimal;

public class DollarsAndCents {
    private final BigDecimal amount;

    public DollarsAndCents(BigDecimal amount) {
       this.amount = amount.setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }

	public BigDecimal getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "DollarsAndCents [amount=" + amount + "]";
	}
}