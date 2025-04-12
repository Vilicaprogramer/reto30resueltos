
/* Reto 8 abril - El Robot de Saludos Personalizados
Enunciado
Escribe un programa que le pregunte al usuario su nombre. Si el nombre comienza con la letra "A" 
(mayúscula o minúscula), el robot responderá con un saludo entusiasta como: ¡Hola, Asombroso/a 
"Nombre"!. Si el nombre tiene más de 7 letras, el robot dirá: ¡Vaya, "Nombre", ¡qué nombre tan 
largo y sofisticado!. Para cualquier otro nombre, el robot simplemente dirá: Saludos, "Nombre".

¡Prepara al robot para todo tipo de nombres! Como un saludo especial a un nombre que empiece por 
A y tenga 7 letras, o que cuente un chiste si saluda a Jaimito... */
import java.util.Scanner;

public class reto8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nm = sc.nextLine().toLowerCase();

        if (nm.startsWith("a") && nm.length() > 7) {
            System.out.println("¡Vaya, Asombroso/a " + nm + "! ¡qué nombre tan largo y sofisticado!");
        } else if (nm.length() > 7) {
            System.out.println("¡Vaya, " + nm + ", ¡qué nombre tan largo y sofisticado!");
        } else if (nm.startsWith("a")) {
            System.out.println("¡Hola, Asombroso/a " + nm + "!");
        } else if (nm == "Jaimito") {
            System.out.println(
                    "Si un carnívoro muere, entonces se reencarna.\nSi un vegetariano muere, ¿Entonces se reenverdura?");
        } else {
            System.out.println("Saludos" + nm);
        }
        sc.close();
    }

}
