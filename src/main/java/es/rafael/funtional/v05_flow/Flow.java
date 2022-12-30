package es.rafael.funtional.v05_flow;

import es.rafael.funtional.v05_flow.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class Flow<T> {

    private final List<T> values;

    public Flow(List<T> values) {
        this.values = values;
    }

    //1
    public static <T> Flow<T> provide(int size, Provider<T> provider){
        List<T> res = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            res.add(provider.get());
        }
        return new Flow<T>(res);
    }

    //2
    public Flow<T> filter(Predicate<T> predicate){
        List<T> res = new ArrayList<>();
        for (T p:values) {
            if(predicate.test(p)){
                res.add(p);
            }
        }
        return new Flow<T>(res);
    }

    //3
    public <R> Flow<R> transform(Function<T,R> function){
        List<R> res = new ArrayList<>();
        for (T p:values) {
            res.add(function.apply(p));
        }
        return new Flow<>(res);
    }

    //4 CONSUMER
    public Flow<T> consume1(MyConsumer<T> myConsumer){
        for(T p:values){
            myConsumer.accept(p);
        }
        return new Flow<T>(values);
    }

    //4 CONSUMER
    public void consume2(MyConsumer<T> myConsumer){
        for(T p:values){
            myConsumer.accept(p);
        }
    }

    public T reduce(T identity, OperatorBinary<T> binaryFunction){
        T total = identity;
        for(T p:values){
            total = binaryFunction.apply(total, p);
        }
        return total;
    }

    @Override
    public String toString() {
        return values.toString();
    }
}
