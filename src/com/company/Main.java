package com.company;

public class Main {

    public static void main(String[] args) {

        com.company.Car mercedes = new com.company.Car("Mercedes", 200, 2019, 1);

        mercedes.accelerate(10);
        mercedes.brake(100);
        mercedes.info();
        System.out.println("The special ID is " + mercedes.getSpecialId());
    }
}
