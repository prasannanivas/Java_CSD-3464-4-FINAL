// Class for representing a Number expression
public class NumberExp extends ArithmeticExp {
    private int value;

    public NumberExp(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
