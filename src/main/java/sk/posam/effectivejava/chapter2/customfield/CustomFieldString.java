package sk.posam.effectivejava.chapter2.customfield;

class CustomFieldString {
    private String name;
    private String value;

    CustomFieldString(String name, String value) {
        this.value = value;
        this.name = name;
    }

    String asString() {
        return String.format("%s: %s", name, value);
    }
}
