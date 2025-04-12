/*Reto 1 abril - Redondeo
Enunciado
En Grado Superior las notas se tienen que poner como un número entero, así que un día podrás ser el 
profe de entornos y podrás disfrutar del placer de poner un 7 a un estudiante con un 7,49 en el examen.

Desarrolla un algoritmo que, dado un número decimal, devuelve su resultado entero redondeado siguiendo 
estas normas: Todos los números decimales por debajo de ,5 se redondean a la baja. Los que tengan decimales 
desde ,5 a superior, se redondean al alza.

Ejemplo
Si el usuario introduce 4,49, el programa debe devolver un 4
Si el usuario introduce 9,5 el programa debe devolver un 10 */

import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class reto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la nota: ");
        double nota = scanner.nextDouble();
        int parteEntera = (int) nota;

        if ((nota % parteEntera) < 0.5) {
            System.out.println(parteEntera);
        } else {
            System.out.println(parteEntera + 1);
        }
    }
}