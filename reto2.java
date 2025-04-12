
/*
         * Reto 2 abril - Calendario
         * Enunciado
         * Tu misión es simple, soldado: crear un calendario que muestre todos los meses
         * del año y sus semanas de forma clara y organizada. Nada de efectos especiales
         * ni complicaciones innecesarias, solo un buen código que haga el trabajo. Crea
         * un programa que:
         * 
         * Itere los meses del año
         * Itere las semanas del mes
         * PISTA: Bucle for anidad.
         * Ejemplo
         * Enero Semana 1 Semana 2 Semana 3 …
         */
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class reto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] meses = new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo",
                "Junio", "Julio", "Agosto",
                "Septiembre", "Octubre", "Noviembre", "Diciembre" };

        for (int i = 0; i < meses.length; i++) {
            int days = 0;
            if (i == 1) {
                days = 28;
            } else if (i == 3 || i == 5 || i == 8 || i == 10) {
                days = 30;
            } else {
                days = 31;
            }
            System.out.println(meses[i]);
            for (int day = 1; day <= days; day++) {
                System.out.print(day + "\t");
                if (day % 7 == 0) {
                    System.out.println();
                }

            }
            System.out.println("\n");
        }
    }
}