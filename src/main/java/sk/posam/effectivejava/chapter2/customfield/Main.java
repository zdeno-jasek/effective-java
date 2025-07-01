package sk.posam.effectivejava.chapter2.customfield;

/**
 * Use custom fields to store different types of values for name, age and weight.
 */
public final class Main {

    public static void main(String[] args) {
        CustomFieldString customName = new CustomFieldString("name", "John Doe");
        CustomFieldInteger customAge = new CustomFieldInteger("age", 30);
        CustomFieldDouble customWeight = new CustomFieldDouble("weight", 80.5);

        System.out.println(customName.asString());
        System.out.println(customAge.asString());
        System.out.println(customWeight.asString());
    }

}
