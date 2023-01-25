package es.rafael.lambdas;

import es.rafael.lambdas.interfaces.PersonaA;
import es.rafael.lambdas.interfaces.PersonaB;

public class DefaultMethods implements PersonaA, PersonaB {

    @Override
    public void caminar() {
        System.out.println("Hola mundo");
    }

    @Override
    public void hablar() {
        //Para usar el default method de A
        PersonaA.super.hablar();
        System.out.println("Exepcion cuando una clase requiere su propia impl");
    }

    public static void main(String[] args) {
        DefaultMethods app = new DefaultMethods();
        app.caminar();
        app.hablar();
    }

}
