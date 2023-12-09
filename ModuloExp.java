// Class for representing a Modulo expression
public class ModuloExp extends BinaryExp {
    public ModuloExp(ArithmeticExp left, ArithmeticExp right) {
        super(left, right);
    }

    @Override
    public int evaluate() {
        return left.evaluate() % right.evaluate();
    }

    @Override
    protected String getOperator() {
        return " % ";
    }
}
