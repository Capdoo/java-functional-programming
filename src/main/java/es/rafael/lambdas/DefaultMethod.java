package es.rafael.lambdas;

import es.rafael.lambdas.interfaces.PersonaA;
import es.rafael.lambdas.interfaces.PersonaB;

public class DefaultMethod implements PersonaA, PersonaB {

    @Override
    public void caminar() {
        System.out.println("Hola mundo");
    }

    @Override
    public void hablar() {
        System.out.println("Exepcion cuando una clase requiere su propia impl");
    }


    public static void main(String[] args) {
        DefaultMethod app = new DefaultMethod();
        app.caminar();
        app.hablar();
    }

}
