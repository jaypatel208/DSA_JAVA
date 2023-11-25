import java.util.Scanner;

/**
 * Write a program that reads in lines from standard input with each line containing
 * a name and two integers and then uses printf() to print a table with a column of
 * the names, the integers, and the result of dividing the first by the second, accurate to
 * three decimal places. You could use a program like this to tabulate batting averages for
 * baseball players or grades for students.
 */
public class Print1121 {
    public static void printDetails() {

        System.out.println("Enter name and two integers (separated by spaces):");
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] parts = input.split(" ");

        if (parts.length != 3) {
            System.out.println("Invalid input format, please enter name and two integers (separated by spaces)");
        }

        String name = parts[0];
        int integer1 = Integer.parseInt(parts[1]);
        int integer2 = Integer.parseInt(parts[2]);

        double division = (double) integer1 / integer2;

        System.out.printf("%-15s %-10d %-10d %-10.3f%n", name, integer1, integer2, division);
    }

    public static void main(String[] args) {
        printDetails();
    }
}
