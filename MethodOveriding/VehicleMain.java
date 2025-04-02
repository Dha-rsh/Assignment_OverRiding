package MethodOveriding;


class Vehicle {
 String brand;

 public Vehicle(String brand) {
     this.brand = brand;
 }

 public void start() {
     System.out.println(brand + " is starting...");
 }

 public void stop() {
     System.out.println(brand + " is stopping...");
 }
}


class Car extends Vehicle {
 public Car(String brand) {
     super(brand);
 }

 @Override
 public void start() {
     System.out.println(brand + " car is starting ");
 }

 @Override
 public void stop() {
     System.out.println(brand + " car is stopped ");
 }
}


class Bike extends Vehicle {
 public Bike(String brand) {
     super(brand);
 }

 @Override
 public void start() {
     System.out.println(brand + " bike is starting ");
 }

 @Override
 public void stop() {
     System.out.println(brand + " bike is stopping ");
 }
}


public class VehicleMain {
 public static void main(String[] args) {
     Vehicle vehicle1 = new Car("Toyota");
     Vehicle vehicle2 = new Bike("Honda");

     
     vehicle1.start();
     vehicle1.stop();
     System.out.println("--------------------");
     vehicle2.start();
     vehicle2.stop();
 }
}
