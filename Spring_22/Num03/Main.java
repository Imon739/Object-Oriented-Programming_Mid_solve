package Num03;

public class Main {
    public static void main(String[] args) {
        PClass pObj = new PClass();
        CClass cObj = new CClass();

        pObj.mFnc();
        cObj.mFnc();
        cObj.mFnc(10, 2.99);
        cObj.mFnc(3.145);

    }
    
}
