package Meta;
import java.util.*;
import java.util.stream.Collectors;

class Question8 {
    public static void main(String...args){
        System.out.println(minWindow("ab", "b"));
    }
    static String minWindow(String s, String t) {
        if(s.equals(t)){
            return t;
        }
        HashMap<Character,Integer>mappy = new HashMap<>();
        for(int i=0;i<t.length();i++){
            mappy.put(t.charAt(i),mappy.getOrDefault(t.charAt(i),0)+1);
        }
        ArrayList<Character>list= new ArrayList<>();
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer>copy=new HashMap<>(mappy);
            int j=i;
            ArrayList<Character>list2= new ArrayList<>();
            System.out.println("xxxxxxxxxx");
            while(!copy.isEmpty()){
                System.out.println("yyyyyyyyyyyyyyyyyy");
                if(copy.containsKey(s.charAt(j))) {
                    copy.put(s.charAt(j), copy.get(s.charAt(j)) - 1);
                    if (copy.get(s.charAt(j)) == 0) {
                        copy.remove(s.charAt(j));
                    }
                }
                list2.add(s.charAt(j));
                j++;
            }
            System.out.println(list2);
            if(list.isEmpty()||list2.size()<list.size()){
                list=list2;
            }
        }
        return list.stream().map(Object::toString) // Convert each character to a string
                .collect(Collectors.joining());
    }
}