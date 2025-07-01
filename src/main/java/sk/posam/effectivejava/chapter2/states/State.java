package sk.posam.effectivejava.chapter2.states;

class State {
    private String name;
    private String capital;
    private int population;
    private double area;
    private double gdp;
    private String officialLanguage;

    State(String name, String capital, int population, double area, double gdp, String officialLanguage) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.gdp = gdp;
        this.officialLanguage = officialLanguage;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", gdp=" + gdp +
                ", officialLanguage='" + officialLanguage + '\'' +
                '}';
    }
}
