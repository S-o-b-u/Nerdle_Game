import java.util.Random;
import java.util.Scanner;
/*
        Create a class Game, which allows a user to play "Guess the Number" game once.
        =============================================================================
        Game should have the following methods:
        -->Constructor to generate the random number
        -->takeUserInput() to take a user input of number
        -->isCorrectNumber() to detect whether the number entered by the user is true
        -->getter and setter for noOfGuesses
        -->Use properties such as noOfGuesses(int), etc to get this task done!
 */
class game{
    public int pcNum;
    public int inputNumber;
    public int numOfGuesses=0;
    public int getNumberOfGuesses(){
        return numOfGuesses;
    }
    public void setNumberOfGuesses(int numOfGuesses){
        this.numOfGuesses = numOfGuesses;
    }
    public game(){
        Random rand = new Random();
        this.pcNum = rand.nextInt(100);
    }
    public void takeUserInput(){
        System.out.print("Guess the number my LORD >< => ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    public boolean isCorrectNumber(){
            numOfGuesses++;
        if (inputNumber>100){
            System.out.println("INVALID INPUT!" +
                    "\n ---->YOU SHOULD GUESS THE NUMBER BETWEEN 1-100");
            return false;
        }
        if (inputNumber==pcNum){
            System.out.println("==================================");
            System.out.printf("You guessed it right BUDDY >^< " +
                               "\n-->The NUMBER was -> %d \n-->You guessed it in %d attempts!"
                    +"\n==(THANK YOU FOR USING ME--@SOBU)==", inputNumber, numOfGuesses);
            System.out.println("\n==================================");

            return true;
        } else if (inputNumber>pcNum) {
            System.out.println("This is too Large!!"+"\n\tGuess Again>");
        }
        else if (inputNumber<pcNum) {
            System.out.println("This is too Small!!"+"\n\tGuess Again>");
        }
            return false;
    }
}
public class Nerdle {
    public static void main(String[] args) {
        game XO = new game();
        boolean b = false;
        System.out.println("===A WARM WELCOME TO OUR GAME===");
        System.out.printf("        <<NERDLE GAME>>         \n");
        while(!b){
            XO.takeUserInput();
            b = XO.isCorrectNumber();
        }
    }
}
