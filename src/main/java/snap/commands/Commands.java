package snap.commands;

import java.util.Scanner;

public abstract class Commands {
    protected final Scanner scanner = new Scanner(System.in);
    protected String[] commands = new String[]{};


    public void setCommands(String[] commands) {
        this.commands = commands;
    }


    public void printCommands() {
        if (commands.length == 0) {
            System.out.println("\nNo current commands set\n");
        } else {
            System.out.println("\nPlease select an option: \n");
            for (int i = 0; i < commands.length; i++){
                System.out.println(i + ": " + commands[i]);
            }
        }
    }

    public String getWordInput() {
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()){
                System.out.println("Please enter word!");
            } else {
                return input.split(" ")[0].toLowerCase();
            }
        }
    }

    public int getIntegerInput() {
        while (true) {
            int input = scanner.nextInt();
            if (input < 0 || input > commands.length) {
                System.out.println("Please enter a number between 0 " + commands.length);
            } else {
                return input;
            }
        }
    }

    public int getIntegerInput(int numLimit) {
        while (true) {
            int input = scanner.nextInt();
            if (input < 0 || input > numLimit) {
                System.out.println("Please enter a number between 0 " + numLimit);
            } else {
                return input;
            }
        }
    }



//  Method to get command line characters from user
    public char getCharInput() {
//      Infinite loop requires valid letter to end.
        while (true) {
            System.out.println("Enter a letter: ");
//          Only takes first letter entered on command line
            char input = scanner.next().charAt(0);
            // if char given is not letter, displays error message, then loop starts again
            if (!Character.isLetter(input)){
                System.out.println("Incorrect character!");
            } else {
                return Character.toLowerCase(input);
            }
        }
    }

    public String getStringInput() {
        // Infinite loop requires valid input to end.
        while (true) {
            System.out.println("Enter a string: ");
            // Takes the whole line entered on the command line then trims removeing whitespace spaces
            String input = scanner.nextLine().trim();

            // check if it's not empty and contains only letters
            if (input.isEmpty() || !input.chars().allMatch(Character::isLetter)) {
                System.out.println("Incorrect input! Please enter a valid string containing only letters.");
            } else {
                // Convert the string to lowercase (or any other processing you need) and return
                return input;
            }
        }
    }

}
