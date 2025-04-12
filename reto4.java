import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class reto4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * Reto 4 abril - Boom
         * Enunciado
         * Como dice la señora del famoso meme (link), un día estalló la guerra. Haz un
         * programa que, dado un número
         * que se pasa por entrada, haga una cuenta atrás y acabe con un ¡BOOM!.
         * 
         * Ejemplo
         * Entrada
         * 
         * 5
         * 
         * Salida
         * 
         * 5 4 3 2 1 ¡BOOM!
         */

        System.out.println("Introduce un número para comenzar la cuenta atrás: ");
        int nm = scanner.nextInt();

        for (int i = nm; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("BOOM!!!");
    }
}
