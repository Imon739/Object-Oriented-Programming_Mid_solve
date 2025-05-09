import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static ArrayList<Product> myList;

    public static void main(String[] args) {

        myList = new ArrayList<>();
        ArrayList<Product> newList = (ArrayList<Product>) myList.stream().distinct().collect(Collectors.toList());
        myList = newList;
    }

    public static void printProduct(String company) {
        for (Product x : myList) {
            if (x.getCompany().equals(company)) {
                System.out.println(x.toString());
            }
        }
    }

    public void buy(Product p) {
        int y = myList.indexOf(p);
        if (y != -1) {
            Product nP = myList.get(y);
            int Q = nP.getQuantity();
            Q--;
            nP.setQuantity(Q);
            myList.remove(y);
            myList.add(y, nP);
        }
    }

    public static void displayExpired() {
        for (Product x : myList) {
            if (x.getYear() + 2 > 2024) {
                System.out.println(x.toString());
            }
        }
    }
}
