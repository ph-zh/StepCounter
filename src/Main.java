import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            printMenu();

            int command = scanner.nextInt();
            if(command == 1) {
                System.out.println("Running command 1...");
            } else if(command == 2) {
                System.out.println("Running command 2...");
            } else if(command == 3) {
                System.out.println("Running command 3...");
            } else if (command == 0){
                System.out.println("Exit");
                scanner.close();
                return;
            } else {
                System.out.println("Sorry, this command is not available yet.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("1 - Enter step count for a specific day");
        System.out.println("2 - Change daily step goal");
        System.out.println("3 - Print monthly statistics");
        System.out.println("0 - Exit application");
    }
}