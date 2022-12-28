package es.rafael.funtional.v04_superfunctions_generics;

import es.rafael.funtional.v04_superfunctions_generics.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class Superfunctions {

    //1
    public static <T> List<T> provide(int size, Provider<T> provider){
        List<T> res = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            res.add(provider.get());
        }
        return res;
    }

    //2
    public static <T> List<T> filter(List<T> values, Predicate<T> predicate){
        List<T> res = new ArrayList<>();
        for (T p:values) {
            if(predicate.test(p)){
                res.add(p);
            }
        }
        return res;
    }

    //3
    public static <T,R> List<R> transform(List<T> values, Function<T,R> function){
        List<R> res = new ArrayList<>();
        for (T p:values) {
            res.add(function.apply(p));
        }
        return res;
    }

    //4 CONSUMER
    public static <T> List<T> consume1(List<T> values, MyConsumer<T> myConsumer){
        for(T p:values){
            myConsumer.accept(p);
        }
        return values;
    }

    //4 CONSUMER
    public static <T> void consume2(List<T> values, MyConsumer<T> myConsumer){
        for(T p:values){
            myConsumer.accept(p);
        }
    }

    public static <T> T reduce(List<T> values, T identity, OperatorBinary<T> binaryFunction){
        T total = identity;
        for(T p:values){
            total = binaryFunction.apply(total, p);
        }
        return total;
    }

}
