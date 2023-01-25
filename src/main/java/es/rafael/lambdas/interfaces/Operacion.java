package es.rafael.lambdas.interfaces;

//La interfaz funcional NO puede tener mas de un metodo definido
@FunctionalInterface
public interface Operacion {
    double operate(double numberA, double numberB);
    //double operate2();
    //int operate2();
}
