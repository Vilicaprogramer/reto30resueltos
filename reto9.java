/* Los alumnos de Prometeo que cursan DAM/DAW + Master andan muy liados y no tienen claro cuando tienen clase y 
cuando no. 

Haz un programa que les indique si tienen clase de FP, de Máster, o de las dos en un conjunto de fechas dado. El 
usuario introduce un número N, que indica el número de días que quiere ver, se deberá imprimir el número del día, 
si no tienen nada en esa fecha, FP si tiene clase de un módulo de DAM/DAW o Máster si ese día tiene clase de máster. 
Los días múltiplos de 3 tienen clase de FP.
Los días múltiplos de 5, de máster.
Los días que son múltiplos de 3 y 5 tienen clase de las dos.

Ejemplo de entrada:
---------------------------------
15

Ejemplo de salida:
---------------------------------
1
2
FP
4
Máster
FP
7
8
FP
Máster
11
FP
13
14
FP + Máster */

import java.util.InputMismatchException;
import java.util.Scanner;

public class reto9 {
    public static void main(String[] args) {
        int fecha = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Introduce una fecha (1 - 31): ");
                fecha = sc.nextInt();

                if (fecha <= 0 || fecha > 31) {
                    System.out.println("El dato no está en el rango permitido, intentalo de nuevo.");
                    continue;
                }

                break;
            } catch (InputMismatchException e) {
                System.out.println("El dato introducido no es un número, inténtalo de nuevo.");
                sc.nextLine();
            }
        }
        
        for (int i = 1; i <= fecha; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FP + Máster");
            } else if (i % 3 == 0) {
                System.out.println("FP");
            } else if (i % 5 == 0) {
                System.out.println("Máster");
            } else {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
