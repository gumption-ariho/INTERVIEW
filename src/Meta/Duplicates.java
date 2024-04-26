package Meta;
import java.util.*;
public class Duplicates {
    public static void main(String...args){
        System.out.println(duplicates(new int[]{1,2,3,4}));
    }
    static boolean duplicates(int[]arr){
        HashSet<Integer> setty= new HashSet<>();
        for(int i:arr){
            if(!setty.add(i)){
                return true;
            }
        }
        return false;
    }
}
