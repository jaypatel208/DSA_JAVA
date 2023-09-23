public class HarmonicNumber {

    public static double har(int N) {
        double sum = 0.0;
        for (int i = 0; i <= N; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Harmonic of given number is: "+har(15));
    }
}
