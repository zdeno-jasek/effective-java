package sk.posam.effectivejava.chapter6;

/**
 * This class implements shipping cost calculation using public static int constants
 * to represent different shipping methods. This approach demonstrates a non-optimal solution
 * that would be better implemented using enums according to "Effective Java" principles.
 */
public class Main {
    // Constants representing shipping methods
    public static final int STANDARD_POSTAL_SERVICE = 0;
    public static final int STANDARD_COURIER = 1;
    public static final int EXPRESS_SAME_DAY = 2;
    public static final int EXPRESS_NEXT_DAY = 3;
    
    public static void main(String[] args) {
        // Test data
        double weight = 5.0;  // 5 kg
        double distance = 20.0;  // 20 km
        
        // Test all shipping methods
        int[] methods = {STANDARD_POSTAL_SERVICE, STANDARD_COURIER, EXPRESS_SAME_DAY, EXPRESS_NEXT_DAY};
        
        System.out.println("Výpočet ceny dopravy pre hmotnosť " + weight + " kg a vzdialenosť " + distance + " km:");
        System.out.println("------------------------------------------------------------");
        
        for (int method : methods) {
            String name = getShippingMethodName(method);
            double cost = calculateShippingCost(method, weight, distance);
            System.out.printf("%s: %.2f EUR%n", name, cost);
        }
        
    }
    /**
     * Calculates shipping cost based on shipping method, weight, and distance
     * 
     * @param shippingMethod the shipping method constant
     * @param weightKg weight of the package in kilograms
     * @param distanceKm delivery distance in kilometers
     * @return calculated shipping cost
     */
    public static double calculateShippingCost(int shippingMethod, double weightKg, double distanceKm) {
        switch (shippingMethod) {
            case STANDARD_POSTAL_SERVICE:
                return 2 + 0.5 * weightKg + 0.1 * distanceKm;
            case STANDARD_COURIER:
                return 5 + 0.2 * weightKg + 0.2 * distanceKm;
            case EXPRESS_SAME_DAY:
                return 10 + 0.4 * weightKg;
            case EXPRESS_NEXT_DAY:
                return 7 + 0.3 * weightKg;
            default:
                throw new IllegalArgumentException("Unknown shipping method: " + shippingMethod);
        }
    }
    
    /**
     * Gets the string representation of a shipping method
     * 
     * @param shippingMethod the shipping method constant
     * @return name of the shipping method
     */
    public static String getShippingMethodName(int shippingMethod) {
        switch (shippingMethod) {
            case STANDARD_POSTAL_SERVICE:
                return "Poštová služba";
            case STANDARD_COURIER:
                return "Kuriér";
            case EXPRESS_SAME_DAY:
                return "Expresné doručenie - rovnaký deň";
            case EXPRESS_NEXT_DAY:
                return "Expresné doručenie nasledujúci deň";
            default:
                throw new IllegalArgumentException("Unknown shipping method: " + shippingMethod);
        }
    }
    

}
