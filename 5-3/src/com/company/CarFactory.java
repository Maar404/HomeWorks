package com.company;

public class CarFactory {
    public CarClass getCarForBudget(int budget) {
        if (budget > 50000)
        {
            return new BMW();
        }
        else
            return new Pride();
    }
    public CarClass getCarByName(String name) {
        switch (name.toLowerCase()) {
            case "bmw":
                return new BMW();
            case "pride":
            case "saypa":
                return new Pride();
            default:
                return null;
        }

    }

}