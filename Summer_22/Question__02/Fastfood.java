package OOP_MID_SUMMER_22.Question__02;

public class Fastfood extends Food {
    String type;
    String flavour;


    Fastfood(Double calories, Double fat, Double carb, String type, String flavour) {
        super(calories, fat, carb);
        this.type = type;
        this.flavour = flavour;
    }


    void Fastfoodreview() {
        System.out.println("Inside the review method of Fastfood class.");
    }


    @Override
    void description() {
        super.description();
    }
}
