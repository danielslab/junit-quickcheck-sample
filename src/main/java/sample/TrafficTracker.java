package sample;

public class TrafficTracker {
	private final Counter counter;

	public TrafficTracker(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public String toString() {
		return this.counter.toString();
	}
}
