package es.rafael.funtional.v05_flow.interfaces;

public interface BinaryFunction<T, U, R> {
    R apply(T value1, U value2);
}
