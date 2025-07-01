package sk.posam.effectivejava.chapter4.person;

import java.time.LocalDate;

/**
 * Everything is running OK, where can be a problem in the future? Which change can be problematic?
 */
final class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("John", "Teacher", "Dr.");
        System.out.println(teacher);
        System.out.println("Lenght of name = " + teacher.getLengthOfName());

        Student student = new Student("Jane", "Student", LocalDate.of(2018, 9, 1));
        System.out.println(student);
        System.out.println("Lenght of name = " + student.getLengthOfName());
    }
}
