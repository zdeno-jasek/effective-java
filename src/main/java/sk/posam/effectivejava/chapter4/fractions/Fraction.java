package sk.posam.effectivejava.chapter4.fractions;

public class Fraction {
    private int numerator;      // citatel
    private int denominator;    // menovatel

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return "%d/%d".formatted(numerator, denominator);
    }
}
