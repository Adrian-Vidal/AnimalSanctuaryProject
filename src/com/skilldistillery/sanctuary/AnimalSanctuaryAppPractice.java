package com.skilldistillery.sanctuary;

import java.util.Scanner;

public class AnimalSanctuaryAppPractice {
	private static Scanner keyboard = new Scanner(System.in);
	private static Sanctuary animals = new Sanctuary();
	private static Attendant attendant = new Attendant();

	public static void main(String[] args) {
		AnimalSanctuaryAppPractice launchapp = new AnimalSanctuaryAppPractice();
		System.out.println(
				"Please select an option from the menu: \n1.) List Animals \n2.) Add Animal \n3.) Start Attendant's Rounds \n4.) Exit Menu");
		int userInput = keyboard.nextInt();
		while (userInput != 4) {
			if (userInput == 1) {
				animals.listAnimals();
			} else if (userInput == 2) {
				System.out.println("Select an animal to add to the empty enclosure: ");
				System.out.println("1.) Bear \n2.) Wolf \n3.) Giraffe");
			} else if (userInput == 3) {
				attendant.makeRounds();
			}
		}

		
		
		
		
	}
}
