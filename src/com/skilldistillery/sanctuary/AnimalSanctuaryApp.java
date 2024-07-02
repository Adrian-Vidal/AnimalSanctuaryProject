package com.skilldistillery.sanctuary;

import java.util.Scanner;

public class AnimalSanctuaryApp {

	public static void main(String[] args) {
		Sanctuary sanctuary = new Sanctuary();
		Scanner keyboard = new Scanner(System.in);

		System.out.println(
				"Welcome to the Animal Sanctuary App. \nPlease select an option (1, 2, 3, or 4) from the menu below:\n"
						+ "============================================"
						+ "\n1.) List Animals \n2.) Add Animal \n3.) Start Attendant's Rounds \n4.) Exit Menu");
		int userInput = keyboard.nextInt();

		while (userInput != 4) {
			if (userInput == 1) {
				System.out.println("Animal List\n" + "===========");
				sanctuary.listAnimals();
				System.out.println("\nPlease select an option (1, 2, 3, or 4) from the menu below: \n"
						+ "============================================"
						+ "\n1.) List Animals \n2.) Add Animal \n3.) Start Attendant's Rounds \n4.) Exit Menu");
				userInput = keyboard.nextInt();

			} else if (userInput == 2) {
				System.out.println("Add an animal into an open enclosure. "
						+ "\nChoose from the following animals. (1, 2, 3, or 4):\n"
						+ "=====================================");
				System.out.println("1.) Snake \n2.) Hyena \n3.) Fish \n4.) Panda");
				userInput = keyboard.nextInt();
				if (userInput == 1) {
					Snake snake = new Snake();
					System.out.println("Type in a name for the new snake:");
					String userNameInput = keyboard.next();
					snake.setName(userNameInput);
					sanctuary.addAnimal(snake);

				} else if (userInput == 2) {
					Hyena hyena = new Hyena();
					System.out.println("Type in a name for the new hyena:");
					String userNameInput = keyboard.next();
					hyena.setName(userNameInput);
					sanctuary.addAnimal(hyena);

				} else if (userInput == 3) {
					Fish fish = new Fish();
					System.out.println("Type in a name for the new fish:");
					String userNameInput = keyboard.next();
					fish.setName(userNameInput);
					sanctuary.addAnimal(fish);

				} else if (userInput == 4) {
					Panda panda = new Panda();
					System.out.println("Type in a name for the new panda:");
					String userNameInput = keyboard.next();
					panda.setName(userNameInput);
					sanctuary.addAnimal(panda);

				} else {
					System.out.println("Invalid option, returning to menu.");
					break;
				}
				System.out.println("\nPlease select an option (1, 2, 3, or 4) from the menu below: \n"
						+ "============================================"
						+ "\n1.) List Animals \n2.) Add Animal \n3.) Start Attendant's Rounds \n4.) Exit Menu");
				userInput = keyboard.nextInt();

			} else if (userInput == 3) {
				sanctuary.makeRounds();
				System.out.println("\nPlease select an option (1, 2, 3, or 4) from the menu below: \n"
						+ "============================================"
						+ "\n1.) List Animals \n2.) Add Animal \n3.) Start Attendant's Rounds \n4.) Exit Menu");
				userInput = keyboard.nextInt();
			} else if (userInput == 4) {
				break;
			}

		}

		System.out.println("Thank you for using the Animal Sanctuary App, have a good day!");
		keyboard.close();

	}
}
