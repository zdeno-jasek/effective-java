package sk.posam.effectivejava.chapter2.customfield2;

/**
 * Use custom fields with different types to store name and gender.
 */
class Main {

    public static void main(String[] args) {
        CustomFieldString customName = new CustomFieldString("name", "John Doe");
        CustomFieldGender customGender = new CustomFieldGender(Gender.getMale());
        CustomFieldString customName2 = new CustomFieldString("name", "Jane Doe");
        CustomFieldGender customGender2 = new CustomFieldGender(Gender.getFemale());

        System.out.println(customName.asString());
        System.out.println(customGender.asString());
        System.out.println(customName2.asString());
        System.out.println(customGender2.asString());
    }

}
