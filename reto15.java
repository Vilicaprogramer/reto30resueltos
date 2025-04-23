
/* Resulta que nos piden que programemos un validador de contraseñas. Algo fácil para los alumnos de Prometeo. 
Solo tenemos que decir si, una contraseña introducida por terminal es válida o no. 
Para que una contraseña sea válida debe:
Tener al menos 8 caracteres.
Tener al menos una letra minúscula.
Tener al menos una letra mayúscula.
Tener al menos un número.
Tener al menos un símbolo especial  de entre los siguientes *, ?, !, ^, “, $.
No contener la palabra GIT, en ningún formato (ni GIT, ni git, ni gIt, ni giT, ni Git, ni GIt, ni gIT, ni GiT). 
Odiamos Git. */
import java.util.Scanner;

public class reto15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean minusculas = false;
        Boolean mayusculas = false;
        Boolean numero = false;
        Boolean simbolo = false;
        String[] simbolo_especial = { "*", "?", "!", "^", "“", "$" };

        while (true) {
            System.out.println("Introduce tu contaseña:");
            String password = sc.nextLine();

            if (password.length() < 8) {
                System.out.println("La longitud de la contraseña debe ser de al menos 8 caracteres");
            } else {
                for (int i = 0; i < password.length(); i++) {
                    if (Character.isLowerCase(password.charAt(i))) {
                        minusculas = true;
                    } else if (Character.isUpperCase(password.charAt(i))) {
                        mayusculas = true;
                    } else if (Character.isDigit(password.charAt(i))) {
                        numero = true;
                    } else {
                        for (String s : simbolo_especial) {
                            if (password.contains(s)) {
                                simbolo = true;
                            }
                        }
                    }
                }

                if (minusculas == false) {
                    System.out.println("La contraseña debe tener al menos una letra minuscula");
                } else if (mayusculas == false) {
                    System.out.println("La contraseña debe tener al menos una letra mayuscula");
                } else if (numero == false) {
                    System.out.println("La contraseña debe tener al menos un número");
                } else if (simbolo == false) {
                    System.out.println(
                            "La contraseña debe tener al menos uno de estos simbolos especiales *, ?, !, ^, “, $.");
                } else if (password.toLowerCase().contains("git")) {
                    System.out.println("La contraseña no puede contener la git en ninguno de sus formatos");
                } else {
                    break;
                }
            }
        }
    }
}
