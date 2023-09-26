package cursojava.paquet1;

public class Habitacion extends Casa {

    public static void main(String[] args) {
        Habitacion habitacion = new Habitacion();

        String baño = baño();
        System.out.println(baño);


    }

    @Override
    public String cocina() {
        return "cenar";
    }

}

