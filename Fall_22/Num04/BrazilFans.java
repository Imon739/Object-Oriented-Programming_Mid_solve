package Num04;

public class BrazilFans extends Fifa{
    int havingWorldCup;
    {
        System.out.println("Brazil will win");
    }

    public BrazilFans(int noOfGoals, String venue, int havingWorldCup) {
        super(noOfGoals, venue);
        this.havingWorldCup = havingWorldCup;
    }
    public String toString() {
        return "BrazilFans->["+super.toString()+"] havingWorldCup: "+havingWorldCup;
    }
    void incrementWordCup(){
        havingWorldCup++;
    } 
}
