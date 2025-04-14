
/* 📌 10. RETO 30 DÍAS ABRIL: DIA 10 | COOKIES SUPER RICAS S.A-----------------------------------------
Una tienda de galletas artesanales vende al por mayor en su página web. Cada caja de galletas cuesta 6€. Solicita 
la cantidad de cajas de galletas en cada venta y dependiendo de la cantidad introducida se realizan los siguientes 
pasos:
Si la cantidad de cajas de galletas vendidas es menor a 5: no se permiten compras inferiores a 5 cajas de galletas.
Si la cantidad de cajas de galletas es mayor o igual a 5, pero menor a 15: los gastos de envío son de 10€.
Si la cantidad de cajas de galletas es mayor a 15: El envío es gratuito.

Promociones:
Si el precio total es inferior a 120€ no hay promociones.
Si el precio total supera los 120€ pero es menor a 250€: Tiene un descuento del 5%.
Si el precio total supera los 250€: Tiene un descuento del 10%.

Muestra al cliente un mensaje por pantalla según la cantidad de cajas de galletas que quiera comprar:
Número total de cajas a comprar.
Total € de la compra.
Gastos de envío (si los tiene o si es gratuito)
Descuento por compra (Indicar al cliente cuántos € falta para entrar en una promoción si la compra es <100€ o el 
importe de descuento generado si es superior)  */
import java.util.InputMismatchException;
import java.util.Scanner;

public class reto10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nmCajas;
        int gastosEnvio = 0;
        double precioTotal;
        double promo;

        while (true) {
            try {
                System.out.print("Introduce un número de cajas: ");
                nmCajas = sc.nextInt();

                if (nmCajas < 5) {
                    System.out.println("No se permiten compras inferiores a 5 cajas de galletas");
                    sc.nextLine();
                    continue;
                } else if (nmCajas >= 5 || nmCajas < 15) {
                    gastosEnvio = 10;
                    System.out.println("Número total de cajas a comprar: " + nmCajas);
                    System.out.println("Gastos de envío: " + gastosEnvio + "€");
                } else {
                    System.out.println("Número total de cajas a comprar: " + nmCajas);
                    System.out.println("Gastos de envío: " + gastosEnvio + "€");
                }

                break;
            } catch (InputMismatchException e) {
                System.out.println("El dato introducido no es un número, inténtalo de nuevo.");
                sc.nextLine();
            }
        }
        precioTotal = nmCajas * 6;
        if (precioTotal >= 120 && precioTotal < 250) {
            precioTotal = (precioTotal * 0.95) + gastosEnvio;
            System.out.println("Total de la compra: " + String.format("%.2f", precioTotal) + "€");
        } else if (precioTotal >= 250) {
            precioTotal = (precioTotal * 0.90) + gastosEnvio;
            System.out.println("Total de la compra: " + String.format("%.2f", precioTotal) + "€");
        } else {
            System.out.println("Total de la compra: " + String.format("%.2f", precioTotal) + "€");
        }

        if (precioTotal < 120) {
            promo = 120 - precioTotal;
            System.out.println(
                    "Te faltan" + String.format("%.2f", promo) + " para llegar a una promoción del 5% de descuento");
        } else if (precioTotal < 250) {
            promo = 250 - precioTotal;
            System.out.println(
                    "Te faltan" + String.format("%.2f", promo) + " para llegar a una promoción del 10% de descuento");
        } else {
            System.out.println("Tienes el máximo de promociones");
        }
    }
}
