public class DivExp extends BinaryExp {
    public DivExp(ArithmeticExp left, ArithmeticExp right) {
        super(left, right);
    }

    @Override
    public int evaluate() {
        if (right.evaluate() == 0) {
            throw new ArithmeticException("cannot divide by zero... Sorry.");
        }
        return left.evaluate() / right.evaluate();
    }

    @Override
    public String getOperator() {
        return " / ";
    }
}
