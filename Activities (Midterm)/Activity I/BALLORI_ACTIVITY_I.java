import java.util.Scanner;

public class BALLORI_ACTIVITY_I{
    public static void main(String[] args) {

        String[] names = new String[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 names");
        for (int i = 0; i < 5; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        System.out.print("Enter a number between 1 and 5 to select a name: ");
        int index;
        if (scanner.hasNextInt()) {
            index = scanner.nextInt();
            if (index < 1 || index > 5) {
                System.out.println("Invalid input. Number must be between 1 and 5.");
                return;
            }
            System.out.println("Selected name: " + names[index - 1]);
        } else {
            System.out.println("Invalid input. Please enter a number.");
        }
    }
}
