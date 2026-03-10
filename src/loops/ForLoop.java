
package loops;
import java.util.Scanner;


public class ForLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero per il countdown");
        int secondi = Integer.parseInt(scanner.nextLine());
        String result = countdown(secondi);
        System.out.println(result);
        scanner.close();
    }

        public static String countdown(int n) {

            if (n < 0) {
                n = 20;
                System.out.println("numero negativo trasformato: " + n + " secondi per il lancio");
            } else if (n > 20) {
                n = 20;
                System.out.println("il numero massimo che puoi inserire è: " + n);
            } else {
                System.out.println("è tutto pronto per il countdown");
            }


            String report = "";

        for (int i = n; i > 0; i--) {
            if (i % 2 == 0) {
                report += "[OK] " + i + "\n";
            } else {
                report += "[CHECK] " + i + "\n";
            }

            if (i == 10) {
                report += "----SEPARAZIONE STADIO----";
            }
        }
         report += " --- 🚀 IGNITION --- ";
        return report;
    }
    };



/*package loops;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

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

    /*int[] numeri = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        ArrayList<Integer> numeri1 = new ArrayList<>();
        lista.add(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19);
        numeri.add(20);
        System.out.println(Arrays.toString(numeri));*/

       /* int[] arrayNumeri = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        int[] nuovoArray = new int[arrayNumeri.length + numero];*/



    /*for(int i = 0; i < nuovoArray.length; i--) {
        if (nuovoArray[i] % 2 == 0) {
                System.out.println("[OK]" + nuovoArray[i]);
            } else if (nuovoArray[i] % 2 != 0) {
             System.out.println("[CHECK]" + nuovoArray[i]);
             } else if (nuovoArray[i] == 10) {
             System.out.println("----SEPARAZIONE STADIO----");
             } else {
            System.out.println(Arrays.toString(nuovoArray));
        }
    }
    }
}
*/

        /*ogni numero pari deve mostrare
        ogni numero dispare deve mostrare [CHECK]
        Al secondo 10 deve essere inserita una riga extra "----SEPARAZIONE STADIO----"*/