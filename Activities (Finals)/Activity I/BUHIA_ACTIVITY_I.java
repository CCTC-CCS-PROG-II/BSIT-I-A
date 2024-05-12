import java.util.Scanner;
public class BUHIA_ACTIVITY_I{
        public static void main(String[] args){
            int length = length(); 
            int width = width();
            int area = length * width;
            System.out.println("Area = " + area);
        }    
        public static int length(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of the rectangle: ");
            return sc.nextInt();
        }
        public static int width(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the width of the rectangle: ");
            return sc.nextInt();
        }
}
