package es.rafael.funtional.v02_superfunctions_classes.classes;

import es.rafael.funtional.v02_superfunctions_classes.interfaces.Provider;

import java.util.Random;

public class MyRandom implements Provider {
    Random random = new Random();
    @Override
    public Integer get() {
        return random.nextInt(1000);
    }
}
