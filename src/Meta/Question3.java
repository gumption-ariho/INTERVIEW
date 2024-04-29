package Meta;

import java.util.HashMap;
import java.util.Map;

public class Question3 {
        static int romanToInt(String s) {
            int prev=0;
            int sum=0;
            for(int i=0;i<s.length();){

                if(i<s.length()-1 &&(s.charAt(i)=='I'||s.charAt(i)=='X'||s.charAt(i)=='C')){
                    char curr=s.charAt(i);
                    char next= s.charAt(i+1);
                    if(curr=='I'){

                        if(next=='V'){
                            sum=sum+4;
                            i=i+2;
                        } else if(next=='X'){
                            sum=sum+9;
                            i=i+2;
                        }else{
                            sum=sum+convertSingle(curr);
                            i++;
                        }

                    }else if(curr=='X'){

                        if(next=='L'){
                            sum=sum+40;
                            i=i+2;
                        } else if(next=='C'){
                            sum=sum+90;
                            i=i+2;
                        }else{
                            sum=sum+convertSingle(curr);
                            i++;
                        }
                        System.out.println(sum+"in x");
                    }else if(curr=='C'){

                        if(next=='D'){
                            sum=sum+400;
                            i=i+2;
                        }else if(next=='M'){
                            sum=sum+900;
                            i=i+2;
                        }else{
                            sum=sum+convertSingle(curr);
                            i++;
                        }
                        System.out.println(sum+"in c");
                    }
                }else{

                    sum=sum+convertSingle(s.charAt(i));
                    i++;
                    System.out.println(sum);
                }
            }
            return sum;
        }



        static int convertSingle(char x){
            int y =  switch(x){
                case'M'-> 1000;

                case'D'-> 500;

                case'C'-> 100;

                case'L'-> 50;

                case'X'-> 10;

                case'V'-> 5;

                case'I'->  1;
                default->0;
            };
            return y;
        }

    static int romanToInt2(String s) {
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int sum = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = values.get(s.charAt(i));

            if (currValue < prevValue) {
                sum -= currValue;
            } else {
                sum += currValue;
            }

            prevValue = currValue;
        }

        return sum;
    }
        public static void main(String...args){
            System.out.println(romanToInt2("XIX"));
        }

}
