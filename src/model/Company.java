package model;

public class Company{
	
    public static final int MAX_BATTERIES = 10;
	private Battery[] batteries;

	public Company() {
        this.batteries = new Battery[MAX_BATTERIES];
	}

    public Company(Battery[] batteries){
        this.batteries = batteries;
    }
	

    public void registerBattery(String name, double voltage, double cost, double capacity){
        int emtyPos = getEmtyPosition();
        batteries[emtyPos] = new Battery(name, voltage, cost, capacity);

    }

    public void registerRechargeableBattery(String name, double voltage, double cost, double capacity, int chargerNumber, char type) {
        int emtyPos = getEmtyPosition();
        batteries[emtyPos] = new RechargeableBattery(name, voltage, cost, capacity, chargerNumber ,type);
        
    }
    
    private int getEmtyPosition() {
        int pos = -1;
        for (int i = 0; i < MAX_BATTERIES && pos == -1; i++) {
            if (batteries[i] == null) {
                pos = i;
            }
        }
        return pos;
    }

    public int showTotalBatteries() {
        int total = 0;
        for (int i = 0; i < MAX_BATTERIES; i++) {
            if (batteries[i] != null) {
                total += 1;
            }
        }
    	return total;
    }
    
    public String showBatteriesInfo() {
    	String str = "";
        for (int i = 0; i < MAX_BATTERIES; i++) {
            if (batteries[i] != null) {
                str += batteries[i].toString();
            }
        }
    	return str;
    }
    

	public double calculateUsefulPromLifeCost(){
        double average = 0.0;
        int cont = 0;
        for (int i = 0; i < MAX_BATTERIES; i++) {
            if (batteries[i] != null && batteries[i] instanceof RechargeableBattery) {
                cont += 1;
                average += ((RechargeableBattery)batteries[i]).calculateUseFullLifeCost();
            }
        }
        average = average/cont;
		return average;
	}

}
