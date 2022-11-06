package main;

import java.util.ArrayList;
import java.util.List;

//Reuse the same code with different inputs

public class GenericsInMethod {
    public static void main(String[] args) {

        print(101, "Welcome");
        print("Justin", 33);
        print(55.4, "Zayn");
        //
        List<Integer> intList = new ArrayList<>();
        intList.add(101);
        intList.add(102);
        intList.add(103);
        print(intList);

        List<String> strList = new ArrayList<>();
        strList.add("justin");
        strList.add("Zayn");
        strList.add("Drake");
        print(strList);
    }

    private static <T, U> T print(T t, U u) {
        System.out.print(t + " ");
        System.out.println(u);
        return t;
    }

    private static void print(List<?> list) {
        System.out.println(list);
    }
}
