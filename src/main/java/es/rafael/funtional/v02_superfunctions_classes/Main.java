package es.rafael.funtional.v02_superfunctions_classes;

import es.rafael.funtional.v02_superfunctions_classes.classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main(){

        // 1. Create list numbers
        //List<Integer> numbers = Superfunctions.provide(10, new MyRandom());
        List<Integer> numbers = Superfunctions.provide(4, new Naturals());

        System.out.println(numbers);

        //2. Get/Filter only even/odd
        List<Integer> filters = Superfunctions.filter(numbers,new OnlyEvens());
        System.out.println(filters);

        //3. Square each number
        //List<Integer> squares = Superfunctions.transform(filters, new Square());
        List<Integer> transformed = Superfunctions.transform(filters, new Square());
        System.out.println(transformed);

        //4.a. Show each squares and return List
        List<Integer> result = Superfunctions.doAction(transformed, new Printer());

        //4.b. Show each squares only
        Superfunctions.consume(transformed, new Printer());

        //Get sum of squares
        //int total = Superfunctions.reduce(result, 0, new Adder());
        int total = Superfunctions.reduce(result, 1, new Multiplier());


        System.out.println("Reduction:"+total);
    }


//    private List<Integer> createList() {
//        //return Arrays.asList(0,1,2,3,5,8,13,21,34,55,89,144);
//        //Inmutable list
//        return List.of(0,1,2,3,5,8,13,21,34,55,89,144);
//    }
//
//    private List<Integer> filterNumbers(List<Integer> numbers) {
//        List<Integer> res = new ArrayList<>();
//        for(Integer p: numbers){
//            if(p % 2 == 0){
//                res.add(p);
//            }
//        }
//        return res;
//    }

    private List<Integer> squareNumbers(List<Integer> evens) {
        List<Integer> res = new ArrayList<>();
        for(Integer p: evens){
            res.add(p*p);
        }
        return res;
    }

    private List<Integer> showList(List<Integer> squares) {
        for(Integer p: squares){
            System.out.println(p);
        }
        return squares;
    }

    private int sumSquares(List<Integer> shown) {
        int total = 0;
        for(Integer p: shown){
            total += p;
        }
        return total;
    }

}
