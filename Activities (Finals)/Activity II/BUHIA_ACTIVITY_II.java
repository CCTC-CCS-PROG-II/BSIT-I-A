import java.util.Scanner;
public class BUHIA_ACTIVITY_II{
    public static void feettoinches(int feet){
        int res = feet * 12;
        System.out.println(res);
    }
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your feet: ");
        int feet = sc.nextInt();
        feettoinches(feet);
    }
}
