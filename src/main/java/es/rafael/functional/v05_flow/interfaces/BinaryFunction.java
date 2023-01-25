package es.rafael.functional.v05_flow.interfaces;

public interface BinaryFunction<T, U, R> {
    R apply(T value1, U value2);
}
