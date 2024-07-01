package com.skilldistillery.sanctuary;

import java.util.Scanner;

public class AnimalSanctuaryApp {

	public static void main(String[] args) {
		Sanctuary animals = new Sanctuary();
		Attendant attendant = new Attendant();
		Scanner keyboard = new Scanner(System.in);

		System.out.println(
				"Please select an option from the menu: \n1.) List Animals \n2.) Add Animal \n3.) Start Attendant's Rounds \n4.) Exit Menu");
		int userInput = keyboard.nextInt();

		if (userInput == 1) {
			animals.listAnimals();
		} else if (userInput == 2) {
			System.out.println("Add an animal into the enclosure, choose from the following list:");
			System.out.println("1.) Lion \n2.) Zebra \n3.) Koala");
		} else if (userInput == 3) {
			attendant.makeRounds();

		}

		
		keyboard.close();
		
	}
}
