package HackerRank.Walmart;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamz {
    public static void main(String...args){
       List<List<Integer>>lol = Arrays.asList(Arrays.asList(1,2,3,4,5),Arrays.asList(9,8,7,6));
        List<Integer>x =lol.stream()
                .flatMap(y -> y.stream()) // Flatten the inner lists
                //.flatMap(z -> Stream.of(z, z * 1))
                        .collect(Collectors.toList());
        System.out.println(x);
        /*
        List<Integer>list = Stream.of(1,2,3,4)
                .flatMap(x->Stream.of(x,x*2))
                .collect(Collectors.toList());
        System.out.println(list);

        */
    }


}
