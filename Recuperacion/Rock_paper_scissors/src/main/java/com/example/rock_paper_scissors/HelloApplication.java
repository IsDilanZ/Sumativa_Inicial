package com.example.rock_paper_scissors;
import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Scanner;
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
    }
    public static void main(String[] args) {

        boolean RockWins = false;
        boolean ScissorWins = false;
        boolean PaperWins = false;
        boolean PlayerOneInput = false;
        boolean Tie = false;

        Scanner InputVariable = new Scanner(System.in);
        System.out.println("PLAYER #1 - Enter R(Rock), P(Paper) or S(Scissors)");
        String PlayerOne = InputVariable.nextLine();

        Scanner InputVariable2 = new Scanner(System.in);
        System.out.println("PLAYER #2 - Enter R(Rock), P(Paper) or S(Scissors)");
        String PlayerTwo = InputVariable2.nextLine();

        if (PlayerOne.compareToIgnoreCase("P") == 0 && PlayerTwo.compareToIgnoreCase("R") == 0) {PaperWins = true; PlayerOneInput = true;}
        if (PlayerOne.compareToIgnoreCase("R") == 0 && PlayerTwo.compareToIgnoreCase("P") == 0) {PaperWins = true;}

        if (PlayerOne.compareToIgnoreCase("R") == 0 && PlayerTwo.compareToIgnoreCase("S") == 0) {RockWins = true; PlayerOneInput = true;}
        if (PlayerOne.compareToIgnoreCase("S") == 0 && PlayerTwo.compareToIgnoreCase("R") == 0) {RockWins = true;}

        if (PlayerOne.compareToIgnoreCase("S") == 0 && PlayerTwo.compareToIgnoreCase("P") == 0) {ScissorWins = true; PlayerOneInput = true;}
        if (PlayerOne.compareToIgnoreCase("P") == 0 && PlayerTwo.compareToIgnoreCase("S") == 0) {ScissorWins = true;}

        if (PlayerOne.compareToIgnoreCase("P") == 0 && PlayerTwo.compareToIgnoreCase("P") == 0){Tie = true;}
        if (PlayerOne.compareToIgnoreCase("R") == 0 && PlayerTwo.compareToIgnoreCase("R") == 0){Tie = true;}
        if (PlayerOne.compareToIgnoreCase("S") == 0 && PlayerTwo.compareToIgnoreCase("S") == 0){Tie = true;}

        if (PaperWins || ScissorWins || RockWins) {
            if (PaperWins) {
                if (PlayerOneInput) {
                    System.out.println("Paper Wins! - Player One Wins");
                } else {
                    System.out.println("Paper Wins! - Player Two Wins");
                }
            } else if (RockWins) {
                if (PlayerOneInput) {
                    System.out.println("Rock Wins! - Player One Wins");
                } else {
                    System.out.println("Rock Wins! - Player Two Wins");
                }
            } else {
                if (PlayerOneInput) {
                    System.out.println("Scissors Wins! - Player One Wins");
                } else {
                    System.out.println("Scissors Wins! - Player Two Wins");
                }
            }
        } else if (Tie){
            System.out.println("Tie! - Both Players entered the same object");
        } else {
            for (int i=0 ; i <= 50 ; i++){System.out.println();} //Line used to clear screen
            System.out.println("You must enter R for Rock, P for Paper and S for Scissors");
            System.out.println("Please rerun the program");
        }
    }
}