package com.company;

public class ToLBSImplentation implements ToLBSAdapter {
    private Kilogram kilogram;

    public ToLBSImplentation(Kilogram kilogram) {
        this.kilogram = kilogram;
    }


    @Override
    public double weight() {
        return kilogram.weight()*2.205;
    }
}
