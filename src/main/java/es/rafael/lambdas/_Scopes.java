package es.rafael.lambdas;

import es.rafael.lambdas.interfaces.Operacion;

public class _Scopes {

    private static double atrr1;
    private double atrr2;

    public double probarLocalVariable(){
        final double n3 = 3;
        //La clase anonima accede a las variables de clase como final o constantes
        Operacion op1 = new Operacion() {
            @Override
            public double operate(double n1, double n2) {
                //n3 = n1+n2;
                return n1+n2+n3;
            }
        };
        Operacion op2 = (x,y)->{
            double algo = n3 + 22;
            return x+y+algo;
        };

        // return op1.operate(1,1);
        return op2.operate(1,1);
    }


    // Verificar como se comportan las variables globales estaticas y no estaticas
    // Static si se puede modificar
    public double probarAtributosStaticVariables(){
        Operacion op3 = (x, y) -> {
            atrr1 = x + y;
            atrr2 = atrr1;
            return atrr2;
        };
        return op3.operate(233,23);
    }

    public static void main(String[] args) {
        _Scopes app = new _Scopes();
        System.out.println(app.probarAtributosStaticVariables() );
    }
}
