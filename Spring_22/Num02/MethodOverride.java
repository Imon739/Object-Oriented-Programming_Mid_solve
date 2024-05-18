package Num02;

public class MethodOverride {
    public static void main(String[] args) {
        Override obj = new Override(10, 20.5, 12);
        obj.show();

        Override2 obj2 = new Override2(6, 10);
        obj2.show();

        Override2 obj3 = new Override2();
        obj3.show();


    }
    
}
