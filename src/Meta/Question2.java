package Meta;

public class Question2 {
        static int myAtoi(String s) {
            boolean positive =true;
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' '&&sb.isEmpty()){
                    continue;
                }
                if(s.charAt(i)=='+' &&sb.isEmpty()){
                    positive=true;
                    sb.append(s.charAt(i));
                    continue;
                }else if(s.charAt(i)=='-'&& sb.isEmpty()){
                    positive=false;
                    sb.append(s.charAt(i));
                    continue;
                }
                if(Character.isDigit(s.charAt(i))){
                    sb.append(Character.getNumericValue(s.charAt(i)));
                }else{
                    break;
                }
            }//for loop
            if(sb.isEmpty()||sb.toString().equals("+")||sb.toString().equals("-")){
                return 0;
            }

            try{
                System.out.println(sb.toString());
                return Integer.parseInt(sb.toString());
            }catch(NumberFormatException e){
                if(positive){
                    return Integer.MAX_VALUE;
                }else{
                    return Integer.MIN_VALUE;
                }
            }
        }

        public static void main(String ...args){
            System.out.println(myAtoi("   +0 123"));
        }

}
