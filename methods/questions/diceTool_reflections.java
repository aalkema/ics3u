/*

This is an assignment I came up with during practicum, I got to help out in an ICS3U
class and taught the second week on methods.

A couple things went well, and a couple things need improvement for when I do this again.

Good things:
The assignments previous to this were a mix of on paper and on replit, and there wasn't
much connection between each question - they were mostly standalone, abstract alogirithm
questions.  I like how this models something real to them, and all the method implementations
lead to a working tool.  A couple of them who played D&D even recognized this could be
used in game to roll dice.  The students also got to see how methods can be used to 
make their program entry point (main method in this case) a more readable summary of the
functionality of their app.  I think it helped them grasp the difference between methods
that return values, and void methods.

Things to improve:
A couple readings in the course, and things from other courses could be applied here.
In terms of Computational Participation, this was an individual assignment.  I really
prefer the idea of students working in groups on one program, collaborating towards one
goal, rather than each person duplicating work on their own.  

I also think I should have provided more options that just a dice app.  Not all students
really connected with the idea of rolling dice, so maybe with Computational Action in mind
we could provide some more authentic mini-app ideas that students could grasp onto.  Also
student choice in terms of a product for assessment is always a good idea.

Overall I had a blast teaching the course.  I think there is so much room in the ICS3/4U
classes to make it feel like a mini version of a software development work environment, I
hope to reflect on my final assignment on this course on platforms to use for students to
write, submit, and review code collaboratively.  
*/


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
