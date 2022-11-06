package main;

import java.util.ArrayList;

public class GenericMain {

    public static void main(String[] args) {

//        IntegerCounter intCounter = new IntegerCounter(1);
//        intCounter.print();
//
//        DoubleCounter doubleCounter = new DoubleCounter(1.0);
//        doubleCounter.print();

        Counter<Integer> iCounter = new Counter<>(1);
        iCounter.print();

        Counter<Double> dCounter = new Counter<>(1.0);
        dCounter.print();

        Counter<String> strText = new Counter<>("Justin");
        strText.print();

        ArrayList<Object> intList = new ArrayList<>();
        intList.add("Zayn");
        intList.add(101);
        System.out.println(intList);

        Integer i = (Integer) intList.get(1);
        System.out.println(i);
    }
}
