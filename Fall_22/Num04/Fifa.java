package Num04;

public class Fifa {
    private int noOfGoals;
    String venue;
    {
        System.out.println("who will be winner ??");
    }
    public Fifa(int noOfGoals, String venue){
        this.noOfGoals = noOfGoals;
        this.venue = venue;
    }
    public String toString(){
        return "Fifa-> noOfGoal:"+noOfGoals+", Venue "+venue;
    }
    public int getNoOfGoals(){
        return noOfGoals;
    }   
    public static void main(String[] args){
        BrazilFans brazilFans= new BrazilFans(7,"Qatar",5);
        System.out.println(brazilFans);

    } 
}
