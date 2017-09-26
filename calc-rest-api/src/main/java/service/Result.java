package service;

public class Result {

	private int first;
	private int second;
	private int value;

	public int getA() {
		return first;
	}

	public void setA(int a) {
		this.first = a;
	}

	public Result withA(int a) {
		this.first = a;
		return this;
	}

	public int getB() {
		return second;
	}

	public void setB(int b) {
		this.second = b;
	}

	public Result withB(int b) {
		this.second = b;
		return this;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Result withValue(int value) {
		this.value = value;
		return this;
	}

}
