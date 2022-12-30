package es.rafael.lambdas;

import es.rafael.lambdas.interfaces.Operacion;

public class Sintaxis {

    public double probarSintaxis(){
//        Operacion operacion = (double x, double y) -> (x+y)/2;
//        Operacion operacion = (double x, double y) -> { return  (x+y)/2; };
//        Operacion operacion = (double x, double y) -> {
//            double a = 2.0;
//            System.out.println(a);
//            return (x+y)/2 + a;
//        };
//        Operacion operacion = (x,y) -> (x+y)/2;
//        Operacion operacion = () -> 12;
        Operacion operacion = (x,y) -> {
            int a = 2;
            int b = 3;
            return x+y;
        };
        return operacion.operate(2,2);
    }

    public static void main(String[] args) {
        Sintaxis sintaxis = new Sintaxis();
        double a = sintaxis.probarSintaxis();
        System.out.println(a);
    }

}
