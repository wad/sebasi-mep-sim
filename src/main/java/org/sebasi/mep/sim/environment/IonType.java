package org.sebasi.mep.sim.environment;

public enum IonType {
    Sodium(1),
    Potassium(1),
    Calcium(2),
    Chloride(-1);

    private int charge;

    IonType(int charge) {
        this.charge = charge;
    }

    public int getCharge() {
        return charge;
    }
}
