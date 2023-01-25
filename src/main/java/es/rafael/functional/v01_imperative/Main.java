package es.rafael.functional.v01_imperative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main(){

        // Create list numbers
        List<Integer> numbers = createList();
        System.out.println(numbers);

        //Get/Filter only even/odd
        List<Integer> evens = filterNumbers(numbers);
        System.out.println(evens);

        //Square each number
        List<Integer> squares = squareNumbers(evens);
        System.out.println(squares);

        //Show each squares
        List<Integer> shown = showList(squares);

        //Get sum of squares
        int total = sumSquares(shown);
        System.out.println("Suma total:"+total);
    }



    private List<Integer> createList() {
        return Arrays.asList(0,1,2,3,5,8,13,21,34,55,89,144);
        //Inmutable list: java 9
        //return List.of(0,1,2,3,5,8,13,21,34,55,89,144);
    }

    private List<Integer> filterNumbers(List<Integer> numbers) {
        List<Integer> res = new ArrayList<>();
        for(Integer p: numbers){
            if(p % 2 == 0){
                res.add(p);
            }
        }
        return res;
    }

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







