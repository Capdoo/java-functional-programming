package es.rafael.funtional.v02_superfunctions_classes.classes;

import es.rafael.funtional.v02_superfunctions_classes.interfaces.Predicate;

public class OnlyEvens implements Predicate {
    @Override
    public boolean test(Integer value) {
        return value % 2 == 0;
    }
}
