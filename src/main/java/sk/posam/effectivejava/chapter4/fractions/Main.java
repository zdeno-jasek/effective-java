package sk.posam.effectivejava.chapter4.fractions;

/**
 * Main class for testing Fraction class.
 * We have to add two fractions and print the result.
 * 1/2 + 2/3 = 7/6
 */
public final class Main {

    public static void main(String[] args) {
        Fraction sum = new Fraction(1, 2);
        Fraction twoThirds = new Fraction(2, 3);

        System.out.printf("%s + %s = ", sum, twoThirds);

        sum.setNumerator(sum.getNumerator() * twoThirds.getDenominator() + twoThirds.getNumerator() * sum.getDenominator());
        sum.setDenominator(sum.getDenominator() * twoThirds.getDenominator());

        System.out.println(sum);

        Fraction divideByZero = new Fraction(1, 0);
        System.out.println("This is also possible: " + divideByZero);
    }

}
