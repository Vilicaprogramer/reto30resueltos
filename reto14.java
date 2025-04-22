
/* Hoy en clase, a Federico le han dicho que las flashcards son un buen método de estudio. Pero Federico no tiene 
nada para escribir en su casa. ¿Se te ocurre alguna forma para que pueda estudiar con el método mencionado?

Pues claro que sí, vas a crear un programa que:
Almacene las flashcards en una lista (pregunta, respuesta).
Permita al usuario añadir nuevas flashcards.
Muestra una pregunta aleatoria de la lista.
Solicite una respuesta del usuario.
Compare la respuesta del usuario con la correcta.
Indique si la respuesta es correcta o incorrecta.
Permita continuar practicando o salir.

Ejemplo:
------------------------
Anverso: La programación es…
Reverso: Darle una serie de instrucciones a una máquina para que ejecute una acción específica. */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Random;

public class reto14 {
    public static void main(String[] args) {
        List<Map<String, String>> flashcardList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "¿QUE QUIERES HACER? \n 1 - Añadir una nueva flashcard \n 2 - Mostrar una pregunta aleatoria de la lista \n 3 - Salir \n Introduce el número de la opción del menú que quieres realizar: ");
            int option = sc.nextInt();
            sc.nextLine();

            if (option == 1) {
                System.out.println("Escribe la pregunta: ");
                String anverso = sc.nextLine();
                System.out.println("Escribe la respuesta: ");
                String reverso = sc.nextLine();
                Map<String, String> map = new HashMap<>();
                map.put(anverso, reverso);
                flashcardList.add(map);
            } else if (option == 2) {
                Random rdm = new Random();
                int aleatorio = rdm.nextInt(flashcardList.size());
                System.out.println(flashcardList.get(aleatorio).keySet().iterator().next());
                System.out.println("¿Cual es la respuesta?");
                String answer = sc.nextLine();
                if (answer == flashcardList.get(aleatorio)
                        .get(flashcardList.get(aleatorio).keySet().iterator().next())) {
                    System.out.println("La respuesta es correcta!!!");
                } else {
                    System.out.println("Lo siento sigue estudiando");
                }
            } else if (option == 3) {
                break;
            } else {
                System.out.println("Por favor introduce un número válido");
            }
        }
        sc.close();
    }

}
