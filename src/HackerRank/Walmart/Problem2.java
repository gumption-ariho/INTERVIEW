package HackerRank.Walmart;

import java.util.Arrays;

public class Problem2 {
    static int compareVersion(String version1, String version2) {
        //check for the ineteger before the dot
        //check for the integer after the dot
        String[]v1=version1.split("\\.");
        String[]v2=version2.split("\\.");
       // System.out.println(Arrays.toString(v1)+" "+Arrays.toString(v1));
        for(int i=0;i<v1.length||i<v2.length;i++){
            int val1=i<v1.length?Integer.valueOf(v1[i]):0;
            int val2=i<v2.length?Integer.valueOf(v2[i]):0;
            //System.out.println(val1+" "+val2);
            if(val1>val2){
                return 1;
            }else if(val2>val1){
                return -1;
            }else{
                continue;
            }
        }
        return 0;
    }
    public static void main(String[]args){
       System.out.println( compareVersion("1.2","1.10"));
    }
}

