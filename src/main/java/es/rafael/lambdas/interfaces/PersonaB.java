package es.rafael.lambdas.interfaces;

public interface PersonaB {

    default public void hablar(){
        System.out.println("Saludos desde Persona B");
    }

}
