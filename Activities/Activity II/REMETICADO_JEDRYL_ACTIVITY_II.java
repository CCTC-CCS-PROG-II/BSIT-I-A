import java.util.Scanner;
public class REMETICADO_JEDRYL_ACTIVITY_II{

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int fnum = keyboard.nextInt();

        System.out.println("Enter second number: ");
        int snum = keyboard.nextInt();

        int sum = fnum+snum;
        int diff = fnum-snum;
        int qoutient = fnum/snum;

        System.out.println("The sum:" +sum);
        System.out.println("The diff: " +diff);
        System.out.println("The qoutient: " +qoutient);
    }
}
