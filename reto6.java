import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class reto6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * Reto 6 abril - Cajero del Mercadona
         * Enunciado
         * Juan está trabajando en un mercadona en el que no hay cajero automático, él
         * siempre calcula el cambio de los
         * clientes de cabeza. ¿Se te ocurre alguna forma de hacerle la vida más
         * sencilla al pobre chaval?
         * 
         * Crea un programa que: Reciba la cantidad de dinero (double) que el usuario ha
         * entregado para pagar.
         * 
         * Compare la cantidad entregada con el precio del producto y calcule la
         * diferencia.
         * 
         * Súmale el IVA porque esto es españa, redondeado a dos décimas (+21%)
         * 
         * Devuelva el valor utilizando la menor cantidad de billetes y monedas posibles
         * siendo estos billete de 500 €,
         * billete de 200 €, billete de 100 €, billete de 50 €, billete de 20 €, billete
         * de 10 €, billete de 5 €,
         * moneda de 2 €, moneda de 1 €, moneda de 50 cnts, moneda de 20 cnts, moneda de
         * 10 cnts, moneda de 2 cnts y
         * moneda de 1 cnt.
         * 
         * Pero cuidado, si un cliente intenta pagar con menos dinero del necesario…
         * ¡tendrás que avisarle antes de
         * que se lleve el producto gratis!
         */
        System.out.println("Cuanto me vas a pagar? ");
        int pago = scanner.nextInt();
        System.out.println("Que precio tiene el producto?");
        double precio_producto = scanner.nextDouble();
        precio_producto = precio_producto * 1.21;
        double vueltas = pago - precio_producto;

        if (vueltas < 0) {
            System.out.println("Falta dinero");
        } else if (vueltas == 0) {
            System.out.println("Ahi tiene su pedido grácias y vuelva pronto");
        } else {
            System.out.format("%.2f", vueltas);
            System.out.println(" ");
            int billetes[] = { 500, 200, 100, 50, 20, 10, 5, 2, 1 };
            double monedas[] = { 0.5, 0.2, 0.1, 0.02, 0.01 };
            System.out.println("Los billetes que tienes que dar al cliente son: ");
            while (vueltas > 0) {
                if (vueltas >= 1) {
                    for (int i = 0; i < billetes.length; i++) {
                        if (vueltas >= billetes[i]) {
                            System.out.println(billetes[i]);
                            vueltas = vueltas - billetes[i];
                        }
                    }
                } else {
                    for (int i = 0; i < monedas.length; i++) {
                        if (vueltas >= monedas[i]) {
                            System.out.println(monedas[i]);
                            vueltas = vueltas - monedas[i];
                        }
                    }

                }
            }
        }

    }
}