import edu.princeton.cs.algs4.Counter;

public class RefereneCheck {
    public static void main(String[] args) {
        Counter c1 = new Counter("One");
        System.out.println("c1 before increment: " + c1);
        c1.increment();
        System.out.println(("c1 after increment: ") + c1);
        Counter c2 = c1;
        System.out.println("c2 before increment: " + c2);
        c2.increment();
        System.out.println("c2 after increment: " + c2);
        // here to c2 we gave reference of c1 so increasing c2 will increase value of c1 too
        System.out.println("c1 at the end: "+c1);
    }
}
