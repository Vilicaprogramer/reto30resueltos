
/* Pide al usuario que introduzca varios números enteros (uno por uno, y que indique "fin" para terminar). 
El programa debe verificar si cada número introducido es un "número de la suerte". 
Se considera un número de la suerte si es múltiplo de 7 (el resto de la división entre 7 es 0).
Por cada número de la suerte encontrado, el programa imprimirá "¡[número] es un número de la suerte!".
Al final, mostrará cuántos números de la suerte se encontraron en total.

Pista: No olvides usar el try/catch 🙂  */
import java.util.InputMismatchException;
import java.util.Scanner;

public class reto12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        while (true) {
            System.out.println("Introduce un número: ");
            entrada = sc.nextLine();
            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }
            try {
                int nm = Integer.parseInt(entrada);
                if (nm % 7 == 0) {
                    System.out.println("!" + nm + " es un número de la suerte!");

                } else {
                    System.out.println("!" + nm + " NO es un número de la suerte!");

                }
            } catch (NumberFormatException e) {
                System.out.println("Vaya lo que has introducido no es un número");

            }
        }
        sc.close();
    }

}
