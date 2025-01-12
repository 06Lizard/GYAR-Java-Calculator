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
                System.out.println(Math.calculate(exp));
            }
        }
    }
}