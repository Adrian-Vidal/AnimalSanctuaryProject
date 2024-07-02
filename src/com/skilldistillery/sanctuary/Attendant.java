package com.skilldistillery.sanctuary;

public class Attendant {
	
	public void makeRounds(Animal[] animals) {
		
		System.out.println("Time to make my rounds!\n");
		for(Animal animal : animals) {
			if(animal != null) {
				int min = 1;
				int max = 10;
				int range = max - min + 1;
				int amount = (int) (Math.random() * range) + min;
				System.out.println("I will feed " + animal.getName() + " " + amount + " food(s).");
				animal.makeNoise();
				animal.eat(amount);
				System.out.println("");
			} else
				System.out.println("This enclosure is empty, on to the next one.\n");
		}
	}	

}


