import java.util.Scanner;

class Main {

    public static int getInput() {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int userInput = getInput();
        printEnteredNumber(userInput);

        // Feel free to modify the code here to test your methods below
    }

    public static void printEnteredNumber(int enteredNumber) {
        System.out.println(enteredNumber);
    }

    // 1. 
    // Write a method that prints a header welcoming the user
    // to the calculator, and tells them the options the calculator
    // will provide, something like
    /*
        Welcome to my math tool!
        This calculator can determine if:
            1. A number is odd or even
            2. The maximum of three numbers
            3. Draw rectangles
    */
    public static void printHeader() {
        // ...
    }

    // 2.
    // Write a method that takes an int and
    // Determines if the number is odd or even

    // 3.
    // Write a method that takes an int and 
    // determines the maximum number of the three

    // 4.
    // Write a method that takes two ints
    // And draw a rectangle on the screen using X's - for example
    // if the ints are 4, 5, draw:
    /*
        XXXXX
        XXXXX
        XXXXX
        XXXXX
    */

    // 4b
    // Write a method that takes a number and returns the factorial

    // Stretch goals for the crazy

    // 5.
    // Make a menu that shows the calculation options that are available
    // Allows the user to select an option
    // Prompts for the necessary input
    // Does the calculation, prints it
    // Then loops back to the main menu
    // Provide an option to quit the program in the menu

    // 6.
    // Write a method that takes a number the user entered and
    // Determines if the number is Prime

    // Wild territory

    // 7.
    // Write a method that takes 3 ints - a, b, c and prints a string
    // showing the quadratic for those coefficients
    // eg showQuadratic(3, 6, -2) should print "3x^2 + 6x - 2"

    // 8.
    // Find the roots of a quadratic given the coefficients
    // eg findRoots(2, 3, -2) = 0.5 and -2
    // find a way to deal with one real root/2 real roots/complex roots
}