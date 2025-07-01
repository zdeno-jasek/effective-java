package sk.posam.effectivejava.chapter2.customfield2;

class CustomFieldGender {
    private String name;
    private Gender value;

    CustomFieldGender(Gender value) {
        this.name = "Gender";
        this.value = value;
    }

    String asString() {
        return String.format("%s: %s", name, value);
    }
}