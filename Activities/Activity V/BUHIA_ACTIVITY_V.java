import java.util.Scanner;
    public class BUHIA_ACTIVITY_V{
    public static void main(String []args) {
        Scanner keyboard= new Scanner(System.in);
        
        System.out.println("Enter your age: ");
        Int Age = sc.nextInt();

        if(age >= 0 && age <= 11){
            System.out.println("Child");
        }
       
        else if(age <=12 && age <=17){
            System.out.println("Teen");
        }
        
        else if(age >= 18 && age <=64){
            System.out.println("Adult");

        }
    }
}
