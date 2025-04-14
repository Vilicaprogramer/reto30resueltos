
/*  El programa elige una palabra secreta (por ejemplo, "programar"). El usuario tiene 5 intentos para adivinar la 
palabra. En cada intento, el programa compara la palabra introducida por el usuario con la palabra secreta. 
Si son iguales, muestra un mensaje de felicitación y termina.
Si no son iguales, indica cuántos intentos le quedan.
Si se agotan los intentos sin adivinar, muestra la palabra secreta y un mensaje de "¡Game Over!".  */
import java.util.Random;
import java.util.Scanner;

public class reto11 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        String[] palabras = { "Algoritmo", "Variable", "Función", "Condicional", "Bucle", "Clase", "Objeto",
                "Compilador",
                "Sintaxis", "Depuración", "Código", "Script", "Parámetro", "Retorno", "Array", "Iteración", "Herencia",
                "Interfaz",
                "Framework", "Repositorio" };
        int rdm = rd.nextInt(20);
        String palabra_oculta = palabras[rdm];
        int count = 1;
        System.out.println("Introduce tu predicción: ");
        String palabra_usuario = sc.nextLine();

        while (count < 5) {
            if (palabra_oculta != palabra_usuario) {
                System.out.println("Vuelvelo a intentar te quedan " + (5 - count) + " intentos: ");
                palabra_usuario = sc.nextLine();
                count += 1;
            } else {
                break;
            }
        }

        if (count == 5) {
            System.out.println("GAME OVER");
        } else {
            System.out.println("¡¡¡FELICIDADES LO CONSEGUISTE!!!");
            System.out.println(count);
        }

    }
}
