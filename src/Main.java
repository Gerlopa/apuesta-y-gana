//Deivid Andres Real Franco
//22/08/2024
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Ingrese la cantidad que desea apostar");
        int apos = scanner.nextInt();
        int sur;
        int i=1;
        do {
            System.out.println("partida numero "+i);
            sur = random.nextInt(1,4);
            if(sur==1) {
                System.out.println("¡Felicidades!,ganaste el doble de lo que apostaste");
                apos = apos * 2;
                System.out.println("saldo actual " + apos);
                System.out.println("   ");
                i++;
                Thread.sleep(2000);
                //se implemento la linea de codigo Thread.sleep(); para realizar una pausa
                //en este caso de dos segundos pero ya que trabaja con milisegundos se coloca 2000
                // tambien por correcion del programa se agrego la linea
                //"throws InterruptedException" para su correcto funcionamiento
            }
            else if(sur==2){
                System.out.println("¡opps!,perdiste la mitad de lo que apostaste");
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