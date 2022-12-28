package es.rafael.funtional.v03_superfuntions_inline_classes;

import es.rafael.funtional.v03_superfuntions_inline_classes.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class Superfunctions {

    //1
    public static List<Integer> provide(int size, Provider provider){
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            res.add(provider.get());
        }
        return res;
    }

    //2
    public static List<Integer> filter(List<Integer> values, Predicate predicate){
        List<Integer> res = new ArrayList<>();
        for (Integer p:values) {
            if(predicate.test(p)){
                res.add(p);
            }
        }
        return res;
    }

    //3
    public static List<Integer> transform(List<Integer> values, Function function){
        List<Integer> res = new ArrayList<>();
        for (Integer p:values) {
            res.add(function.apply(p));
        }
        return res;
    }

    //4 CONSUMER
    public static List<Integer> consume1(List<Integer> values, MyConsumer myConsumer){
        for(Integer p:values){
            myConsumer.accept(p);
        }
        return values;
    }

    //4 CONSUMER
    public static void consume2(List<Integer> values, MyConsumer myConsumer){
        for(Integer p:values){
            myConsumer.accept(p);
        }
    }

    public static Integer reduce(List<Integer> values, Integer identity, BinaryFunction binaryFunction){
        int total = identity;
        for(Integer p:values){
            total = binaryFunction.apply(total, p);
        }
        return total;
    }

}
