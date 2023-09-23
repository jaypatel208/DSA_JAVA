import java.util.Scanner;

public class StaticExamples {
    public static int abs(int x) {
        if (x < 0) return -x;
        else return x;
    }

    public static double abs(double y) {
        if (y < 0.0) return -y;
        else return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number(INT): ");
        int x = sc.nextInt();

        int resultX = abs(x);
        System.out.println("The absolute value of " + x + " is " + resultX);

        System.out.println("Enter a Number(DOUBLE): ");
        double y = sc.nextDouble();

        double resultY = abs(y);
        System.out.println("The absolute value of " + y + " is " + resultY);
    }
}
