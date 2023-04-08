package Task02.ElectricResistance1;

import java.io.Serializable;

/**
 * The class KineticEnergy implements serializable
 */
public class KineticEnergy implements Serializable {
    private static final long serialVersionUID = 1L;
    private final double mass;
    private final double velocity;

    /**
     * Kinetic energy
     *
     * @param m the m
     * @param v the v
     */
    public KineticEnergy(double m, double v) {
        mass = m;
        velocity = v;
    }

    /**
     * Calculate the kinetic energy
     *
     * @return double
     */
    public double calculateKineticEnergy() {
        return 0.5 * mass * velocity * velocity;
    }

    /**
     * Get binary representation of the integer part of the kinetic energy
     *
     * @return String
     */
    public String getBinaryRepresentation() {
        double kineticEnergy = calculateKineticEnergy();
        int intPart = (int) kineticEnergy;
        return Integer.toBinaryString(intPart);
    }
}
