package Meta;

import java.util.HashSet;

public class Question1 {

    public static void main(String...args){
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
        static int lengthOfLongestSubstring(String s) {

            //p w wke w
            HashSet<Character> setty = new HashSet<>();
            int max = 0;
          int prev=0;
            for(int i=0;i<s.length();){
                if(setty.add(s.charAt(i))){
                    i++;
                }else{
                    max=max>setty.size()?max:setty.size();
                    setty.clear();
                    i=prev+1;
                    prev=i;
                }
            }

            return max>setty.size()?max:setty.size();
        }

}
