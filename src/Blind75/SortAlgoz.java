package Blind75;

import java.util.Arrays;

public class SortAlgoz {
    public static void main(String...args){
        System.out.println(Arrays.toString(bubbleSort(new int[]{5,1,0,8,-1,7,11,-4})));
        System.out.println(Arrays.toString(selectionSort(new int[]{5,1,0,8,-1,7,11,-4})));
    }

    static int[] bubbleSort(int[]a){
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    count++;
                }
            }
            if (count==0) break;
        }
        return a;
    }

    static int[] selectionSort(int[]a){

        for(int i=0;i<a.length-1;i++){
            int min=a[i];
            int minIndex=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<min){
                    minIndex=j;
                }
            }
            int temp=a[i];
            a[i]=a[minIndex];
            a[minIndex]=temp;
        }

    return a;
    }

    
}
