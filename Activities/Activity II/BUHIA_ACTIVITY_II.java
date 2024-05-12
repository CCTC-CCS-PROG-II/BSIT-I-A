import java.util.Scanner;
    public class BUHIA_ACTIVITY_ll{

        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            int value;
            System.out.println("Enter your first number");
            int fnum = sc.nextInt();
            System.out.println("Enter your second number");
            int snum = sc.nextInt();

            System.out.println("Sum is:"+ (fnum + snum));
            System.out.println("Difference is:"+ (fnum - snum));
            System.out.println("Product is:"+ (fnum * snum));
            System.out.println("Quotient is:"+ (fnum / snum));
  }
}
