import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

//Dijkstra’s Two-Stack Algorithm for Expression Evaluation
public class Evaluate142 {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            switch (s) {
                case "(" -> {
                }
                case "+", "-", "*", "/", "sqrt" -> ops.push(s);
                case ")" -> {
                    String op = ops.pop();
                    double v = vals.pop();
                    v = switch (op) {
                        case "+" -> vals.pop() + v;
                        case "-" -> vals.pop() - v;
                        case "*" -> vals.pop() * v;
                        case "/" -> vals.pop() / v;
                        case "sqrt" -> Math.sqrt(v);
                        default -> v;
                    };
                    vals.push(v);
                }
                default -> vals.push(Double.parseDouble(s));
            }
        }
        StdOut.println(vals.pop());
    }
}
