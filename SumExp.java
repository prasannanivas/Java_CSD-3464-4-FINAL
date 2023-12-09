// Class for representing a Sum expression
public class SumExp extends BinaryExp {
    public SumExp(ArithmeticExp left, ArithmeticExp right) {
        super(left, right);
    }

    @Override
    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }

    @Override
    protected String getOperator() {
        return " + ";
    }
}
