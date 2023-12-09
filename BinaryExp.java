public abstract class BinaryExp extends ArithmeticExp {
    public ArithmeticExp left;
    public ArithmeticExp right;

    public BinaryExp(ArithmeticExp left, ArithmeticExp right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left.toString() + getOperator() + right.toString();
    }

    public abstract String getOperator();
}
