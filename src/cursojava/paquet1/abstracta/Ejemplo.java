package cursojava.paquet1.abstracta;

public class Ejemplo extends Abstracta implements Intefaz{
    @Override
    public void saludar(){
        System.out.println("Hola");
    }
    public static void main(String[] args){
        Ejemplo ejemplo = new Ejemplo();
        Intefaz intefaz = new Ejemplo();
        ejemplo.despedirse();
        /**
         * Cuando se madna a llamar un metodo en comun con una clase abstracta
         * y una interfaz , se manda a llamar al metodo de la clase abstracta,
         * dado que la clase abstracta sobreescribir el metodo de la interfaz
         */
    }
}
/*
* Alta cohesion y bajo acoplamiento
*/