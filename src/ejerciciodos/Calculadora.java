package ejerciciodos;

import java.util.Objects;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int numerouno = 0;
        int numerodos = 0;
        String operacion = "";
        int salida = 0;
        int seguir = 1;

        do {
            Scanner a = new Scanner(System.in);
            System.out.println("Digite el valor uno: ");
            numerouno = a.nextInt();

            Scanner b = new Scanner(System.in);
            System.out.println("Digite el valor dos: ");
            numerodos = b.nextInt();

            Scanner c = new Scanner(System.in);
            System.out.println("Digite la operación: ");
            operacion = c.nextLine();

            switch (operacion) {
                case "+":
                    salida = numerouno + numerodos;
                    break;
                case "-":
                    salida = numerouno - numerodos;
                    break;
                case "*":
                    salida = numerouno * numerodos;
                    break;
                case "/":
                    salida = numerouno / numerodos;
                    break;
            }
            System.out.println("La operación: " + numerouno + " " + operacion + " " + numerodos + " es igual a: " + salida);

            Scanner d = new Scanner(System.in);
            System.out.println("Requiere una nueva operación 1:Si / 0:No: ");
            seguir = d.nextInt();
            System.out.println("Desición: "+seguir);

        } while(seguir != 0);
    }
}
