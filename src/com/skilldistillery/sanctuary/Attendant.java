package com.skilldistillery.sanctuary;

public class Attendant {
	
	public void makeRounds() {
		Animal[] animals = new Animal[5];
		
		Snake snake = new Snake();
		animals[0] = snake;
		snake.setName("Ekans");
		
		
		Hyena hyena = new Hyena();
		animals[1] = hyena;
		hyena.setName("Banzai");
		
		Fish fish = new Fish();
		animals[2] = fish;
		fish.setName("Marlin");
		
		Panda panda = new Panda();
		animals[3] = panda;
		panda.setName("Po");
		
		System.out.println("Time to make my rounds!\n");
		for(Animal animal : animals) {
			if(animal != null) {
				int min = 1;
				int max = 10;
				int range = max - min + 1;
				int amount = (int) (Math.random() * range) + min;
				System.out.println("I will feed " + animal.getName() + " " + amount + " food(s)");
				animal.makeNoise();
				animal.eat(amount);
				System.out.println("");
			} else
				System.out.println("This enclosure is empty");
		}
	}	

}


