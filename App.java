package main;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Hedgehog hedgehog = new Hedgehog();

    while (true) {
      System.out.println("1) Make hedgehog talk, 2) Create new hedgehog, 3) Make hedgehog run, 0) Quit");

      if (!scanner.hasNextInt()) {
        String input = scanner.next();
        if (input.equals("0")) {
          System.out.println("Thank you for using the program.");
          break; 
        }
        System.out.println("Wrong input value");
        continue;
      }

      int choice = scanner.nextInt();

      if (choice == 0) {
        System.out.println("Thank you for using the program.");
        break; 
      }

      scanner.nextLine();

      switch (choice) {
        case 1:
          System.out.print("What does hedgehog say?\n");
          String message = scanner.nextLine();
          hedgehog.speak(message);
          break;
        case 2:
          System.out.print("What is the name of the hedgehog:\n");
          String newName = scanner.nextLine();
          System.out.print("What is the age of the hedgehog:\n");
          if (!scanner.hasNextInt()) {
            System.out.println("Wrong input value");
            scanner.next();
            continue;
          }
          int newAge = scanner.nextInt();
          scanner.nextLine();
          hedgehog = new Hedgehog(newName, newAge);
          break;
        case 3:
          System.out.print("How many laps?\n");
          if (!scanner.hasNextInt()) {
            System.out.println("Wrong input value");
            scanner.next(); 
            continue;
          }
          int laps = scanner.nextInt();
          scanner.nextLine();
          hedgehog.run(laps);
          break;
        default:
          System.out.println("Wrong input value");
      }
    }

    scanner.close(); 
  }
}
