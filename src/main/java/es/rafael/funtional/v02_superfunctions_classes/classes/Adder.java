package es.rafael.funtional.v02_superfunctions_classes.classes;

import es.rafael.funtional.v02_superfunctions_classes.interfaces.BinaryFunction;

public class Adder implements BinaryFunction {
    @Override
    public Integer apply(Integer value1, Integer value2) {
        return value1 + value2;
    }
}
