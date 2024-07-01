package com.skilldistillery.sanctuary;


public class Sanctuary {
	Snake snake = new Snake();
	Hyena hyena = new Hyena();
	Fish fish = new Fish();
	Panda panda = new Panda();
	public Animal[] animal = new Animal[] { snake, hyena, fish, panda, };
	public Attendant attendant = new Attendant();

	public void listAnimals() {
		for (int i = 0; i < animal.length; i++) {
			Animal j = animal[i];
			System.out.println(animal[i]);
			if (j == null) {
				System.out.println("This enclosure is  empty");
			}
		}
	}
	public Animal[] methodReturningArray() {
		return null;

	}

	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}

	public void makeRounds() {

	}
	public void push(String[] object) {
		
	}

}
