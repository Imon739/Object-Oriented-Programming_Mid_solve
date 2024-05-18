package Num04;

public class Mid {
    public static void main(String [] args){
        ArgentinaFans argentinaFans = new ArgentinaFans(10, "Qatar", 2);
        BrazilFans brazilFans = new BrazilFans(7, "Qatar", 5);

        System.out.println(argentinaFans);
        System.out.println(brazilFans);

        if(argentinaFans.getNoOfGoals() > brazilFans.getNoOfGoals()){
            argentinaFans.incrementWordCup();
        }else{
            brazilFans.incrementWordCup();
        }
        System.out.println(argentinaFans);
        System.out.println(brazilFans);
    }     
}

