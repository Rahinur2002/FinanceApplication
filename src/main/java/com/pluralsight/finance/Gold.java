package com.pluralsight.finance;

public abstract class Gold extends FixedAsset {
    private double gold;

    public Gold(String name, double marketValue, double gold) {
        super(name, marketValue);
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
