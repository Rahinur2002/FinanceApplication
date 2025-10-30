package com.pluralsight.finance;

public abstract class Gold extends FixedAsset {
    private double gold;

    public Gold(double gold) {
        super("gold", 0);
        this.gold = gold;
    }

    public double getGold() {
        return gold;
    }

    @Override
    public double getValue(){
        double value = 0.0;
            value = this.getGold();
        return value;
    }
}
