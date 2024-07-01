package com.skilldistillery.sanctuary;

public class Hyena extends Animal {
	private static String noise = "Heehee";

	@Override
	public void makeNoise() {
		System.out.println(noise);
	}

	@Override
	public void eat(int amount) {
		System.out.println("I'm chowing down " + amount + " pound(s) of mystery meat.");
	}

	@Override
	public String toString() {
		return "Hyena";
	}

}
