package com.skilldistillery.sanctuary;

public class Panda extends Animal {
	private static String noise = "Rawrrr";

	@Override
	public void makeNoise() {
		System.out.println(noise);
	}

	@Override
	public void eat(int amount) {
		System.out.println("I am eating " + amount + " bamboo shoot(s), nom nom nom.");
	}

}
