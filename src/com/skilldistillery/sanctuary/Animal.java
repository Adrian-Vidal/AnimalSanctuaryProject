package com.skilldistillery.sanctuary;

public class Animal {
	private String name;
	public String makeNoise;
	public int amount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void makeNoise(String makeNoise) {
		this.makeNoise = makeNoise;
	}

	public void eat(int amount) {
		this.amount = amount;
		int min = 1;
		int max = 10;
		int range = max - min + 1;
		
		for (int i = 0; i < 10 ; i++) {
			int rand = (int)(Math.random() * range) + min;
			
		}

	}
}
