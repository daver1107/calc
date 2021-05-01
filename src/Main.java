import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        double num = scanner.nextDouble();
        char operation = scanner.next().charAt(0);
        double num2 = scanner.nextDouble();
       {
            System.out.println(total(num, operation, num2));
        }
        scanner.close();
    }

    private static double total(double num, char operation, double num2) {
        double result = 0;
        switch (operation) {
            case '-' -> result = num - num2;
            case '+' -> result = num + num2;
            case '/' -> result = num / num2;
            case '*' -> result = num * num2;
        }
        return result;
    }
}