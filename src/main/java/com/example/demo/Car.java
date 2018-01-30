package com.example.demo;

public class Car extends Vehicle {
    private String model;

    public Car(){
        super();
        System.out.println("The vehicle is a car.");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        model = "Porsche";
        return model;
    }

    public String toString() {
        return "Model is "+ model + " The color is "+getColor() + "the name "+ getName();
    }
}
