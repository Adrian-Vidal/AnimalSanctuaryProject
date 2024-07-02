package com.skilldistillery.sanctuary;


public class Sanctuary {
	private Animal[] animals = new Animal[5];
	private Attendant attendant = new Attendant();

	public void listAnimals() {
		for (int i = 0; i < animals.length; i++) {
			if(animals[i] == null) {
				System.out.println("This enclosure is empty");
			} else if(animals[i] != null) {
				System.out.println(animals[i].getName());
			} 
		}
	}
	public void addAnimal(Animal animal) {
		for (int i = 0 ; i < animals.length ; i++) {
			if(animals[i] == null) {
				animals[i] = animal;
				break;
			
			}
		}
	}
	
	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}

	public void makeRounds() {
		attendant.makeRounds(animals);

	}
	public void push(String[] object) {
		
	}

}
