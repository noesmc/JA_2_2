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