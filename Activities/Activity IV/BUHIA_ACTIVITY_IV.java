import java.util.Scanner;
public class BUHIA_ACTIVITY_IV {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Red/Green/Black: ");
        String robot = sc.nextLine();

        switch(robot){
           case "red":
                System.out.println("1");
                break;
            case "green":
                System.out.println("2");
                break;
            case "black":
                System.out.println("3");
                break;
        }
    }
}
