package ejerciciodos;

import java.util.function.*;

public class Ejercicio {
    public static void main(String[] args){
        Persona persona = new Persona();
        Persona persona2 = new Persona();
        persona.setEdad(29);
        persona.setApellido("Tovar");
        persona.setNombre("Juan");
        persona2.setEdad(18);

        Predicate<Persona> predicate = p -> p.getEdad() > 3;
        System.out.println(predicate.test(persona));

        Function<Persona,Integer> function = Persona::getEdad;
        System.out.println(function.apply(persona));

        Supplier<String> regresa = () -> persona.getApellido();
        System.out.println(regresa.get());

        BiConsumer<Persona, String> consumer = (p, string) -> System.out.println(p.getNombre()+string);
        consumer.accept(persona," - Hola");

        BiPredicate<Persona, Persona> condicion = (p,a) -> p.getEdad()>1 && a.getEdad()<=29;
        if (condicion.test(persona,persona2)) {
            System.out.println("Esta dentro de la edad");
        }

        Consumer<Persona> personaconsumer = p ->System.out.println(p);
        personaconsumer.accept(persona);

        BiFunction<Persona, Persona, Integer> bifunction = (f, g) -> f.getEdad()*g.getEdad();
        System.out.println(bifunction.apply(persona,persona2));
    }
}
