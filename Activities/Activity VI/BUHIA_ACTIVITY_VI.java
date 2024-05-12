import java.util.Scanner;
    public class BUHIA_ACTIVITY_VI{
        public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            int sec; 
            
            System.out.println("Enter the Countdown: ");
            sec = sc.nextInt();

            while(sec >=0) {
                System.out.println(sec);
                sec--;
            }
        }
    }
