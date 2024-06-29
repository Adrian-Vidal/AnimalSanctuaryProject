package com.skilldistillery.sanctuary;

public class Panda extends Animal {
	private static String noise = "Rawrrr";

	@Override
	public void makeNoise(String makeNoise) {
		System.out.println(noise);
	}

	@Override
	public void eat(int amount) {
		System.out.println("Nom nom nom, I am eating " + amount + " bamboo shoots.");
	}

}
