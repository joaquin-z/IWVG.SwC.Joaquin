package iwvg.swc.joaquin.clases;

public class Fraction {
    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean isPropia() {
        return Math.abs(this.numerator) < Math.abs(this.denominator);
    }

    public boolean isImpropia() {
        return !this.isPropia();
    }

    public boolean isDecimal() {
        Integer x = 1;
        while (x < Math.abs(this.denominator) && x <= Integer.MAX_VALUE / 10) {
            x *= 10;
        }
        return x == Math.abs(this.denominator);
    }

    public boolean isIndefinite() {
        return this.denominator == 0;
    }
}
