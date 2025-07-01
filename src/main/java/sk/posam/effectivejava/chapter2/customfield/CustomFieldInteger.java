package sk.posam.effectivejava.chapter2.customfield;

class CustomFieldInteger {
    private String name;
    private int value;

    CustomFieldInteger(String name, int value) {
        this.value = value;
        this.name = name;
    }

    String asString() {
        return String.format("%s: %d", name, value);
    }
}
