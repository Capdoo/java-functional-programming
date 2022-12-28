package es.rafael.funtional.v04_superfunctions_generics.interfaces;

public interface BinaryFunction<T, U, R> {
    R apply(T value1, U value2);
}
