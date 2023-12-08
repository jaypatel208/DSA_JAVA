import edu.princeton.cs.algs4.Date;

public class MemoryManagement104 {
    public static void main(String[] args) {
        Date a = new Date(12, 31, 1999);
        System.out.println(a);
        Date b = new Date(12,31,2001);
        System.out.println(b);
        b = a;
        System.out.println(a);
        System.out.println(b);
    }
}
