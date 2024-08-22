//Deivid Andres Real Franco
//22/08/2024
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ingrese la cantidad que desea apostar");
        int apos = scanner.nextInt();
        int sur;
        int i = 1;
        do {
            System.out.println("Partida número " + i);
            sur = random.nextInt(1,4);
            if (sur == 1) {
                System.out.println("¡Felicidades!, ganaste el doble de lo que apostaste.");
                apos = apos * 2;
                System.out.println("Saldo actual: " + apos);
            } else if (sur == 2) {
                System.out.println("¡Oops!, perdiste la mitad de lo que apostaste.");
                apos = apos / 2;
                System.out.println("Saldo actual: " + apos);
            } else if (sur == 3) {
                System.out.println("Lo siento, perdiste todo.");
                apos = 0;
                System.out.println("Saldo actual: " + apos);
                System.out.println("Gracias por jugar.");
                break;
            }
            if (apos > 0) {
                System.out.println("¿Quiere seguir apostando? (Y/N)");
                String con = scanner.next();
                if (con.equalsIgnoreCase("N")) {
                    System.out.println("Gracias por jugar. Que tenga un buen día.");
                    break;
                } else {
                    System.out.println("Perfecto, sigamos jugando.");
                }
            } else {
                System.out.println("No tienes saldo suficiente para seguir apostando.");
                break;
            }
            i++;
        } while (true);
        scanner.close();
    }
}