package Num01;

public class Got{
 {
        System.out.println("Valar dohaeris");
 }
        public String name;
        public String house;
        public double impact;
        public float intent;
        public Got()
 {
 System.out.println("Best TV series after Breaking Bad");
 }
 public Got(String name, String house)
 {
 this.name = name;
 this.house = house;
 }
 public Got(double impact)
 {
 this("Daenerys","Targaryen");
 this.impact = impact;
 }
 public Got(float intent)
 {
 this("Arya","Stark");
 this.intent = intent;
 }

public void printFullName()
 {
 System.out.println(name + " " + house);
 }
public void printDetails()
 {
 printFullName();
 System.out.println("Impact: " + impact);
 System.out.println("Intent: " + intent);
 }
 {
 System.out.println("Valar morghulis");
 }
public static void main(String[] args) {
    Got ob1 = new Got();
    ob1.name = "John Snow";
    ob1.house = "404";
    Got ob2 = new Got(4.8);
    ob1.printDetails();
    ob2.printDetails();
}
}
