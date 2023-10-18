import java.util.Scanner;
import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= abs(x); i++) {
            sum += i;
        }
        System.out.println("The sum of all numbers from 0 to " + x + " is " + ((x >= 0) ? sum : -sum));
    }
}
//        With input check
//        Scanner scanner = new Scanner(System.in);
//        int x;
//        int sum = 0;
//        while (true) {
//            System.out.print("Please enter a number: ");
//            try {
//                x = Integer.parseInt(scanner.next());
//                for (int i = 0; i <= abs(x); i++) {
//                    sum += i;
//                }
//                System.out.println("The sum of all numbers from 0 to " + x + " is " + ((x >= 0) ? sum : -sum));
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("Wrong input!");
//            }
//        }
//    }
//}