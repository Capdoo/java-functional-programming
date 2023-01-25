package es.rafael.functional.v05_flow;

import es.rafael.functional.v05_flow.interfaces.*;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main(){

        //1. PROVIDER
        //Create list numbers
        Flow<Integer> numbers = Flow.provide(8, new Provider() {
            Random random = new Random();
            @Override
            public Integer get() {
                return random.nextInt(10);
            }
        });

        System.out.println(numbers);





        //2. PREDICATE
        //Get/Filter only even/odd
        Flow<Integer> filters = numbers.filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer value) {
                return value % 2 == 0;
            }
        });
        System.out.println(filters);




        //3. TRANSFORMER
        //3.a Square each number
        Flow<Integer> transformed = filters.transform(new OperatorUnary<Integer>() {
            @Override
            public Integer apply(Integer value) {
                return value * value;
            }
        });
        System.out.println(transformed);



        //3.b Get each number as a String
        Flow<String> convertedToString = transformed.transform(new Function<Integer, String>() {
            @Override
            public String apply(Integer value) {
                return "Valor: "+value;
            }
        });
        System.out.println(convertedToString);








        //4. CONSUMER
        MyConsumer<Integer> myConsumer = new MyConsumer<Integer>() {
            @Override
            public void accept(Integer value) {
                System.out.println(value);
            }
        };
        //4.a. Show each squares and return List
        Flow<Integer> result = transformed.consume1(myConsumer);
        //4.b. Show each squares only
        transformed.consume2(myConsumer);





        //5. REDUCE
        //Get sum of squares
        System.out.println(result);
        Integer total1 = result.reduce(0, new OperatorBinary<Integer>() {
            @Override
            public Integer apply(Integer value1, Integer value2) {
                return value1+value2;
            }
        });
        System.out.println("Reduction sum:"+total1);

    }


}
