import java.util.Scanner;
public class IPILI_IRISH_ACTIVITY_II {
    public static void main(String[]args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int fnum = keyboard.nextInt();

        System.out.print("Enter Second Number: ");
        int snum = keyboard.nextInt();

        System.out.println("Sum is"+(fnum+snum));
        System.out.println("Difference is"+(fnum-snum));
        System.out.println("Product is"+(fnum*snum));
        System.out.println("Quotient is"+(fnum/snum));



    }

}