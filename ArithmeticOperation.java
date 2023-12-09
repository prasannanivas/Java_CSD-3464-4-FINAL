public class ArithmeticOperation {
    public static void main(String[] args) {

        System.out.println("Testing the expression 3 + 2 * 5");
        ArithmeticExp expression = new SumExp(
                new NumberExp(3),
                new ProductExp(
                        new NumberExp(2),
                        new NumberExp(5)));
        System.out.println("Expression: " + expression.toString());
        System.out.println("Result: " + evaluate(expression));

        System.out.println("Testing Modulo operation: 15 % 7");
        ArithmeticExp moduloExp = new ModuloExp(new NumberExp(15), new NumberExp(7));
        System.out.println("Expression: " + moduloExp.toString());
        System.out.println("Result: " + evaluate(moduloExp));

        System.out.println("Testing Division operation: 20%10");
        ArithmeticExp divExp = new DivExp(new NumberExp(20), new NumberExp(10));
        System.out.println("Expression: " + divExp.toString());
        System.out.println("Result: " + evaluate(divExp));

        System.out.println("Testing Division by zero operation: 20%0");
        ArithmeticExp divExp2 = new DivExp(new NumberExp(20), new NumberExp(0));
        System.out.println("Expression: " + divExp2.toString());
        try {
            System.out.println("Result: " + evaluate(divExp2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Testing Subtraction operation: 20-15");
        ArithmeticExp subExp = new SubExp(new NumberExp(20), new NumberExp(15));
        System.out.println("Expression: " + subExp.toString());
        System.out.println("Result: " + evaluate(subExp));

    }

    public static int evaluate(ArithmeticExp expression) {
        return expression.evaluate();
    }
}
