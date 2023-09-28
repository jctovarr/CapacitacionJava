package cursojava.paquet1;

public class Casa {
    public int habitacion = 4;
    public int focos = 8;
    public int sillas = 4;
    public  int ventanas = 4;
    public int puertas= 4;
    public int mesa = 1;

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

    public String cocina(){
        return "Comer";
    };
}
