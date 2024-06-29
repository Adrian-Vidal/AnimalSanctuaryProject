package com.skilldistillery.sanctuary;

public class Attendant {
	
	private void printAnimalNameAndFood(Animal animal) {
		int min = 1;
		int max = 10;
		int range = max - min + 1;
		int amount = (int) (Math.random() * range) + min;

		System.out.println("I will feed " + animal.getName() + " " + amount + "food(s)");
		animal.makeNoise();
		animal.eat(amount);
	}
	
	private void makeRounds(Animal[] animals) {
		for(Animal animal : animals) {
			if(animal != null) {
				printAnimalNameAndFood(animal);
			} else
				System.out.println("This enclosure is empty");
		}
	}

	
	
	
	
	
	

}
