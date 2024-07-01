package com.skilldistillery.sanctuary;

public class Snake extends Animal {
	private static String noise = "Hissss";

	@Override
	public void makeNoise() {
		System.out.println(noise);
	}

	@Override
	public void eat(int amount) {
		System.out.println("I'm a snake doing snake things, such as eating " + amount + " rat(s).");
	}

	@Override
	public String toString() {
		return "Snake";
	}

}
