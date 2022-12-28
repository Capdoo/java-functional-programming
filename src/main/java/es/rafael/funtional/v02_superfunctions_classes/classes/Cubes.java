package es.rafael.funtional.v02_superfunctions_classes.classes;

import es.rafael.funtional.v02_superfunctions_classes.interfaces.Function;

public class Cubes implements Function {
    @Override
    public Integer apply(Integer value) {
        return value*value*value;
    }
}
