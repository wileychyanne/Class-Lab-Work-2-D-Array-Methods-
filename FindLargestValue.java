import java.util.Scanner;
public class FindLargestValue {
    public static void main(String[] args) {
        int[][] matrix = {
                {12, 45, 23, 18},
                {67, 34, 89, 21},
                {15, 92, 56, 43},
                {78, 31, 65, 99}
        };
        displayMatrix(matrix);
        findLargestInRows(matrix);
        int largest = findLargest(matrix);
        System.out.println("The largest value in the entire array: " + largest);
        columnSum(matrix);
        Scanner input = new Scanner(System.in);
        int[][] numbers = new int[5][3];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print("Enter a number for row "
                        + (i + 1) + ", column " + (j + 1) + ": ");
                numbers[i][j] = input.nextInt();
            }
        }

        displayMatrix(numbers);
        findLargestInRows(numbers);
        largest = findLargest(numbers);
        System.out.println("Largest value in the array: " + largest);

    }
    public static void displayMatrix(int[][] array) {
        System.out.println("\nMATRIX");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void findLargestInRows(int[][] array) {
        int largest;
        for (int i = 0; i < array.length; i++) {
            largest = array[i][0];
            for (int j = 0; j < array[i].length; j++) {
                if (largest < array[i][j]) {
                    largest = array[i][j];
                }
            }
            System.out.println("The largest value in row "
                    + (i + 1) + ": " + largest);
        }
    }
    public static int findLargest(int[][] array) {
        int largest = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (largest < array[i][j]) {
                    largest = array[i][j];
                }
            }
        }
        return largest;
    }

    public static void columnSum(int[][] array) {
        for (int j = 0; j < array[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + ": " + sum);
        }
    }
}
