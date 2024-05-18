

public class Vehicle {
    private String brand;
    private String model;
    static {
    System.out.println("Initializing Vehicle class...");
    }
    {
    System.out.println("Initializing an instance of the Vehicle class...");
    }
    public Vehicle() {
    System.out.println("Creating a default vehicle.");
    brand = "Unknown";
    }
    public Vehicle(String brand, String model) {
    System.out.println("Creating a customized vehicle of brand: " + brand + " and model: " + 
   model);
    this.brand = brand;
    this.model = model;
    }
    public void honk() {
    System.out.println("The vehicle emits a honking sound.");
    }
    public void honk(String sound) {
        System.out.println("The vehicle emits a custom honking sound: " + sound);
        }
        static{
        System.out.println("Making sure of initialization...");
        }
        public void info(){
        System.out.println("model="+model+" brand="+brand); 
        }
        public static void main(String[] args) {
        Vehicle defaultVehicle = new Vehicle();
        defaultVehicle.honk();
        defaultVehicle.info();
        Vehicle truck = new Vehicle("Ford", "F-150");
        truck.honk("Loud horn sound");
        truck.info();
        }
       }