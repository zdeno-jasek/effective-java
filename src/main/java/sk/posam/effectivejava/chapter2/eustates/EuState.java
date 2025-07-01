package sk.posam.effectivejava.chapter2.eustates;

class EuState {
    private String name;
    private String capital;

    EuState(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "EuState{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }
}
