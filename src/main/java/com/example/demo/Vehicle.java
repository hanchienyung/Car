package com.example.demo;

public class Vehicle {
    private String name;
    private String color;
    private Integer speed;


    public Vehicle() {
        System.out.println("Constructor is running");
        System.out.println("A new vehicle has been created!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }

    public String getSpeed() {
        return String.valueOf(speed);
    }

    public String start() {
        return "The " + color + " " + name + " is starting";
    }

    public String accelerate() {
        return "The " + color + " " + name + " is accelerating";
    }

}
