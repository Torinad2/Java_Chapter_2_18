/******************************************************************
 * Word Game                                                      *
 * This program prompts the user for various inputs, including    *
 * name, age, city, college, profession, type of animal, and a    *
 * pet's name. It then generates a short story using these        *
 * inputs in a structured format.                                 *
 ******************************************************************/

import java.util.Scanner;

public class WordGame {

    /**************************************************************
     * Main Method                                                *
     * Prompts the user for information and generates a story     *
     * using the inputs provided.                                 *
     **************************************************************/
    public static void main(String[] args) {

        //*********************************************************
        // Variable Declarations                                  *
        // To store user input for the story generation           *
        //*********************************************************
        String name;                          // User's name
        int age;                              // User's age
        String city;                          // User's city
        String college;                       // College name
        String profession;                    // User's profession
        String animal;                        // Type of animal
        String petName;                       // Name of the pet

        //*********************************************************
        // Input Section                                          *
        // Prompting the user for all the required information    *
        //*********************************************************
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = keyboardInput.nextLine();

        System.out.print("Enter your age: ");
        age = keyboardInput.nextInt();
        keyboardInput.nextLine(); // Consume newline

        System.out.print("Enter the name of a city: ");
        city = keyboardInput.nextLine();

        System.out.print("Enter the name of a college: ");
        college = keyboardInput.nextLine();

        System.out.print("Enter a profession: ");
        profession = keyboardInput.nextLine();

        System.out.print("Enter a type of animal: ");
        animal = keyboardInput.nextLine();

        System.out.print("Enter a pet's name: ");
        petName = keyboardInput.nextLine();

        //*********************************************************
        // Output Section                                         *
        // Display the generated story                            *
        //*********************************************************
        System.out.println();
        System.out.println("There once was a person named " + name + " who lived in " + city + ".");
        System.out.println("At the age of " + age + ", " + name + " went to college at " + college + ".");
        System.out.println(name + " graduated and went to work as a " + profession + ".");
        System.out.println("Then, " + name + " adopted a(n) " + animal + " named " + petName + ".");
        System.out.println("They both lived happily ever after!");

        //*********************************************************
        // Developer Credit                                       *
        //*********************************************************
        System.out.println();
        System.out.println("Developed by: Nikita Baiborodov");

        //*********************************************************
        // Resource Cleanup                                       *
        // Close the scanner to prevent resource leaks            *
        //*********************************************************
        keyboardInput.close();
        System.exit(0);
    }
}

