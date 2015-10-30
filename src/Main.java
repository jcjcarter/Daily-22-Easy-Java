import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        ArrayList<String> strings = new ArrayList<>(Arrays.asList("a","b","c","1","4"));
        ArrayList<String> strings1 = new ArrayList<>(Arrays.asList("a", "x", "34", "4"));


        for (String str : strings)
            if (!strings1.contains(str)) {
                strings1.add(str);
            }

        strings1.forEach(System.out::println);
    }

}
