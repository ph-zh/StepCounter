import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            printMenu();

            int command = scanner.nextInt();
            if(command == 1) {
                System.out.println("Frank Spignetti");
            } else if(command == 2) {
                System.out.println("2");
            } else if(command == 3) {
                System.out.println("3");
            } else {
                System.out.println("4");
                scanner.close();
                return;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Enter step count for a specific day");
        System.out.println("Change daily step goal");
        System.out.println("Print monthly statistics");
        System.out.println("Exit application");
    }
}