import java.util.Scanner;

public class RPS {
    static Scanner sc = new Scanner(System.in);
    static final int ROCK = 1, PAPER = 2, SCISSORS = 3; 
    static int wins = 0, losses = 0, ties = 0;
    static int Choice, AIChoice;
    
    public static void main(String[] args) {
        printIntro();
        do { 
            getChoice();
            getAIChoice();
            printChoices();
            calculateWinner();
        } while (wantToPlayAgain());
        printStats();
    }
    public static void printIntro() {
        int x;
        System.out.println("Rock Paper Scissors with JARVIS");
        System.out.println("–––––––––––––––––––––––––––––––––––––––––");
        System.out.println("Good luck!");   
    }
    public static void getChoice() {
        if (Choice != 1 || Choice != 2 || Choice != 3){
                System.out.print("Invalid reponse. Try again.");
                System.out.print("\nYou throw... [1] Rock, [2] Paper, [3] Scissors ");
                Choice = sc.nextInt();
            }else{
                System.out.print("\nYou throw... [1] Rock, [2] Paper, [3] Scissors ");
                Choice = sc.nextInt();
            }
    }
    public static void getAIChoice() {
        AIChoice = (int) (Math.random() * 3 + 1);
    }
    public static void printChoices() {
        if (Choice == ROCK) 
            System.out.print("You threw Rock!");
        else if (Choice == PAPER) 
            System.out.print("You threw Paper!");
        else if (Choice == SCISSORS) 
            System.out.print("You threw Scissors!");
        if (AIChoice == ROCK)     
            System.out.println("JARVIS threw Rock!");
        else if (AIChoice == PAPER) 
            System.out.println("JARIS threw Paper!");
        else if (AIChoice == SCISSORS) 
            System.out.println("JARVIS threw Scissors!");
    }
    public static void calculateWinner() {
        if (Choice == AIChoice) {
            System.out.println("Lets go again...");
            ties++;
        } else if (Choice == ROCK && AIChoice == SCISSORS || Choice == PAPER && AIChoice == ROCK || Choice == SCISSORS && AIChoice == PAPER) {
            System.out.println("No, that's impossible!");
            wins++;
        } else {
            System.out.println("Better luck next time.");
            losses++;
        }
    }
    public static boolean wantToPlayAgain() {
        if (boolean != y || boolean != n){
                System.out.print("Invalid reponse. Try again.");
                System.out.print("Do you want to play again? [y,n]: ");
                String answer = sc.next();
                return answer.equals("Y") || answer.equals("y");
            }else{
                System.out.print("Do you want to play again? [y,n]: ");
                String answer = sc.next();
                return answer.equals("Y") || answer.equals("y");
            }
    }
    public static void printStats() {
        System.out.println("\nGood game!");
        System.out.println("–––––––––––––––––––––––––––––––––––––––––");
        System.out.println("Wins:   " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Ties:   " + ties);
    }
}