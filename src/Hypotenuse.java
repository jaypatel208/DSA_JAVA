public class Hypotenuse {
    public static double hypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static void main(String[] args) {
        System.out.println("Hypotenuse of given triangle is "+ hypotenuse(6,8));
    }
}
