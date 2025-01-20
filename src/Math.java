public class Math {

    public static double add(double addend1, double addend2) {
        return addend1 + addend2;
    }

    public static double sub(double minuend, double subtrahend) {
        return minuend - subtrahend;
    }

    public static double multi(double multiplicand, double multiplicator) {
        return multiplicand * multiplicator;
    }

    public static double divi(double dividend, double divisor) {
        if (divisor == 0) {
            return Double.NaN;
        }
        return dividend / divisor;
    }

    public static double pow(double base, double exponent) {
        return java.lang.Math.pow(base, exponent);
    }

    public static double sqrt(double radicand) {
        if (radicand < 0) {
            return Double.NaN;
        }
        return java.lang.Math.sqrt(radicand);
    }

    public static double root(double radicand, double index) {
        if (radicand < 0 && (index % 2 == 0)) {
            return Double.NaN;
        }
        return java.lang.Math.pow(radicand, 1 / index);
    }

    public static double abs(double value) {
        return java.lang.Math.abs(value);
    }

    public static double calculate(String exp) {
        exp = exp.replace(" ", "");
        char[] operators = {'+', '-', '*', '/', '^'};
        
        try {
            for (char op : operators) {
                int opIndex = exp.indexOf(op);
                if (opIndex != -1) {
                    double operand1 = Double.parseDouble(exp.substring(0, opIndex));
                    double operand2 = Double.parseDouble(exp.substring(opIndex + 1));

                    switch (op) {
                        case '+' -> {
                            return add(operand1, operand2);
                        }
                        case '-' -> {
                            return sub(operand1, operand2);
                        }
                        case '*' -> {
                            return multi(operand1, operand2);
                        }
                        case '/' -> {
                            return divi(operand1, operand2);
                        }
                        case '^' -> {
                            return pow(operand1, operand2);
                        }
                    }                    
                }
            }
            throw new IllegalArgumentException("No valid operator found");
        } catch (Exception e) {
            // Catch any kind of exception
            System.err.println("Error: " + e.getMessage());
            return Double.NaN; // Return NaN for any error
        }
    }
}
