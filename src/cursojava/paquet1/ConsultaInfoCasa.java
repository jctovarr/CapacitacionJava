package cursojava.paquet1;

import cursojava.paquet1.Casa;
import sun.util.resources.cldr.yav.LocaleNames_yav;

public class ConsultaInfoCasa {

    public static void main(String[] args){
        Casa casa = new Casa();
        System.out.println(casa.cocina());

        LugarCasa lugarcasa = new LugarCasa();
        System.out.println(lugarcasa.cocina());

        Habitacion habitacion = new Habitacion();
        System.out.println(habitacion.cocina());

    }
}
