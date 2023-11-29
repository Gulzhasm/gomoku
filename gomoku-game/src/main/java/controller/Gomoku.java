package controller;

import java.util.Arrays;
import java.util.Scanner;

public class Gomoku {

    private static final int SIZE = 15;
    private static final char HUMAN = 'W';
    private static final char COMPUTER = 'B';
    private static final char[][] board = new char[SIZE][SIZE];
    private static boolean isGameOver = false;
    private static int humanMoveCount = 0;

    public static void main(String[] args) {
        initializeBoard();
        char currentPlayer = HUMAN;
        while (!isGameOver) {
            if (currentPlayer == HUMAN) {
                humanMove();
            } else {
                computerMove();
            }

            if (humanMoveCount >= 5) {
                if (isGameOver) {
                    System.out.println("The player " + currentPlayer + " has won!");
                }
            }
            currentPlayer = (currentPlayer == HUMAN) ? COMPUTER : HUMAN;
            displayBoard();
        }
    }

    static void humanMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter indexes: ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        if (board[row][col] == ' ') {
            board[row][col] = HUMAN;
            humanMoveCount++;
        } else {
            System.out.println("Invalid indexes entered!");
        }
        if (humanMoveCount >= 5) {
            isGameOver = isWin(HUMAN);
        }
    }

    static void initializeBoard() {
        for (char[] chars : board) {
            Arrays.fill(chars, ' ');
        }
    }

    public static void displayBoard() {
        for (char[] chars : board) {
            for (char aChar : chars) {
                System.out.print(aChar + "|");
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
    }

    static void computerMove() {
        int[] bestMove = bestMove();
        if (bestMove[0] != -1) {
            board[bestMove[0]][bestMove[1]] = COMPUTER;
            isGameOver = isWin(COMPUTER);
        }
    }

    //TODO add an elegant solution best or prioritizedMove
    static int[] bestMove() {

        // isVerticalWin
        // isHorizontalWin
        // isDiagonalDownWin
        // isDiagonalUpWin

        return new int[]{-1, -1};
    }

    //TODO add an elegant solution for checking isWin
    static boolean isWin(char player) {
        // isVerticalWin
        // isHorizontalWin
        // isDiagonalDownWin
        // isDiagonalUpWin

        //no winners
        return false;
    }


}
