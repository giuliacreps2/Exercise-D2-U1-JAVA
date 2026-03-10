package conditionals;
import java.util.Scanner;

public class IfElseEs1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una parola");

        String stringaPariDispari = scanner.nextLine();
        System.out.println(stringaPariDispari);

        int numeroLettere = stringaPariDispari.length();
        System.out.println(numeroLettere);

        if ( numeroLettere % 2 == 0){
            System.out.println("La parola è pari");
        } else{
            System.out.println("La parola è dispari");
        }

    }
}


//Notazione Integer.parseInt trasforma la stringa "234" in numeri 234 ma
// non dà la lunghezza della parola