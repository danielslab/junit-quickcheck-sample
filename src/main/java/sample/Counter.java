package sample;

public class Counter {
	private int count;

	public Counter() {
		this.count = 0;
	}

	public Counter(int count) {
		this.count = count;
	}

	public Counter increment() {
		++count;
		return this;
	}

	public Counter decrement() {
		--count;
		return this;
	}

	public int count() {
		return count;
	}
	
	@Override
	public String toString() {
		return Integer.toString(count);
	}
}
