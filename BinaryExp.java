// Abstract class for binary expressions
public abstract class BinaryExp extends ArithmeticExp {
    protected ArithmeticExp left;
    protected ArithmeticExp right;

    public BinaryExp(ArithmeticExp left, ArithmeticExp right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left.toString() + getOperator() + right.toString();
    }

    protected abstract String getOperator();
}
