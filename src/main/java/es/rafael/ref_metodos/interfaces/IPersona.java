package es.rafael.ref_metodos.interfaces;

import es.rafael.lambdas.interfaces.PersonaA;
import es.rafael.ref_metodos.Persona;

@FunctionalInterface
public interface IPersona {

    Persona crear(int id, String nombre);

}
