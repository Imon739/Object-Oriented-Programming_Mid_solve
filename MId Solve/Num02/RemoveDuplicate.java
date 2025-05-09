import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate{
    public static void main(String[] args) {
        ArrayList<Integer>nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(4);
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(4);

        System.out.println("Original Arraylist: "+nums);
        removeDuplicate(nums);
        System.out.println("Arraylist after removing duplicates: "+nums);
    }

    public static void removeDuplicate(ArrayList<Integer> nums ){
        HashSet<Integer>set = new HashSet<>();
        for(int i = 0; i < nums.size(); i++){
            if(set.contains(nums.get(i))){
                nums.remove(i);
                i--;
            }else{
                set.add(nums.get(i));
            }
        }
    }
}