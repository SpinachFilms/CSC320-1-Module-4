import java.util.Scanner;

public class FloatingPointStats {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int count = 0;
        double total = 0.0;
        double value;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;

        while (count < 5) {
            System.out.print("Enter floating-point value #" + (count + 1) + ": ");
            if (scnr.hasNextDouble()) {
                value = scnr.nextDouble();
                total += value;

                if (value > max) {
                    max = value;
                }

                if (value < min) {
                    min = value;
                }

                count++;
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scnr.next();
            }
        }

        double average = total / 5;
        double interest = total * 0.20;

        System.out.println("\nResults:");
        System.out.printf("Total: %.2f\n", total);
        System.out.printf("Average: %.2f\n", average);
        System.out.printf("Maximum: %.2f\n", max);
        System.out.printf("Minimum: %.2f\n", min);
        System.out.printf("Interest on Total at 20%%: %.2f\n", interest);
    }
}