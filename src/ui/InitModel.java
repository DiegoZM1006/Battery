package ui; 

import model.*;

public class InitModel {
    
    public InitModel() { }

    public Battery[] createBatteries(){
        Battery[] batteries = new Battery[Company.MAX_BATTERIES];

		batteries[0] = new Battery("AAA", 1.5, 100, 10);
		batteries[1] = new Battery("AA", 1.5, 150, 80);
        batteries[2] = new Battery("D", -1.2, 110, 12);
        batteries[3] = new Battery("C", 1.5, 150, 80);
        //batteries[4] = new Battery("D", 25, 2500, 1000);
        batteries[5] = new Battery("C", 5.5, 150, 50);
        batteries[6] = new RechargeableBattery("AAA", 1.2, 600, 250, 2000, RechargeableBattery.BATTERY_LITIO);
        batteries[7] = new RechargeableBattery("AA", 2, 205, 400, 1200,  RechargeableBattery.BATTERY_LITIO);
        batteries[8] = new RechargeableBattery("D", 12, 400, 1000, 500, RechargeableBattery.BATTERY_NIQUEL_CADIO);
        batteries[9] = new RechargeableBattery("C", 4.5, 62, 521, 800,  RechargeableBattery.BATTERY_NIQUEL_CADIO);

        return batteries;
    }

}
