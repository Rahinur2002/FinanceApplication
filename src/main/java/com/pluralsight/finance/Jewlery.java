package com.pluralsight.finance;

public class Jewlery extends FixedAsset {
    private double karat;

    public Jewlery(String name, double marketValue, double karat) {
        super("Jewlery", 0);
        this.karat = karat;
    }

    public double getKarat() {
        return karat;
    }

    @Override
    public double getValue(){
        double value = 0.0;

        value = this.getKarat();

        return value;
    }
}
