package com.skilldistillery.sanctuary;

public class Fish extends Animal {
	private static String noise = "Glub glub glub";

	@Override
	public void makeNoise(String makeNoise) {
		System.out.println(noise);
	}

	@Override
	public void eat(int amount) {
		System.out.println("Sighhh, pellets again? Oh well. (eats " + amount + " pellets)");
	}

}
