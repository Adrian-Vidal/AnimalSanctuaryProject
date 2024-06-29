package com.skilldistillery.sanctuary;

public class Fish extends Animal {
	private static String noise = "Glub glub glub";

	@Override
	public void makeNoise() {
		System.out.println(noise);
	}

	@Override
	public void eat(int amount) {
		System.out.println("Pellets again? Oh well. (eats " + amount + " pellets)");
	}

}
