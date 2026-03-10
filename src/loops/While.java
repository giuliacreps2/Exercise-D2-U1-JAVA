package loops;
import java.util.Scanner;

public class While {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        while(true){
            System.out.println("Inserisci una parola e ti farò lo spelling; inserisci :q per interrompere");
            String parola = scanner.nextLine();
           /* char[] caratteri = parola.split();
            for (int i = 0; i < caratteri.length; i++) {
                System.out.println(caratteri[i]);
            }
            if(parola.equals(":q") ) break;*/
        }

    }
}
