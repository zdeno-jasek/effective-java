package sk.posam.effectivejava.chapter2.customfield2;

class Gender {
    private String description;

    Gender(String description) {
        this.description = description;
    }

    static Gender getMale() {
        return new Gender("Male");
    }

    static Gender getFemale() {
        return new Gender("Female");
    }

    @Override
    public String toString() {
        return description;
    }
}