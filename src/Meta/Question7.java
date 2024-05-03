package Meta;

import java.util.Arrays;

public class Question7 {

    public String addBinary(String a, String b) {
        int remainder=0;
        StringBuilder sb = new StringBuilder();


        //1110   1
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int x = (i >= 0) ? a.charAt(i) - '0' : 0;
            int y = (j >= 0) ? b.charAt(j) - '0' : 0;
            int sum = remainder + x + y;
            remainder = sum / 2;
            sb.append(sum % 2);
        }

        while(remainder>0){
            sb.append(remainder%2);
            remainder/=2;
        }
        System.out.println(sb.toString()+" unreversed");

        String unreversed=sb.toString();
        char[]arr=unreversed.toCharArray();
        for(int i=0,j=arr.length-1;i<arr.length/2;i++,j--){
            char temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        System.out.println(Arrays.toString(arr)+" reversed");
        return String.valueOf(arr);
    }
}
