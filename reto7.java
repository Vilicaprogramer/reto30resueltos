import java.util.Random;

public class reto7 {
    public static void main(String[] args) throws InterruptedException {
        Random randomNumber = new Random();
        int puntos_caracol1 = 0, puntos_caracol2 = 0;
        boolean bl = true;
        System.out.println("COMIENZA LA CARRERA!!");
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("El caracol 1");
        System.out.println("C1");
        System.out.println("El caracol 2");
        System.out.println("C2");
        Thread.sleep(2000);

        while (bl == true) {
            if (puntos_caracol1 < 20 && puntos_caracol2 < 20) {
                int caracol1 = randomNumber.nextInt(5) + 1;
                int caracol2 = randomNumber.nextInt(5) + 1;
                puntos_caracol1 = puntos_caracol1 + caracol1;
                puntos_caracol2 = puntos_caracol2 + caracol2;
                System.out.println("+-".repeat(30));
                System.out.println("El caracol 1 suma " + caracol1 + " y lleva "
                        + puntos_caracol1 + " puntos");
                String camino = "==";
                System.out.println(camino.repeat(puntos_caracol1) + "C1");
                System.out.println("El caracol 2 suma " + caracol2 + " y lleva "
                        + puntos_caracol2 + " puntos");
                System.out.println(camino.repeat(puntos_caracol2) + "C2");
                System.out.println("+-".repeat(30));
                Thread.sleep(2000);
            } else {
                bl = false;
            }
        }

        if (puntos_caracol1 == puntos_caracol2) {
            System.out.println("Los caracoles han quedado empate!!!");
        } else if (puntos_caracol1 > puntos_caracol2) {
            System.out.println("El Caracol 1 es el Vencedor!!!");
        } else {
            System.out.println("El Caracol 2 es el Vencedor!!!");
        }
    }
}
