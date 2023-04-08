package Task02.ElectricResistance1;

/**
 * The class Main
 */
public class Main {
    public static void main(String[] args) {
        ElectricResistance resistance = new ElectricResistance(12.0, 8.0, 10.0, 5.0);
        System.out.println("Electric resistance: " + resistance.getResistance());
        System.out.println("Total resistance: " + resistance.calculateTotalResistance());
        System.out.println("Hexadecimal representation: " + resistance.getHexadecimalRepresentation());
    }
}