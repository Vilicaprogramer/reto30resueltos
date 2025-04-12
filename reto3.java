import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class reto3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * Reto 3 abril - El tiempo
         * Enunciado
         * Crear dos variables utilizando los objetos fecha.
         * 
         * En la primera se representa la fecha (día, mes, año) actual.
         * En la segunda se representa la fecha de nacimiento.
         * Calcular cuántos años han transcurrido entre ambas fechas y muestra su
         * resultado de maneras diferentes Día, mes y año. Hora, minuto y segundo. Día
         * de año. Día de la semana. Nombre del mes.
         * 
         * Pistas: buscar sobre el paquete java.time para para fechas y horas.
         */

        System.out.println("Introduce un año formato YYYY: ");
        int year = scanner.nextInt();
        System.out.println("Introduce un mes MM: ");
        int month = scanner.nextInt();
        System.out.println("Introduce un dia DD: ");
        int day = scanner.nextInt();

        LocalDate fechaDada = LocalDate.of(year, month, day);
        LocalDate fechaActual = LocalDate.now();
        Period tiempoTranscurrido = Period.between(fechaDada, fechaActual);
        System.out.println("Han pasado: " + tiempoTranscurrido.getYears() + " años, "
                +
                tiempoTranscurrido.getMonths() + " meses y " + tiempoTranscurrido.getDays() +
                " días.");
        System.out
                .println(
                        fechaActual.getDayOfMonth() + " de " + fechaActual.getMonth() + " de " +
                                fechaActual.getYear());
        LocalDate iniciAno = LocalDate.of(2025, 1, 1);
        Period diasAnoTranscurrido = Period.between(fechaActual, iniciAno);
        System.out.println("Han transcurrido " + diasAnoTranscurrido.getDays() +
                " días desde el inicio de año");
        System.out.println("Hoy es " + fechaActual.getDayOfWeek());
        System.out.println("Estamos en el mes de  " + fechaActual.getMonth());
    }

}
