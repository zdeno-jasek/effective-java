package sk.posam.effectivejava.chapter4.shapes;

/**
 * What is the area of a square with sides 2 and 3?
 */
public final class Main {

    public static void main(String[] args) {
        Square square2 = new Square();
        square2.setSideA(2);
        square2.setSideB(3);
        System.out.printf("%s has area %d \n", square2, square2.area());
    }
}
