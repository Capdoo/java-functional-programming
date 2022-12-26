package es.rafael.funtional.v02_superfunctions_classes;


import es.rafael.funtional.v02_superfunctions_classes.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class Superfunctions {

    public static List<Integer> provide(int size, Provider provider){
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            res.add(provider.get());
        }
        return res;
    }

    public static List<Integer> filter(List<Integer> values, Predicate predicate){
        List<Integer> res = new ArrayList<>();
        for (Integer p:values) {
            if(predicate.test(p)){
                res.add(p);
            }
        }
        return res;
    }

    public static List<Integer> transform(List<Integer> values, Function function){
        List<Integer> res = new ArrayList<>();
        for (Integer p:values) {
            res.add(function.apply(p));
        }
        return res;
    }

    public static List<Integer> doAction(List<Integer> values, MyConsumer myConsumer){
        for(Integer p:values){
            myConsumer.accept(p);
        }
        return values;
    }

    public static void consume(List<Integer> values, MyConsumer myConsumer){
        for(Integer p:values){
            myConsumer.accept(p);
        }
    }

    public static Integer reduce(List<Integer> values, Integer identity, BinaryFunction binaryFunction){
        int total = 0;
        for(Integer p:values){
            total += binaryFunction.apply(total, p);
        }
        return total;
    }

}
