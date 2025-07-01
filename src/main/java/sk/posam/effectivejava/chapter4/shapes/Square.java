package sk.posam.effectivejava.chapter4.shapes;

class Square extends Rectangle {

    @Override
    public void setSideA(int sideA) {
        super.setSideA(sideA);
        super.setSideB(sideA);
    }

    @Override
    public void setSideB(int sideB) {
        super.setSideA(sideB);
        super.setSideB(sideB);
    }

}
