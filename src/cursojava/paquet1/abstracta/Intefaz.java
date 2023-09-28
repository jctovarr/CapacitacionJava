package cursojava.paquet1.abstracta;

public interface Intefaz {
    public final static String NOMBRE =  "Interfaz";
    public abstract void saludar();
    default void despedirse(){
        System.out.println("Adios");
    }
    static void despedirse2(){
        System.out.println("Adios");
    }
}
