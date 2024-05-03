package Meta;
import java.util.*;
public class Question6 {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>mappy = new HashMap<>();
        for(String i:strs){
            char[]arr=i.toCharArray();
            Arrays.sort(arr);
            String j=String.valueOf(arr);
            if(mappy.containsKey(j)){
                mappy.get(j).add(i);
            }else{
                List<String> w =new LinkedList<>();
                w.add(i);
                mappy.put(j,w);
            }
        }

        List<List<String>>listy= new LinkedList<>();
        for(String x: mappy.keySet()){
            listy.add(mappy.get(x));
        }
        return listy;

    }
}
