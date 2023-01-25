package es.rafael.functional.v02_superfunctions_classes.classes;

import es.rafael.functional.v02_superfunctions_classes.interfaces.Predicate;

public class OnlyOds implements Predicate {
    @Override
    public boolean test(Integer value) {
        return value % 2 != 0;
    }
}
