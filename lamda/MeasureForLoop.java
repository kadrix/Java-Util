package lamda;

import java.util.ArrayList;
import java.util.List;

class MeasureForLoop {
    public static long[] checkTimes(List<Integer> list) {
        long forStart = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            System.out.println(list.get(i));
        }
        long forEnd = System.currentTimeMillis();

        long lambdaStart = System.currentTimeMillis();
        list.forEach(System.out::println);
        long lambdaEnd = System.currentTimeMillis();

        return new long[] {forEnd-forStart, lambdaEnd-lambdaStart};

    }

    public static void main(String[] args) {
       List<Integer> arr = new ArrayList<>();
       
       for (int i = 0; i < 100; i++){
        arr.add(i);
       }

       long[] result = checkTimes(arr);
       System.out.println(result.toString());
    }
}