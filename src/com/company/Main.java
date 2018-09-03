package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        boolean isValid = false;
        String colour = "";
        int userInput = 0;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Please choose a paint colour");
            System.out.println("1. Red");
            System.out.println("2. Blue");
            System.out.println("3. Yellow");
            System.out.println("4. Green");
            System.out.println("5. Purple");
            userInput = scanner.nextInt();

            switch (userInput){
                case 1:
                    colour = "Red";
                    isValid = true;
                    break;

                case 2:
                    colour = "Blue";
                    isValid = true;
                    break;

                case 3:
                    colour = "Yellow";
                    isValid = true;
                    break;

                case 4:
                    colour = "Green";
                    isValid = true;
                    break;

                case 5:
                    colour = "Purple";
                    isValid = true;
                    break;

                default:
                    System.out.println("Invalid Option");
                    break;

            }
        }while (!isValid);

        System.out.println("You chose " + colour);
    }
}
