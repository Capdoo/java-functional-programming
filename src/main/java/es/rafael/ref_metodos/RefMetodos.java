package es.rafael.ref_metodos;

import es.rafael.ref_metodos.interfaces.IPersona;
import es.rafael.ref_metodos.interfaces.Operacion;

import java.util.Arrays;
import java.util.Comparator;

public class RefMetodos {

    //1.
    public static void referenciarMetodoStatic(){
        System.out.println("Metodo Referido Static");
    }

    //2.
    public void referenciarMetodoInstanciaObjetoArbitrario(){
        String[] nombres = {"Mito","Code","Rafael"};

        /*
        Arrays.sort(nombres, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });*/

        /*
        Simplificado
        Arrays.sort(nombres, (s1,s2) -> s1.compareToIgnoreCase(s2));
        System.out.println(Arrays.toString(nombres));*/

        //Mas simplificado
        Arrays.sort(nombres, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(nombres));
    }

    //3.
    public void referenciarMetodoInstanciaObjetoParticular(){
        System.out.println("Metodo referido instancia de un objeto en particular");
    }

    //4.
    public void referenciarConstructor(){
        //Verboso
        IPersona iper = new IPersona(){
            @Override
            public Persona crear(int id, String nombre) {
                return new Persona(id, nombre);
            }
        };
        Persona persona1 = iper.crear(1, "Mitocode");
        System.out.println(persona1.getId()+"--"+ persona1.getNombre());

        //Simple
        IPersona iper2 = (x,y) -> (new Persona(x,y));
        Persona persona2 = iper2.crear(2, "Jimmy");
        System.out.println(persona2.getId()+"--"+persona2.getNombre());

        //Aun mas simple
        IPersona iPersona3 = Persona::new;
        Persona persona3 = iPersona3.crear(3,"Samanta");
        System.out.println(persona3.getId()+"--"+persona3.getNombre());

    }

    public void operar(){
        //Operacion op = () -> RefMetodos.referenciarMetodoStatic();
        //op.saludar();

        //Para metodos estaticos
        Operacion op2 = RefMetodos::referenciarMetodoStatic;
        op2.saludar();

    }


    public static void main(String[] args) {
        RefMetodos app = new RefMetodos();
        //app.operar();
        //app.referenciarMetodoInstanciaObjetoArbitrario();

        //Llamada a un objeto
        //Operacion op = app::referenciarMetodoInstanciaObjetoParticular;
        //op.saludar();

        //Persona
        app.referenciarConstructor();
    }

}
