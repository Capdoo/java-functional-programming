package es.rafael.finterface;

import es.rafael.lambdas.interfaces.Operacion;

public class FuncInterApp {

    private double operar(double n1, double n2) {
        Operacion op = (x, y) -> x + y;
        return op.operate(n1,n2);
    }

    public static void main(String[] args) {
        FuncInterApp app = new FuncInterApp();
        double rpta = app.operar(2,3);
        System.out.println(rpta);
    }


}
