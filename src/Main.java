
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Grade result");
        int grade = scanner.nextInt();

        int grade1 = 100;
        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 70) {
            System.out.println("B");
        } else if (grade >= 60) {
            System.out.println("C");
        } else if (grade >= 50) {
            System.out.println("D");
        } else if (grade >= 40) {
            System.out.println("E");
        } else if (grade >= 20) {
            System.out.println("F");
        }
    }
}

