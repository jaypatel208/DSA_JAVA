public class NewtonRaphsonSquareRoot {
    public static double squareRoot(double S, double epsilon) {
        double x = S / 2.0;

        while (Math.abs(x * x - S) > epsilon) {
            x = 0.5 * (x + S / x);
        }

        return x;
    }

    public static void main(String[] args) {
        double number = 16.0;
        double precision = 0.01;

        double result = squareRoot(number, precision);
        System.out.println("Square root of " + number + " is : " + result);
    }
}
