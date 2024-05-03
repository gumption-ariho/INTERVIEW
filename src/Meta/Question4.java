package Meta;

import java.util.*;

public class Question4 {
        public static void main(String...args){
            //System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
            //System.out.println(threeSum(new int[]{0,0,0,0,0,0,0}));
            System.out.println(threeSum2(new int[]{-2,0,1,1,2}));
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

    static List<List<Integer>> threeSum2(int[] nums) {
            List<List<Integer>>listy = new ArrayList<>();
            HashSet<List<Integer>>setty= new HashSet<>();
            for(int i=0;nums.length-3>=i;i++){
                //-2,0,1,1,2
                int central=i+1;
                int after=central+1;
                while(after<nums.length && central<after){
                   int sum=nums[i]+nums[central]+nums[after];
                   if(sum==0&&setty.add(Arrays.asList(nums[i],nums[central],nums[after]))){
                     listy.add(Arrays.asList(nums[i],nums[central],nums[after]));
                   }
                   if(after==nums.length-1){
                       central++;
                       after=central+1;
                   }else{
                       after++;
                   }
                  }
            }
            return listy;
    }

}
