
/* ¿Alguna vez te has levantado con la necesidad de crear un cronómetro? Tranquilo, no eres el único. Hoy vas a 
poder hacer tu sueño realidad.
Crea un programa que:
Pida al usuario que ingrese el número de segundos que desea contar.
Usa un bucle para contar desde el primer segundo hasta el número total de segundos indicado por el usuario.
Cada vez que el cronómetro llegue a 60 segundos, debe reiniciar los segundos a 0 y sumar 1 minuto.
Cuando los minutos lleguen a 60, debe reiniciar los minutos a 0 y sumar 1 hora.
El cronómetro debe mostrar el tiempo en formato hh:mm:ss, donde hh son las horas, mm los minutos y ss los segundos.

PISTA: Para que el cronómetro se actualice cada segundo, puedes utilizar la función time.sleep(1). Esto hará que el 
programa espere 1 segundo entre cada iteración del bucle, imitando el comportamiento de un cronómetro real.

Ejemplo:
-------------------------------
00:00:01
00:00:02
00:00:03
etc. */
import java.util.Scanner;

public class reto13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de segundos a contar: ");
        int nm = sc.nextInt();
        int sg = 0;
        int mn = 0;
        int hr = 0;

        for (int i = 0; i <= nm; i++) {
            sg += 1;
            if (sg == 60) {
                mn += 1;
                sg = 0;
                if (mn == 60) {
                    hr += 1;
                    mn = 0;
                }
            }
            if (sg < 10 && mn < 10 && hr < 10) {
                System.out.println("0" + hr + ":0" + mn + ":0" + sg);
            } else if (sg < 10 && mn >= 10 && hr < 10) {
                System.out.println("0" + hr + ":" + mn + ":0" + sg);
            } else if (sg >= 10 && mn < 10 && hr < 10) {
                System.out.println("0" + hr + ":0" + mn + ":" + sg);
            } else if (sg >= 10 && mn >= 10 && hr < 10) {
                System.out.println("0" + hr + ":" + mn + ":" + sg);
            } else if (sg < 10 && mn >= 10 && hr < 10) {
                System.out.println(hr + ":" + mn + ":" + sg);
            } else if (sg < 10 && mn >= 10 && hr >= 10) {
                System.out.println(hr + ":" + mn + ":0" + sg);
            } else if (sg < 10 && mn < 10 && hr >= 10) {
                System.out.println(hr + ":0" + mn + ":0" + sg);
            } else {
                System.out.println(hr + ":" + mn + ":" + sg);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("El timer ha fallado");;
            }
        }
    }
}
