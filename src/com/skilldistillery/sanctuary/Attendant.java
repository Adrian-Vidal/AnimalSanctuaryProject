package com.skilldistillery.sanctuary;

public class Attendant {
	
	public void makeRounds() {
		Animal[] animals = new Animal[6];
		
		Snake snake = new Snake();
		animals[0] = snake;
		snake.setName("Ekans the Snake");
		
		Hyena hyena = new Hyena();
		animals[2] = hyena;
		hyena.setName("Banzai The Hyena");
		
		Fish fish = new Fish();
		animals[3] = fish;
		fish.setName("Marlin the Fish");
		
		Panda panda = new Panda();
		animals[5] = panda;
		panda.setName("Po the Panda");
		
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


