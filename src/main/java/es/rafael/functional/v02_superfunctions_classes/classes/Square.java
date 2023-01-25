package es.rafael.functional.v02_superfunctions_classes.classes;

import es.rafael.functional.v02_superfunctions_classes.interfaces.Function;

public class Square implements Function {
    @Override
    public Integer apply(Integer value) {
        return value*value;
    }
}
