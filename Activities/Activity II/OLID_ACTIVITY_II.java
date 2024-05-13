import java.util.Scanner;
public class OLID_ACTIVITY_II{
    public static void main (String[] args){
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Enter first number:");
        int fnum = keyboard.nextInt();
        System.out.print("Enter Second number:");
        int snum = keyboard.nextInt();
        
        int sum = fnum+snum;
        int diff =fnum-snum;
        int quotient = fnum*snum;

        System.out.print("The sum: " +sum);
        System.out.print("The diff: " +diff);
        System.out.print("The quotient: " +quotient);

    }
}

    
        
