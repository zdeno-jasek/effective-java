package sk.posam.effectivejava.chapter4.person;

import java.time.LocalDate;

final class Student extends Person {
    private final LocalDate dateOfEnrollment;

    Student(String givenName, String familyName, LocalDate dateOfEnrollment) {
        super(givenName, familyName);
        this.dateOfEnrollment = dateOfEnrollment;
    }

    @Override
    int getLengthOfName() {
        return givenName.length() + 1 + familyName.length();
    }


    @Override
    public String toString() {
        return "Student{" +
                "dateOfEnrollment=" + dateOfEnrollment + ", " +
                super.toString() +
                '}';
    }
}
