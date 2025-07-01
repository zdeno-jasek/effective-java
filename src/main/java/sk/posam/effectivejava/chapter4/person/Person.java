package sk.posam.effectivejava.chapter4.person;

abstract class Person {
    protected final String givenName;
    protected final String familyName;

    Person(String givenName, String familyName) {
        this.givenName = givenName;
        this.familyName = familyName;
    }

    /**
     * Calculate length of name for an address label.
     * It has to contain all names and titles - give name, family name, title etc.
     */
    abstract int getLengthOfName();

    @Override
    public String toString() {
        return "Person{" +
                "givenName='" + givenName + '\'' +
                ", familyName='" + familyName + '\'' +
                '}';
    }
}
