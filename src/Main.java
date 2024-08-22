import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("ingrese la cantidad que desea apostar");
        int apos = scanner.nextInt();
        int sur;
        int i=0;
        do {
            System.out.println("esta partida es la numero "+i);
            sur = random.nextInt(1,4);
            if(sur==1) {
                System.out.println("felicidades ganaste el doble de lo que apostaste");
                apos = apos * 2;
                System.out.println("saldo actual " + apos);
                System.out.println("   ");
                i++;
                Thread.sleep(2000);
                //se implemento la line de codigo Thread.sleep(2000); para realizar una pausa
                //en este caso de dos segundos y tambien por correcion del programa se agrego
                //throws InterruptedException para su correcto funcionamiento
            }
            else if(sur==2){
                System.out.println("opps perdiste la mitad de lo qeu apostaste");
                apos=apos/2;
               System.out.println("saldo actual "+apos);
                System.out.println("   ");
                i++;
               Thread.sleep(2000);
            }
            else if(sur==3){
                System.out.println("lo siento perdite todo");
                apos=0;
                System.out.println("saldo actual "+apos);
                System.out.println("gracias por jugar");
                System.out.println("   ");
                i++;
                Thread.sleep(2000);

            }
        }while(sur!=3);
    }
}