package sk.posam.effectivejava.chapter2.states;

/**
 * Use this class to create and print information about states.
 */
public final class Main {

    public static void main(String[] args) {
        State california = new State("California", "Sacramento", 39538223, 423967, 3.2, "English");
        State texas = new State("Texas", "Austin", 29145505, 695662, 1.9, "English");
        State florida = new State("Florida", "Tallahassee", 21538187, 170312, 1.1, "English");

        System.out.println(california);
        System.out.println(texas);
        System.out.println(florida);
    }

}