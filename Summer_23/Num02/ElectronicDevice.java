package Num02;

public class ElectronicDevice extends SmartPhone{

    String brand;
    double price;
    public ElectronicDevice(String brand, double price) {
    this.brand = brand;
    this.price = price;
    }
    public void displayInfo() {
    System.out.println("Brand: " + brand);
    System.out.println("Price: $" + price);
    }
   }