package com.company;

public class Car {
    //Attributes
    String model;
    int speed;
    int yearModel;
    int carID;

    //Constructor
    public Car(String model, int speed, int yearModel, int carID) {
        this.model = model;
        this.speed = speed;
        this.yearModel = yearModel;
        this.carID = carID;
    }

    //Methods
    public void accelerate(int speed) {
        this.speed = this.speed + speed;
        System.out.println( "Accelerate: " + this.speed);
    }

       public void brake (int speed) {
        this.speed = this.speed - speed;
        System.out.println("Brake: " + this.speed);
    }

    public void info () {
        System.out.println("The car is " + this.model + " the model's year is " + this.yearModel + " with " + this.carID + " and has been driving up to " + this.speed + " miles an hour.");
    }

    public int getSpecialId(){
        int specialId = this.carID + this.yearModel;
        return specialId;
    }

}
