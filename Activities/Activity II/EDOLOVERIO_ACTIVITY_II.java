import java.util.Scanner;

public class EDOLOVERIO_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number:");
        int fnum = sc.nextInt();

        System.out.println("Enter the Second Number:");
        int snum = sc.nextInt();

        System.out.println("Sum is: " + (fnum + snum));
        System.out.println("Difference is: " + (fnum - snum));
        System.out.println("Product is: " + (fnum * snum));

        // Check if the second number is not zero before performing division
        if (snum != 0) {
            System.out.println("Quotient is: " + (fnum / snum));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}
