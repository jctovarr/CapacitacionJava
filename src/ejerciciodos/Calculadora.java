package ejerciciodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculadora {
    public static void main(String[] args) {
        int numerouno;
        int numerodos;
        String operacion = "";
        int salida = 0;
        int seguir = 1;
        int valor = 0;

        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));

    try {
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
            System.out.println("Desición: " + seguir);

        } while (seguir != 0);
    } catch (Exception error) {
        System.out.println("No se ha introducido un valor numérico");
    }
    }
}
