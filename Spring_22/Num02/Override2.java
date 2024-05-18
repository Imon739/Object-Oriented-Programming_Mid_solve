package Num02;

public class Override2 extends Base{
    public Override2(int a, double b){
        super(a, b);
    }
    public Override2(){
        super();
    }
    public Override2(Override2 obj) {
        super(obj);
    }

        void show(){
            super.show();
    }
    
}
