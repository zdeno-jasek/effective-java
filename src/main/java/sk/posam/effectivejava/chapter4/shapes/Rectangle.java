package sk.posam.effectivejava.chapter4.shapes;

class Rectangle {
    protected int sideA;
    protected int sideB;

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int area() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "A=" + sideA +
                ", B=" + sideB +
                '}';
    }
}
