package sk.posam.effectivejava.chapter2.customfield;

class CustomFieldDouble {
    private String name;
    private double value;

    CustomFieldDouble(String name, double value) {
        this.value = value;
        this.name = name;
    }

    String asString() {
        return String.format("%s: %.1f", name, value);
    }
}
