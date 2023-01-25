package es.rafael.functional.v02_superfunctions_classes.classes;

import es.rafael.functional.v02_superfunctions_classes.interfaces.BinaryFunction;

public class Multiplier implements BinaryFunction {
    @Override
    public Integer apply(Integer value1, Integer value2) {
        return value1 * value2;
    }
}
