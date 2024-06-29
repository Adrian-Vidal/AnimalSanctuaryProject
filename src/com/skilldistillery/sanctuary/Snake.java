package com.skilldistillery.sanctuary;

public class Snake extends Animal {
	private static String noise = "Hissss";

	@Override
	public void makeNoise(String makeNoise) {
		System.out.println(noise);
	}

	@Override
	public void eat(int amount) {
		System.out.println("I'm a slithery snake doing snake things, such as eating " + amount + " rats.");
	}

}
