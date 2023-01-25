package es.rafael.lambdas.interfaces;

public interface PersonaA {

    public void caminar();

    default public void hablar(){
        System.out.println("Saludos desde default A");
    }

}
