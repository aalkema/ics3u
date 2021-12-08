class Main {
    public static void main(String[] args) {
        printHeader();

        String userInput = getUserInput();

        // If we pass in 3d8, we want getNumberOfDice to return 3
        int numberOfDiceToRoll = getNumberOfDice(userInput);
        // If we pass in 3d8, we want getNumberOfFacesOnDie to return 8
        int numberOfFacesOnDie = getNumberOfFacesOnDie(userInput);

        // rollDice will create an int[] with length equal to numberOfDiceToRoll
        // each element will be one of the results of rolling a die.
        int[] rollResults = rollDice(numberOfDiceToRoll, numberOfFacesOnDie);
        printArray(rollResults);

        // getShowSum should ask the user a yes no question if they want to see the sum
        boolean showSum = getShowSum();
        if (showSum) {
            System.out.println(sumArray(rollResults));
        }

        printArray(rollResults);        
    }

    public static void printHeader() {
        System.out.println("  ____");
        System.out.println(" /\\' .\\    _____");
        System.out.println("/: \\___\\  / .  /\\");
        System.out.println("\\' / . / /____/..\\");
        System.out.println(" \\/___/  \\'  '\\  /");
        System.out.println("          \\'__'\\/");
        System.out.println("Welcome to DiceRoller!");
        System.out.println("Enter how many dice you would like to roll, and what type");
        System.out.println("in the format {number of dice}d{number of faces}");
        System.out.println("for example: 2d6 for 2 6 sided dice");
    }

    public static String getUserInput() {
        // We expect the input to be in the form {int}d{int} for example, 2d6
        // 2d6 means we want to roll 2 6 sided dice
        return "Not done yet!";
    }

    // Implement the rest of the methods necessary to make this program run
}
