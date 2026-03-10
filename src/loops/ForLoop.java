package loops;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Inserisci un numero per il countdown");
    int numero = Integer.parseInt(scanner.nextLine());
    if ( numero <= -1) {
        //int positivo = Math.abs(numero);
        int positivo = 20;
        System.out.println("numero negativo trasformato: " + positivo + " secondi per il lancio");
    } else if ( numero > 20) {
        int nuovoNumero = 20;
        System.out.println("il numero massimo che puoi inserire è: " + nuovoNumero);
    } else {
        System.out.println("è tutto pronto per il countdown");
        }
    //for(int i = 0; i < numero.length; )
}
}
