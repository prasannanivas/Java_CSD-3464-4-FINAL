public class SubExp extends BinaryExp {
    public SubExp(ArithmeticExp left, ArithmeticExp right) {
        super(left, right);
    }

    @Override
    public int evaluate() {
        return left.evaluate() - right.evaluate();
    }

    @Override
    public String getOperator() {
        return " - ";
    }
}
