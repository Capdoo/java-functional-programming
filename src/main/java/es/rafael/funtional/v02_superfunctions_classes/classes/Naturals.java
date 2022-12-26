package es.rafael.funtional.v02_superfunctions_classes.classes;

import es.rafael.funtional.v02_superfunctions_classes.interfaces.Provider;

import java.util.Random;

public class Naturals implements Provider {

    private static int next  = 1;
    Random random = new Random();
    @Override
    public Integer get() {
        return next++;
    }
}
