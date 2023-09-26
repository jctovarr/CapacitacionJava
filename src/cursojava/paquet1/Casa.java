package cursojava.paquet1;

public class Casa {
    public int habitacion = 4;
    public int focos = 8;
    public int sillas = 4;
    public  int ventanas = 4;
    public int puertas= 4;

    public static void main(String[] args){
        Casa casa = new Casa();
        System.out.println(casa.habitacion);

        String lavadero = cuartolavado();
        System.out.println(lavadero);
    }

    static String cocina(){
        return "Comer";
    }

    static String baño() {
        return "bañarse";
    }

    static String patio() {
        return "jugar";
    }

    private static String cuartolavado(){
        return "lavar";
    }

    public static String recamra(){
        return "dormir";
    }
}
