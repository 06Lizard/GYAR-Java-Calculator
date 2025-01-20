import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        while (true){
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("""
                    Input format: val1 op val2, e.g., 2 * 4
                    Operators: +, -, *, /, ^
                    Enter a mathematical expression: """);
                String exp = scanner.nextLine();

                long startTime = System.nanoTime(); // start timmer

                double ans = Math.calculate(exp);      

                long endTime = System.nanoTime(); // end timmer
                long duration = (endTime - startTime) / 1000; // duration in microseconds

                System.out.println("\t" + exp + " = " + ans + "\n\t" + duration + " microseconds\n");
            }
        }
    }
}