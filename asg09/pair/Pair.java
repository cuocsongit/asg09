package asg09.pair;

public class Pair<T> {
	private T first, second;
	public Pair() {
		first = null;
		second = null;
	}
	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return first;
	}
	
	public T getSecond() {
		return second;
	}
	
	public void setFirst(T first) {
		this.first = first;
	}
	
	public void setSecond(T second) {
		this.second = second;
	}
	
	public String toString() {
		return String.format("(%s,%s)", first, second);
	}
}
