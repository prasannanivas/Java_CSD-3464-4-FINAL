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
    }

    public static int evaluate(ArithmeticExp expression) {
        return expression.evaluate();
    }
}
