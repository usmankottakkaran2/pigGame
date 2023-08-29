package com.aurionpro.test;

import java.util.Scanner;

public class PigGameTest {

    public static void main(String[] args) {
        playPigGame();
    }

    public static void playPigGame() {
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;
        int turnScore;
        int turns=0;
        System.out.println("Let's Play PIG!");

        for (int turn = 1; totalScore < 20; turn++) {
        	turns=turn;
            System.out.println("\nTURN " + turn);
            turnScore = 0;

            while (true) {
                int die = rollDie();
                System.out.println("Roll or hold? (r/h): ");
                String choice = scanner.nextLine();

                if (choice.equalsIgnoreCase("r")) {
                    if (die == 1) {
                        System.out.println("Die: " + die);
                        System.out.println("Turn over. No score.");
                        totalScore=0;
                        turnScore = 0;
                        break;
                    } else {
                        System.out.println("Die: " + die);
                        totalScore+=die;
                        turnScore += die;
                        if(totalScore>20)
                        	break;
                    }
                } else if (choice.equalsIgnoreCase("h")) {
                    System.out.println("Score for turn: " + turnScore);
                    System.out.println("Total score: " + totalScore);
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 'r' or 'h'.");
                }
            }
        }

        System.out.println("\nYou finished in " + turns + " turns!");
        System.out.println("Game over!");
        scanner.close();
    }

    public static int rollDie() {
        return (int) (Math.random() * 6) + 1;
    }
}

