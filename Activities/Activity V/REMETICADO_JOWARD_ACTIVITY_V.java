import java.util.Scanner;

public class REMETICADO_JOWARD_Activity_V{
    public static void main (String []args){

        int age;  
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Age: ");

        age = keyboard.nextInt();

        if(age >= 0 && age > 12){
            System.out.println("Child");
        
         }else if (age >= 12 && age > 18)
            System.out.println("Teen");
            
            else if(age >= 18 && age > 65)
            System.out.println("Adult");

        
        
  

      
        

    }
}
