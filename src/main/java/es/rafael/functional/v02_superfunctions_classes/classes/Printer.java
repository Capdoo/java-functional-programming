package es.rafael.functional.v02_superfunctions_classes.classes;

import es.rafael.functional.v02_superfunctions_classes.interfaces.MyConsumer;

public class Printer implements MyConsumer {
    @Override
    public void accept(Integer value) {
        System.out.println("From Printer"+value);
    }
}
