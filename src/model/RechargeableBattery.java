package model;

public class RechargeableBattery extends Battery implements Rechargeable
{
    // Attributes
    private int chargerNumber;
    private char type;
    public final static char BATTERY_LITIO = 'l';
    public final static char BATTERY_NIQUEL_CADIO = 'n';
    public final static double FACTOR_LITIO = 0.92;
    public final static double FACTOR_NIQUEL_CADIO = 0.80;

    // Constructor
    public RechargeableBattery(String name, double voltage, double cost, double capacity, int chargerNumber, char type) {
        super(name, voltage, cost, capacity);
        this.chargerNumber = chargerNumber;
        this.type = type;
    }

    // Getters and Setters

    /**
     * @return int return the chargerNumber
     */
    public int getChargerNumber() {
        return chargerNumber;
    }

    /**
     * @param chargerNumber the chargerNumber to set
     */
    public void setChargerNumber(int chargerNumber) {
        this.chargerNumber = chargerNumber;
    }

    /**
     * @return char return the type
     */
    public char getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(char type) {
        this.type = type;
    }

    // costo * voltaje * capacidad / (1000 * número usos * factor de uso)
    @Override
    public double calculateUseFullLifeCost() {
        double typeFactor = 0.0;
        if (type == 'l') {
            typeFactor = FACTOR_LITIO;
        } else {
            typeFactor = FACTOR_NIQUEL_CADIO;
        }
        return super.getCost() * super.getVoltage() * super.getCapacity() / (1000 * chargerNumber * typeFactor);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Charger Number: " + chargerNumber + "\n" +
                "Type: " + type;
    }
}
 