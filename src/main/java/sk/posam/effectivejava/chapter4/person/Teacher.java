package sk.posam.effectivejava.chapter4.person;

final class Teacher extends Person {
    private final String title;

    Teacher(String givenName, String familyName, String title) {
        super(givenName, familyName);
        this.title = title;
    }

    @Override
    int getLengthOfName() {
        return givenName.length() + 1 + familyName.length() + 1 + title.length();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "title='" + title + "\', " +
                super.toString() +
                '}';
    }
}
