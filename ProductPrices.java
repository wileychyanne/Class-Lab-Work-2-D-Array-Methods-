import java.util.Scanner;
public class ProductPrices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] prices = new double [3][4];
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Enter prices for Store " + (i + 1));
            for (int j = 0; j < prices[i].length; j++) {
                System.out.println("Price of product " + (j + 1) + ": ");
                prices[i][j] = input.nextDouble();
            }
        }
        //display prices
        System.out.println("\nPRODUCT PRICES");
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Store " + (i + 1) + ": ");
            for (int j = 0; j < prices[i].length; j++) {
                System.out.printf("$%.2f\t", prices[i][j]);
            }
            System.out.println();
        }
        //calculate the total value of products in each store
        System.out.println("\nTOTAL VALUE FOR EACH STORE");
        for (int i = 0; i < prices.length; i++) {
            double total = 0;
            for (int j = 0; j < prices[i].length; j++) {
                total += prices[i][j];
            }
            System.out.printf("Store %d total: $%.2f%n", i + 1, total);
        }
    }
}
