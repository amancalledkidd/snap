package snap.commands;

import java.util.Timer;
import java.util.TimerTask;

public class SnapCommands extends Commands {
    public boolean pressEnter() {
        System.out.println("Hit enter to take your turn");
        while (true) {
            if(scanner.hasNextLine()){
                String enter = scanner.nextLine();
                return true;
            }
        }
    }

    @Override
    public int getIntegerInput(int numLimit) {
        while (true) {
            System.out.println("Please enter a number between 1 and " + numLimit + ": ");
            String input = scanner.nextLine().trim();

            try {
                int intInput = Integer.parseInt(input);

                if (intInput < 1 || intInput > numLimit) {
                    System.out.println("Invalid input! Number must be between 0 and " + numLimit + ".");
                } else {
                    return intInput;
                }
            } catch (NumberFormatException e) {

                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }
    }


}
