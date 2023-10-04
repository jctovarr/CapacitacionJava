package ejerciciodos;

import java.util.function.*;

public class Ejercicio {
    public static void main(String[] args){
        Persona persona = new Persona();
        Persona persona2 = new Persona();
        persona.setEdad(29);
        persona.setApellido("Tovar");
        persona.setNombre("Juan");

        Predicate<Persona> predicate = p -> p.getEdad() > 3;
        System.out.println(predicate.test(persona));

        Function<Persona,Integer> function = Persona::getEdad;
        System.out.println(function.apply(persona));

        Supplier<String> regresa = () -> persona.getNombre();
        System.out.println(regresa.get());

        BiConsumer<Persona, String> consumer = (p, string) -> System.out.println(persona.getApellido()+string);
        consumer.accept(persona,"Hola");

        BiPredicate<Persona, Persona> condicion = (p,a) -> p.getEdad()>1 && a.getEdad()<=29;
        if (condicion.test(persona,persona2)) {
            System.out.println("Esta dentro de la edad");
        }

        Consumer<Persona> personaconsumer = p ->System.out.println(persona.getNombre());
        personaconsumer.accept(persona);

        BiFunction<Persona, Integer, Object> bifunction = (f, g) -> persona.getEdad() * persona.getEdad();
        System.out.println(bifunction.apply(persona,20));

        BiFunction<Integer, Double, String> biFunction = (a, b) -> {
            double result = a * b;
            String s = "The result from the BiFunction is: " + result;
            return s;
        };

        String output = biFunction.apply(10, 15.5);
        System.out.print(output);



        /*Supplier<Integer> supplier=()->2; //No tiene parametro pero devuelve un valor
        System.out.println(supplier.get());
        Function<Integer,Integer> function=numero->numero*2; //recibe un parametro y devuelve un valor
        System.out.println(function.apply(2));
        Consumer<String> consumer=nombre->System.out.println(nombre); //Acepta un valor pero no devuelve valor
        consumer.accept("Fer");*/
    }
}
