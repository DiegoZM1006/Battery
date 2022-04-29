package model;

public class Battery 
{
    // Attributes
    private String name;
    private double voltage;
    private double cost;
    private double capacity;

    // Constructor
    public Battery(String name, double voltage, double cost, double capacity) {
        this.name = name;
        this.voltage = voltage;
        this.cost = cost;
        this.capacity = capacity;
    }

    // Getters and Setters

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return double return the voltage
     */
    public double getVoltage() {
        return voltage;
    }

    /**
     * @param voltage the voltage to set
     */
    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    /**
     * @return double return the cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * @return double return the capacity
     */
    public double getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "\n** Battery (" + name + ") **\n" +
                "Voltage:"+ voltage + "\n" +
                "Cost: "+ cost +"\n" +
                "Capacity: " + capacity;
    }

}
