package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfNumByStream {
    public static void main(String... a){
        // TODO Stream approach or declarative approach

        List<Integer> arr = Arrays.asList(1,2,3,4);
        List<Boolean> collect = arr.stream().map(i -> i == 2).collect(Collectors.toList());
        System.out.println(collect);
    }
}
