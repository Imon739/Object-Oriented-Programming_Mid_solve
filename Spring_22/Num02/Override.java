package Num02;

public class Override extends Base {
    int c;
    public Override(int a, double b, int c){
        super(a, b);
        this.c = c;
    }
    
    void show() {
        double Sum;
        Sum = a+getB()+c;
        System.out.println(Sum);
    }

}
