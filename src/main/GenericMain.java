package main;

public class GenericMain {

    public static void main(String[] args) {

        IntegerCounter intCounter = new IntegerCounter(1);
        intCounter.print();

        DoubleCounter doubleCounter = new DoubleCounter(1.0);
        doubleCounter.print();
    }
}
