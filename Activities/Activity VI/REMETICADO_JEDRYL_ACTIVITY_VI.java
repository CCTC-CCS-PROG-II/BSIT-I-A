import java.util.Scanner;

public class REMETICADO_JEDRYL_ACTIVITY_VI{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of seconds");
        int time = input.nextInt();

        while (time >= 0 ){
            System.out.println(time);
            time--;
        }
       
    }
}

