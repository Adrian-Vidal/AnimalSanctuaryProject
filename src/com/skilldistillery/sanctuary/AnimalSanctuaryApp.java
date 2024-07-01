package com.skilldistillery.sanctuary;

import java.util.Scanner;

public class AnimalSanctuaryApp {

	public static void main(String[] args) {
		Sanctuary animals = new Sanctuary();
		Attendant attendant = new Attendant();
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to the Animal Sanctuary App. \nPlease select an option from the menu below:\n"
				+ "============================================"
				+ "\n1.) List Animals \n2.) Add Animal \n3.) Start Attendant's Rounds \n4.) Exit Menu");
		int userInput = keyboard.nextInt();

		while (userInput != 4) {
			if (userInput == 1) {
				System.out.println("Animal List\n" + "===========");
				animals.listAnimals();
				System.out.println("\nPlease select an option from the menu below: \n"
						+ "============================================"
						+ "\n1.) List Animals \n2.) Add Animal \n3.) Start Attendant's Rounds \n4.) Exit Menu");
				userInput = keyboard.nextInt();

			} else if (userInput == 2) {
				System.out.println("Add an animal into an open enclosure. " + "\nChoose from the following animals:\n"
						+ "=====================================");
				System.out.println("1.) Snake \n2.) Hyena \n3.) Fish \n4.) Panda");
				userInput = keyboard.nextInt();
				if (userInput == 1) {
					System.out.println("add snake");
				}

				System.out.println("\nPlease select an option from the menu below: \n"
						+ "============================================"
						+ "\n1.) List Animals \n2.) Add Animal \n3.) Start Attendant's Rounds \n4.) Exit Menu");
				userInput = keyboard.nextInt();

			} else if (userInput == 3) {
				attendant.makeRounds();
				System.out.println("\nPlease select an option from the menu below: \n"
						+ "============================================"
						+ "\n1.) List Animals \n2.) Add Animal \n3.) Start Attendant's Rounds \n4.) Exit Menu");
				userInput = keyboard.nextInt();
			} else
				break;

		}

		System.out.println("Thank you for using the Animal Sanctuary App, have a good day!");
		keyboard.close();

	}
}
