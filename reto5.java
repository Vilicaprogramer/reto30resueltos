import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class reto5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * Reto 5 abril - ¡Exclamaciones
         * Enunciado
         * Jordi nunca se acuerda de abrir las exclamaciones. Él dice que es porque en
         * catalán no se abren las exclamaciones, pero yo creo que simplemente no sabe
         * escribir. Vamos a crear un programa que asegure que hay tantos abrir
         * exclamación (¡) como cerrar exclamación (!) para flamearlo.
         * 
         * Ejemplo
         * Entrada
         * 
         * ¡¡¡Caramba!!! Hola!
         * 
         * Salida
         * 
         * Si No
         */
        System.out.println("Introduce la frase: ");
        String frase = scanner.nextLine();
        String[] fraseCortada = frase.split(" ");

        for (int i = 0; i < fraseCortada.length; i++) {
            if (fraseCortada[i].endsWith("!") && fraseCortada[i].startsWith("¡")) {
                System.out.print("Si ");
            } else if (fraseCortada[i].endsWith("!") && !fraseCortada[i].startsWith("¡")) {
                System.out.print("No ");
            } else {
                System.out.print("No es necesario ");
            }
        }
    }
}