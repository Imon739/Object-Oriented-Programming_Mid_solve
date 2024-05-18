package Num02;

public class Base {
    public int a;
    private double b;

    public Base(int a, double b) {
        this.a = a;
        this.b = b;
    }

    public Base() {
        this.a = 0;
        this.b = 0;
    }

    public Base(Base ob){
        a= ob.a;
        b = ob.b;

    }

    public double getB(){
        return b;
    }
    public void setB(double b){
        this.b = b;
    }
    void show(){
        System.out.println("Sum of variables"+" In the base class "+ (a+b));
    }
}



    
    

