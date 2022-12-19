package pl.javastart.task;

import java.util.Scanner;

public class ArrayUtils {

    public int[][] createArray() {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;

        int n = 0;
        do {
            System.out.println("Podaj liczbę wierszy [MAX 100].");
            rows = scanner.nextInt();
            System.out.println("Podaj liczbę kolumn [MAX 100].");
            columns = scanner.nextInt();
            if (rows > 100) {
                System.out.println("Podaj mniejszą liczbę wierszy!");
            } else if (columns > 100) {
                System.out.println("Podaj mniejszą liczbę kolumn!");
            } else {
                n++;
            }
        } while (n == 0);
        int[][] array = new int[rows][columns];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i * j;
            }
        }
        for (int[] row : array) {
            for (int cell : row) {
                System.out.printf("%5d |", cell);
            }
            breakLine(columns);
        }
        return array;
    }

    private void breakLine(int columns) {
        String line = "-------";
        String repeated = line.repeat(columns);
        System.out.println();
        System.out.printf("%s\n", repeated);

    }
}