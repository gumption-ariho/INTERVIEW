package Meta;

public class Question9 {

        public static void main(String[] args) {
            char[]arr= {'a','b','b','c','C','D'};
            int[]a=new int[128];
            for(int i=0;i<arr.length;i++){
                int x= arr[i];
                System.out.println(x);
                a[arr[i]]++;
            }
            for(int i:a){
                System.out.print(i+" ");
            }

        }
}
