import java.util.Scanner;
public class ABABAN_ACTIVITY_II {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);


        System.out.print("Input First Number= ");
        int anum = input.nextInt();

        System.out.print("Input Second Number= ");
        int bnum = input.nextInt();

        int sum = anum + bnum;
        int sub = anum - bnum;
        int mul = anum * bnum;

        System.out.println("Sum: "+sum);
        System.out.println("Subtraction: "+sub);
        System.out.println("Multiplication: "+mul);


    }
    }


