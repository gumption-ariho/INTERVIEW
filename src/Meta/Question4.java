package Meta;

import java.util.*;

public class Question4 {
        public static void main(String...args){
            //System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
            //System.out.println(threeSum(new int[]{0,0,0,0,0,0,0}));
            System.out.println(threeSum(new int[]{-2,0,1,1,2}));
        }
    static List<List<Integer>> threeSum(int[] nums) {
        //prev point
        List<List<Integer>> listy= new ArrayList<>();
        Set<List<Integer>> setty = new HashSet<>();
        for(int prev =0;(nums.length-3)>=prev;prev++){
            System.out.println("in here out");
            for(int ahead=prev+1;(nums.length-2)>=ahead;ahead++){
                for(int j=ahead+1;j<nums.length;j++){
                    System.out.println("in here IN " +nums[prev]+" "+nums[ahead]+" "+nums[ahead+1]);
                    int sum=nums[prev]+nums[ahead]+nums[j];
                    List<Integer>list2=Arrays.asList(nums[prev],nums[ahead],nums[j]);
                    Collections.sort(list2);

                    if(sum==0&&setty.add(list2)){
                        listy.add(list2);
                    }
                }

            }
        }
        return listy;
    }
}
