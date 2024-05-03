package Meta;

import java.util.Arrays;

class Question5 {
    static int removeDuplicates(int[] nums) {

        int[] arr = new int[nums.length];
        int j=0;
        for (int i = 0; i < nums.length; ) {
            if(i<nums.length-1){
                //skip duplicates    12333
                while (i<nums.length-1&&nums[i] == nums[i + 1]) {
                    i++;
                }
            }
            arr[j++] = nums[i++];
        }
        for(int i=0;i<j;i++){
            nums[i]=arr[i];
        }

        return j;
    }
    public static void main(String[]args){
        System.out.println(removeDuplicates(new int[]{1,1,1,1,1,1,1,2,2,3,4,5,5,6,7,8,9,10}));


    }
}
