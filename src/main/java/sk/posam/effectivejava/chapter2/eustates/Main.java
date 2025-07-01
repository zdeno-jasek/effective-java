package sk.posam.effectivejava.chapter2.eustates;

/**
 * Use EuState class to represent EU states.
 */
public class Main {

    public static void main(String[] args) {
        EuState slovakia = new EuState("Slovakia", "Bratislava");
        EuState czechia = new EuState("Czechia", "Prague");
        EuState hungary = new EuState("Hungary", "Budapest");

        System.out.println(slovakia);
        System.out.println(czechia);
        System.out.println(hungary);
    }
}
