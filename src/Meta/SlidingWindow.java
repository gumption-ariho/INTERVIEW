package Meta;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.HashMap;

public class SlidingWindow {
    public static void main(String[] args) {
        //System.out.println(slide(new int[]{4,2,1,7,8,1,2,8,1,0},3));
        //System.out.println(sum(new int[]{0,2,2,-7,1,2,1,0},4));
        //System.out.println(longestSubstring("AAAHHIBC",2));
        System.out.println(longestSubstring("ababbc",2));
    }
    static int slide(int[]arr, int k){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(i>=(k-1)){
                max=Math.max(sum,max);
                sum-=arr[i-(k-1)];
            }
        }
        return max;
    }

    static int sum(int[]arr,int k){
        int start=0;
        int count=0;
        int sum=0;
        int min =Integer.MAX_VALUE;
        //422 7812810   3
        for(int i=0;i<arr.length;){
           /* if(arr[i]>=k){
                return 1;
            }
            */
            if(sum>=k){
                count=i-start;
                min=Math.min(min,count);
                //System.out.println("Sliding in there "+min);
                sum=sum-arr[start];
                start++;
            }else{
               // System.out.println("NOT - Sliding up there "+arr[i]);
                sum+=arr[i];
                i++;
            }


        }

        return min;
    }

    static int longestSubstring(String s,int k){
        int longest=Integer.MIN_VALUE;
        int counter=0;
        int prev=0;
        HashMap<Character,Integer>map= new HashMap<>();

    for(int i=0;i<s.length();i++){
        char letter= s.charAt(i);
        map.put(letter,map.getOrDefault(letter,0)+1);
        if(map.size()>k){
            while(map.size()>k){
                map.put(s.charAt(prev),map.get(s.charAt(prev)-1));
                if(map.get(s.charAt(prev))==null){
                    map.remove(s.charAt(prev));
                }
                prev++;
            }
            counter=i-prev-1;
        }else{
            counter++;
        }
        longest=Math.max(counter,longest);
    }

    return longest;
    }
}
