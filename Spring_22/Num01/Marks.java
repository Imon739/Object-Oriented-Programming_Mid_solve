package Num01;

public class Marks {
    private String id;
    private double quizMarks, midMark, finalMark;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getQuizMarks() {
        return quizMarks;
    }
    public void setQuizMarks(double quizMarks) {
        this.quizMarks = quizMarks;
    }
    public double getMidMark() {
        return midMark;
    }
    public void setMidMark(double midMark) {
        this.midMark = midMark;
    }
    public double getFinalMark() {
        return finalMark;
    }
    public void setFinalMark(double finalMark) {
        this.finalMark = finalMark;
    } 
    
    
    public Marks(String id, double quizMarks, double midMark, double finalMark) {
        this.id = id;
        this.quizMarks = quizMarks;
        this.midMark = midMark;
        this.finalMark = finalMark;
    }
    public void passOrNot(){
        double totalMarks = quizMarks + midMark + finalMark;

        if(totalMarks >= 55){
            System.out.println("Passed !!! ");
        }else{
            System.out.println("Failed !!!");
        }
    }
}