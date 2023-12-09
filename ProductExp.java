// Class for representing a Product expression
public class ProductExp extends BinaryExp {
    public ProductExp(ArithmeticExp left, ArithmeticExp right) {
        super(left, right);
    }

    @Override
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }

    @Override
    protected String getOperator() {
        return " * ";
    }
}
