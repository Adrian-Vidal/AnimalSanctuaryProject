package com.skilldistillery.sanctuary;

public class Sanctuary {

	public String[] animal = { "Snake", "Hyena", "Fish", "Panda", };
	public Attendant attendant = new Attendant();

	public void listAnimals() {
		for (int i = 0; i < animal.length; i++) {
			String j = animal[i];
			System.out.println(j);
			if (j == null) {
				System.out.println("This enclosure is  empty");
			}
		}
	}

	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}

	public void makeRounds() {

	}

}
